package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/IncludeServlet_01")
public class IncludeServlet_01 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=UTF-8");
		
		response.getWriter().println("<p>Main-1</p>");
				
		RequestDispatcher rd = 
				request.getRequestDispatcher("/IncludeServlet_02");
		rd.include(request, response);
	
		response.getWriter().println("<p>Main-2</p>");
	}

}







