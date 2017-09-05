package com.db;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args)throws FileNotFoundException {
		Connection con = null;
		try {
			//1
			Class.forName("com.mysql.jdbc.Driver");
			//2
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","Tester@123");
			//3
			Statement stmt = con.createStatement();//
			//4
			ResultSet rs = stmt.executeQuery("select * from employee");
			
			//5
			while(rs.next()){
				System.out.print("EMP ID:"+rs.getString("emp_id"));
				System.out.print(" EMP FNAME:"+rs.getString("first_name"));
				System.out.print(" EMP LNAME:"+rs.getString("last_name"));
				
				System.out.println();
			}
			
			
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
			
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		catch (InsufficientStudentAgeException e) {
           e.printStackTrace();
		}
		
	}

}
