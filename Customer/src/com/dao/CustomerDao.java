package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.model.customer;

public class CustomerDao {
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/customer", "root", "root");
	}

	public static boolean checkEmailExistsOrNot(String email) throws SQLException, ClassNotFoundException {
		Connection c = CustomerDao.getConnection();
		PreparedStatement st = c.prepareStatement("select * from customer where email=?");
		st.setString(1, email);
		ResultSet rs = st.executeQuery();
		while (rs.next()) {
			return true;
		}
		return false;
	}

	public static int registerCustomer(customer c) throws ClassNotFoundException, SQLException {
		Connection con = CustomerDao.getConnection();
		PreparedStatement st = con.prepareStatement("insert into customer values(?,?,aes_encrypt('password',?),?,?)");
		st.setString(1, c.getName());
		st.setString(2, c.getEmail());
		st.setString(3, c.getPassword());
		st.setLong(4, c.getMobile_no());
		st.setDate(5, c.getDob());
		return st.executeUpdate();

	}

	public static boolean loginCustomer(String email, String Password) throws ClassNotFoundException, SQLException {
		Connection c = CustomerDao.getConnection();
		PreparedStatement st = c.prepareStatement("select password from customer where email=?");
		st.setString(1, email);
		ResultSet rs = st.executeQuery();
		String pass = null;
		while (rs.next()) {
			pass = rs.getString(1);
		}

		if (pass.equals(Password)) {
			return true;

		} else
			return false;
	}
}
