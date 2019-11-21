package com.dao;

import java.sql.SQLException;

public class JdbcMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println(EmployeeDao.getAllEmployeeDetails());
	}

}
