/**
 * 
 */
package com.orange.cic;

import java.util.logging.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author ahdi7503
 * 
 */
@Controller
public class CouchbaseDocumentController {

	private static Logger LOGGER = Logger
			.getLogger(CouchbaseDocumentController.class.getName());

	@RequestMapping("/view")
	public @ResponseBody
	void greeting(
			@RequestParam(value = "item", required = false, defaultValue = "Document") String itemType) {
		LOGGER.info("Appel de la Servlet JeeServlet avec le paramètre item :"
				+ itemType);
	}
}
