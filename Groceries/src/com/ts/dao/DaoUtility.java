package com.ts.dao;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DaoUtility {
	public static Connection getConnection() throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mar6", "root", "root");
		return con;
		
	}

}
