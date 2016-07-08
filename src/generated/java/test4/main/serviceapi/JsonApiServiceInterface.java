package test4.main.serviceapi;

import org.springframework.security.core.context.SecurityContext;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;

public interface JsonApiServiceInterface {
	Response post(String path, SecurityContext securityContext, String jsonapiDocument);

	Response get(String path, MultivaluedMap<String, String> uriInfo, SecurityContext securityContext);

	Response patch(HttpServletRequest request, String path, SecurityContext securityContext, String jsonapiDocument);

	Response put(HttpServletRequest request, String path, SecurityContext securityContext, String jsonapiDocument);

	Response delete(String path, SecurityContext securityContext, String jsonApiDocument);
}
