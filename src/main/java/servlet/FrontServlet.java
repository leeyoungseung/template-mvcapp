package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FrontServlet extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException {
		
		String userId = req.getParameter("userId");
		if (userId == null) {
			userId = "defaultUserId";
		}
		
		String resultString = "Welcome " + userId;
		req.setAttribute("result", resultString);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/welcome.jsp");
		dispatcher.forward(req, res);
	}
	

}
