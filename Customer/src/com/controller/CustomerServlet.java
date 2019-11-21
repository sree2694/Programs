package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.CustomerDao;
import com.model.customer;

@WebServlet("/S1")
public class CustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		String name = request.getParameter("name");
		String email = request.getParameter("E-mail");
		String password = request.getParameter("password");
		String mobile_no = request.getParameter("phno");
		String dob = request.getParameter("dob");
		Date de = Date.valueOf("dob");
		customer c = new customer(name, email, password,Long.parseLong(mobile_no),de);
		try {
			boolean flag = CustomerDao.checkEmailExistsOrNot(email);
			if(!flag) {
				int val = CustomerDao.registerCustomer(c);
				out.print(val+" :Registration Done");
			}else {
				out.print("Account Already Exists");
			}
			
		} catch (ClassNotFoundException | SQLException e ) {
			
			// TODO: handle exception
			e.printStackTrace();
		}	

	}

}
