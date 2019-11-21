package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.dto.Student;

public class StudentDao {
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
	}

	public static List<Student> getAllStudentDetails() throws ClassNotFoundException, SQLException {
		Connection c = StudentDao.getConnection();
		Statement st = c.createStatement();
		ResultSet rs = st.executeQuery("select * from student");
		List<Student> sList = new ArrayList<Student>();
		Student s = null;
		while (rs.next()) {
			s = new Student();
			s.setId(rs.getInt(1));
			s.setName(rs.getString(2));
			s.setBatch(rs.getString(3));
			s.setMarks(rs.getInt(4));
			sList.add(s);
		}
		c.close();
		return sList;

	}

	public static int addStudent(int id, String name, String batch, int marks)
			throws ClassNotFoundException, SQLException {
		Connection c = StudentDao.getConnection();
		PreparedStatement pst = c.prepareStatement("insert into student values(?,?,?,?)");
		pst.setInt(1, id);
		pst.setString(2, name);
		pst.setString(3, batch);
		pst.setInt(4, marks);
		int a = pst.executeUpdate();
		return a;

	}

	public static int updateStudent(int id, String name, String batch, int marks)
			throws ClassNotFoundException, SQLException {
		Connection c = StudentDao.getConnection();
		PreparedStatement pst = c.prepareStatement("update  student set name=?,batch=?,marks=? where id =?");
		pst.setString(1, name);
		pst.setString(2, batch);
		pst.setInt(3, marks);
		pst.setInt(4, id);
		int a = pst.executeUpdate();
		return a;
	}

	public static int deleteStudent(int id) throws ClassNotFoundException, SQLException {
		Connection c = StudentDao.getConnection();
		PreparedStatement pst = c.prepareStatement("delete from  student where id =?");
		pst.setInt(1, id);
		int a = pst.executeUpdate();
		return a;
	}

	public static boolean checkdetailsbyid(int id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection c= StudentDao.getConnection();
		PreparedStatement st=c.prepareStatement("select * from student where id=?");
		st.setInt(1, id);
		ResultSet rs=   st.executeQuery();
		Student e=null;
		while(rs.next()){
		return true;
		}
		return false;
	}
}
