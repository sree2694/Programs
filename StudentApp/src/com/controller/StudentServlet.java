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

import com.dao.StudentDao;
import com.dto.Student;

@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String bt = request.getParameter("bt");
		if (bt.equals("AllStudents")) {
			try {
				List<Student> slist = StudentDao.getAllStudentDetails();
				request.setAttribute("sDetails", slist);
				response.setContentType("text/html");
				PrintWriter out = response.getWriter();
				out.print("Message from Servlet");
				RequestDispatcher rd = request.getRequestDispatcher("message.jsp");
				rd.forward(request, response);

			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else if (bt.equals("add")) {
			boolean b = false;

			int id = Integer.parseInt(request.getParameter("id"));
			String name = request.getParameter("name");
			String batch = request.getParameter("batch");
			int marks = Integer.parseInt(request.getParameter("marks"));
			try {
				b = StudentDao.checkdetailsbyid(id);
			} catch (ClassNotFoundException | SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			if (b == false) {
				try {
					if (StudentDao.addStudent(id, name, batch, marks) == 1)
						response.setContentType("text/html");
					PrintWriter out = response.getWriter();
					out.print("inserted successfully");
				} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else
				response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.print("Id already present");
		} else if (bt.equals("update")) {
			int id = Integer.parseInt(request.getParameter("id"));
			String name = request.getParameter("name");
			String batch = request.getParameter("batch");
			int marks = Integer.parseInt(request.getParameter("marks"));
			try {
				StudentDao.updateStudent(id, name, batch, marks);
				RequestDispatcher rd = request.getRequestDispatcher("message.jsp");
				rd.include(request, response);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else if (bt.equals("delete")) {
			int id = Integer.parseInt(request.getParameter("id"));

			try {
				if (StudentDao.deleteStudent(id) == 1)
					response.setContentType("text/html");
				PrintWriter out = response.getWriter();
				out.print("deleted succesfully");

			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}
