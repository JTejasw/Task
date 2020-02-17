package com.mits.lap.login.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.log4j.Logger;
import com.filenet.api.core.Connection;
import com.mits.lap.common.constants.NOT_AUTHENTICATEDException;
import com.mits.lap.common.util.CEUtil;
import com.mits.lap.login.dao.CELoginModuleDAO;
/**
 * Form login form getting userID, password 
 * validation of userid ,and password
 * forwarding to homepage servlet
 * or else again login form validation
 */
 @WebServlet("/ProjectLoginController")
public class CELoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	// using logs for debuge the error
	static final Logger LOGGER = Logger.getLogger(CELoginController.class);
 //using doget method calling dopost
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}
//validation of userid ,and password forwarding to homepage servlet or else again login form validation
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		LOGGER.info("in doGet method");
		LOGGER.debug("responding to client...");
		HttpSession httpSession = request.getSession();
		CEUtil CEUtil = new CEUtil();
		CELoginModuleDAO ceLoginModuleDAO=new CELoginModuleDAO();
		String userid = request.getParameter("userid");
		String password = request.getParameter("password");
		Connection connection=null;
		try {
			connection = CEUtil.getConnection(userid, password);
			   httpSession.setAttribute("userid", userid);
			   httpSession.setAttribute("password", password);
			String checkingUser = ceLoginModuleDAO.checkingUser(userid, connection);
			if ((userid != null) && (password != null)) {
				if (checkingUser.equals("success")) {
					ArrayList<String> result = ceLoginModuleDAO.gettingGroups(userid, connection);
					httpSession.setAttribute("group", result);
					RequestDispatcher requestDispatcher = request.getRequestDispatcher("HomePage.jsp");
					requestDispatcher.forward(request, response);
				} 
			}
	} catch (NOT_AUTHENTICATEDException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			PrintWriter printWriter = response.getWriter();
			printWriter.write("Sorry UserId and password has error  " +e.getMessage());
			// inculding to login html
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("projectloginform.html");
			requestDispatcher.include(request, response);
			printWriter.close();
		}
		////
	}
}
