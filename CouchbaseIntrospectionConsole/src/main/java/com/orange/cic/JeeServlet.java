package com.orange.cic;

import java.util.logging.Logger;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * Servlet JEE 7
 * 
 * @author ahdi7503
 * 
 */
public class JeeServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6182107705508712417L;
	private static Logger LOGGER = Logger.getLogger(JeeServlet.class.getName());

	public void doGet(HttpServletRequest req, HttpServletResponse res) {
		String itemType = getServletConfig().getInitParameter("item");
		LOGGER.info("Appel de la Servlet JeeServlet avec le paramètre item :" + itemType);		
	}

}
