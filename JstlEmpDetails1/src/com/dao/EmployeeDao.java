package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.model.Employee;

public class EmployeeDao {
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/jstl", "root", "root");
	}

	public static List<Employee> getAllEmployeeDetails() throws ClassNotFoundException, SQLException {
		Connection c = EmployeeDao.getConnection();
		Statement st = c.createStatement();
		ResultSet rs = st.executeQuery("select * from emp");
		List<Employee> eList = new ArrayList<Employee>();
		Employee e = null;
		while (rs.next()) {
			e = new Employee();
			e.setId(rs.getInt(1));
			e.setName(rs.getString(2));
			e.setSal(rs.getInt(3));
			eList.add(e);
		}
		c.close();
		return eList;

	}

	public static Employee getEmployeeWithId(int id) throws ClassNotFoundException, SQLException {
		Connection c = EmployeeDao.getConnection();
		PreparedStatement st = c.prepareStatement("select * from emp where id=?");
		st.setInt(1, id);
		ResultSet rs = st.executeQuery();
		Employee e = new Employee();
		while (rs.next()) {
			e.setId(rs.getInt(1));
			e.setName(rs.getString(2));
			e.setSal(rs.getInt(3));
		}
		return e;

	}

}
