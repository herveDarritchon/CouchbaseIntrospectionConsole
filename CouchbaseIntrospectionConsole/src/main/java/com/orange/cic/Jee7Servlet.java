/**
 * 
 */
package com.orange.cic;

import java.util.logging.Logger;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author ahdi7503
 * 
 */
@WebServlet(displayName = "Couchbase Introspection Console JEE 7", 
	name = "documentservlet", 
	urlPatterns = "/document/*", 
	initParams = { @WebInitParam(name = "item", value = "Document") })
public class Jee7Servlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4868341167638640448L;
	private static Logger LOGGER = Logger
			.getLogger(Jee7Servlet.class.getName());

	public void doGet(HttpServletRequest req, HttpServletResponse res) {
		String itemType = getServletConfig().getInitParameter("item");
		LOGGER.info("Appel de la Servlet JeeServlet avec le paramètre item :"
				+ itemType);
	}

}
