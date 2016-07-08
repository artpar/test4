package test4.main.serviceimpl;

import com.yahoo.elide.Elide;
import com.yahoo.elide.ElideResponse;
import com.yahoo.elide.datastores.hibernate5.HibernateStore;
import org.hibernate.ScrollMode;
import org.hibernate.SessionFactory;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.stereotype.Service;
import test4.main.serviceapi.JsonApiServiceInterface;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import java.util.function.Function;

@Service("jsonApiService")
public class JsonApiService implements JsonApiServiceInterface {

	protected Function<SecurityContext, Object> getUser;

	// @Autowired
	protected Elide elide;

	@PersistenceContext(unitName = "test4EntityManagerFactory")
	private EntityManager entityManager;

	private static Response build(ElideResponse response) {
		return Response.status(response.getResponseCode()).entity(response.getBody()).build();
	}

	/**
	 * Dependency injection
	 */
	@PersistenceContext(unitName = "test4EntityManagerFactory")
	protected void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@PostConstruct
	public void init() {
		this.getUser = new Function<SecurityContext, Object>() {
			public Object apply(SecurityContext securityContext) {
				return "1";
			}
		};
		final SessionFactory sessionFactory = entityManager.getEntityManagerFactory().unwrap(SessionFactory.class);
		final HibernateStore dataStore = new HibernateStore.Builder(sessionFactory).withScrollEnabled(true)
				.withScrollMode(ScrollMode.SCROLL_SENSITIVE).build();

		this.elide = new Elide.Builder(dataStore).build();
	}

	@Override
	public Response post(String path, SecurityContext securityContext, String jsonapiDocument) {
		return build(this.elide.post(path, jsonapiDocument, this.getUser.apply(securityContext)));
	}

	@Override
	public Response get(String path, MultivaluedMap<String, String> queryParams, SecurityContext securityContext) {
		return build(this.elide.get(path, queryParams, this.getUser.apply(securityContext)));
	}

	@Override
	public Response patch(HttpServletRequest request, String path, SecurityContext securityContext, String jsonapiDocument) {
		return build(this.elide.patch(request.getContentType(), request.getHeader("Accept"), path, jsonapiDocument,
				this.getUser.apply(securityContext)));
	}

	@Override
	public Response put(HttpServletRequest request, String path, SecurityContext securityContext, String jsonapiDocument) {
		return build(this.elide.patch(request.getContentType(), request.getHeader("Accept"), path, jsonapiDocument,
				this.getUser.apply(securityContext)));
	}

	@Override
	public Response delete(String path, SecurityContext securityContext, String jsonApiDocument) {
		return build(this.elide.delete(path, jsonApiDocument, this.getUser.apply(securityContext)));
	}

}
