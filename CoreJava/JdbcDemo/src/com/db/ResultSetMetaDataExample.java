package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetMetaDataExample {

	public static void main(String[] args) {
 
		try {
			//1
			Class.forName("com.mysql.jdbc.Driver");
			//2
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","Tester@123");
			//3
			Statement stmt = con.createStatement();
			//4
			ResultSet rs = stmt.executeQuery("select * from employee");
			
			ResultSetMetaData rmd =  rs.getMetaData();
			
			int colCount = rmd.getColumnCount();
			
			System.out.println("COl Count:"+colCount);
			int x =1;
			while(x<=colCount){
				
				System.out.println("Col Name:"+rmd.getColumnLabel(x) +",Data type:"+rmd.getColumnTypeName(x)+",Length:"+rmd.getColumnDisplaySize(x));
				x++;
			}
			
			/*//5
			while(rs.next()){
				System.out.print("EMP ID:"+rs.getString("emp_id"));
				System.out.print(" EMP FNAME:"+rs.getString("first_name"));
				System.out.print(" EMP LNAME:"+rs.getString("last_name"));
				
				System.out.println();
			}*/
			
			
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
