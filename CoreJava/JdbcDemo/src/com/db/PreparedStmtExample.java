package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStmtExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		
		//1
		Class.forName("com.mysql.jdbc.Driver");
		//2
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","Tester@123");
		
		PreparedStatement pst =  con.prepareStatement("insert into employee values(?,?,?)");
		pst.setInt(1, 123691);
		pst.setString(2, "Course");
		pst.setString(3, "Founder");
		
		boolean flag = pst.execute();
		
		
		pst.setInt(1, 123692);
		pst.setString(2, "Course");
		pst.setString(3, "Founder");
		
		boolean flag2 = pst.execute();
		
		
		if(flag){
			System.out.println("data is inserted.");
		}
		con.close();
		
	}

}
