package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.EmployeeDao;
import com.model.Employee;

public class EmployeeServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			List<Employee> empList = EmployeeDao.getAllEmployeeDetails();
			request.setAttribute("eDetails", empList);
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.print("Message from Servlet");
			RequestDispatcher rd = request.getRequestDispatcher("emp.jsp");
			rd.include(request, response);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String button = req.getParameter("bt");
		if (button.equals("GetDetails")) {
			String id = req.getParameter("i1");
			int uid = Integer.parseInt(id);
			resp.setContentType("text/html");
			PrintWriter out = resp.getWriter();
			try {
				Employee emp = EmployeeDao.getEmployeeWithId(uid);
				if (emp.getId() != 0 || emp.getName() != null) {
					req.setAttribute("eobj", emp);
				} else {
					out.print("No Details Found");
				}

				RequestDispatcher rd = req.getRequestDispatcher("emp.jsp");
				rd.include(req, resp);

			} catch (NumberFormatException | ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}

		}

	}

}
