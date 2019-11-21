package com.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Servelet2
 */
@WebServlet("/Servelet2")
public class Servelet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("<center><h1>Message from servelet<br>");
		HttpSession se=request.getSession(false);
		
	String s=	(String) se.getAttribute("name");
	String s1=(String) se.getAttribute("city");
	
	out.print("User details: <br>");
	out.print("User name:"+s+"<br>");
	out.print("City: "+s1+"<br></h1></center>");
	}


}
