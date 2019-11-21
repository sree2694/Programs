package com.ts.dao;

import java.sql.*;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;
import com.ts.dto.Groceries;

public class GroceriesDao {
	public static List<Groceries> getGroceriesList() throws ClassNotFoundException, SQLException{
		List<Groceries> list=new ArrayList<Groceries>();
		Connection con=DaoUtility.getConnection();
		Statement stmt=con.createStatement();  
		ResultSet rs=stmt.executeQuery("select * from groceries"); 
		Groceries g;
		while(rs.next()){
			g=new Groceries();
			g.setName(rs.getString(1));
			g.setSize(rs.getString(2));
			g.setPrice(rs.getInt(3));
			list.add(g);	
			
		}
		
		return list;
		
		
	}

}
