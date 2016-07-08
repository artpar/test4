package test4.main.rest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.yahoo.elide.jsonapi.models.JsonApiDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.HandlerMapping;
import test4.main.serviceapi.JsonApiServiceInterface;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.POST;
import javax.ws.rs.core.*;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Controller
@RequestMapping("rest1")
public class JsonApiResource {

	protected Function<SecurityContext, Object> getUser;
	@Autowired
	private JsonApiServiceInterface jsonApiServiceInterface;

	private ObjectMapper objectMapper = new ObjectMapper();

	public JsonApiResource() {
	}

	@POST
	@RequestMapping(value = "**", method = RequestMethod.POST)
	public ResponseEntity post(@Context HttpServletRequest request, @RequestBody JsonApiDocument jsonapiDocument)
			throws JsonProcessingException {
		String path = getPath(request);
		return getResponseEntity(jsonApiServiceInterface.post(path, SecurityContextHolder.getContext(),
				objectMapper.writeValueAsString(jsonapiDocument)));
	}

	@RequestMapping(value = "**", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity get(@Context HttpServletRequest request) {
		String path = getPath(request);
		MultivaluedMap<String, String> queryParams = getQueryParams(request.getParameterMap());
		return getResponseEntity(jsonApiServiceInterface.get(path, queryParams, SecurityContextHolder.getContext()));
	}

	private String getPath(@Context HttpServletRequest request) {
		return (String) request.getAttribute(HandlerMapping.PATH_WITHIN_HANDLER_MAPPING_ATTRIBUTE);
	}

	ResponseEntity<JsonNode> getResponseEntity(Response response) {
        final MultiValueMap<String, String> headers = convert(response.getHeaders());
        headers.add("Content-type", "application/json");
        try {
            final Object entity = response.getEntity();
            if (entity != null) {


                final String entityString = (String) entity;
                return new ResponseEntity<JsonNode>(objectMapper.readTree(entityString), headers,
                        HttpStatus.valueOf(response.getStatus()));
            } else {
                return new ResponseEntity<>(HttpStatus.valueOf(response.getStatus()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

	private MultiValueMap<String, String> convert(MultivaluedMap<String, Object> response) {
		MultiValueMap<String, String> multivaluedMap = new HttpHeaders();
		for (Map.Entry<String, List<Object>> stringListEntry : response.entrySet()) {
			String key = stringListEntry.getKey();
			for (Object val : stringListEntry.getValue()) {
				multivaluedMap.add(key, String.valueOf(val));
			}
		}
		return multivaluedMap;
	}

	private MultivaluedMap<String, String> getQueryParams(Map<String, String[]> parameterMap) {
		MultivaluedMap<String, String> multivaluedMap = new MultivaluedHashMap<String, String>();
		for (Map.Entry<String, String[]> stringEntry : parameterMap.entrySet()) {
			for (String v : stringEntry.getValue()) {
				multivaluedMap.add(stringEntry.getKey(), v);
			}

		}

		return multivaluedMap;

	}

	@RequestMapping(value = "**", method = RequestMethod.PATCH)
	public ResponseEntity patch(@Context HttpServletRequest request, @RequestBody JsonApiDocument jsonapiDocument)
			throws JsonProcessingException {
		String path = getPath(request);
		return getResponseEntity(jsonApiServiceInterface.patch(request, path, SecurityContextHolder.getContext(),
				objectMapper.writeValueAsString(jsonapiDocument)));
	}

	@RequestMapping(value = "**", method = RequestMethod.PUT)
	public ResponseEntity put(@Context HttpServletRequest request, @RequestBody JsonApiDocument jsonapiDocument)
			throws JsonProcessingException {
		String path = getPath(request);
		return getResponseEntity(jsonApiServiceInterface.put(request, path, SecurityContextHolder.getContext(),
				objectMapper.writeValueAsString(jsonapiDocument)));
	}

	@RequestMapping(value = "**", method = RequestMethod.DELETE)
	public ResponseEntity delete(@Context HttpServletRequest request, @RequestBody JsonApiDocument jsonapiDocument)
			throws JsonProcessingException {
		String path = getPath(request);
		return getResponseEntity(jsonApiServiceInterface.delete(path, SecurityContextHolder.getContext(),
				objectMapper.writeValueAsString(jsonapiDocument)));
	}

}
