package com.Login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
   	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
   		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
	
		String age = request.getParameter("age");
		String city = request.getParameter("city");
		if(name.isEmpty()||age.isEmpty()||city.isEmpty())
		{
			RequestDispatcher rd = request.getRequestDispatcher("voter.jsp");
			out.println("<font color=red>Please fill all the fields</font>");
			rd.include(request, response);
		}
		else
		{
			RequestDispatcher rd = request.getRequestDispatcher("Form.html");
			rd.forward(request, response);
		}
	
	}

}
