package test4.main.rest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import test4.main.domain.Destination;

/**
 * Implementation of DestinationResource.
 */
@Controller
public class DestinationResource extends DestinationResourceBase {

	public DestinationResource() {
	}

	@RequestMapping(value = "/destination/form", method = RequestMethod.GET)
	public String createForm(ModelMap modelMap) {
		Destination entity = new Destination();
		modelMap.addAttribute("entity", entity);
		return "destination/create";
	}

}
