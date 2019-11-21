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
 * Servlet implementation class Servelet1
 */
@WebServlet("/Servelet1")
public class Servelet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String str= request.getParameter("action");
		PrintWriter out=response.getWriter();
		if(str.equals("Register")){
			String name=request.getParameter("t1");
			String city= request.getParameter("t2");
			out.print("Name:"+name+"   City:"+city);
			HttpSession session=request.getSession();
			session.setAttribute("name", name);
			session.setAttribute("city", city);
			if(city.toLowerCase().equals("hyd")){
				request.getRequestDispatcher("/Servelet2").include(request, response);
				
			}
			else 
				out.println("No details are present");
		}
	}

}
