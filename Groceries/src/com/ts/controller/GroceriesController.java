package com.ts.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ts.dao.GroceriesDao;
import com.ts.dto.Groceries;

@WebServlet("/GroceriesController")
public class GroceriesController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public GroceriesController() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	try {
		List<Groceries> list=GroceriesDao.getGroceriesList();
		System.out.println(list.size());
		request.setAttribute("gList",list);
		System.out.println("do get method");
		request.getRequestDispatcher("view.jsp").forward(request, response);
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println(e);
	}
		
	}


}
