package com.app;

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
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/show")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("t1");
		String age = request.getParameter("t2");
		String city = request.getParameter("t3");
		HttpSession se = request.getSession();
		se.setAttribute("n", name);
		se.setAttribute("a", age);
		se.setAttribute("c", city);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("Welcome: " + name);
		if (Integer.parseInt(age) >= 18) {
			RequestDispatcher rd = request.getRequestDispatcher("voter.jsp");
			rd.forward(request, response);
		} else {
			out.print("You are not eligible for vote<br><br>");
			RequestDispatcher rd = request.getRequestDispatcher("Form.html");
			rd.include(request, response);
		}

	}

}
