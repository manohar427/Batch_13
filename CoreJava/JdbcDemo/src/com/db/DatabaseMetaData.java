package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseMetaData {

	public static void main(String[] args) {
		
		try {
			//1
			Class.forName("com.mysql.jdbc.Driver");
			//2
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","Tester@123");
			
			java.sql.DatabaseMetaData dbm =  con.getMetaData();
			
			String prodName = dbm.getDatabaseProductName();
			
			System.out.println("ProdName:"+prodName);
			System.out.println("Driver Name:"+dbm.getDriverName());
			System.out.println("User Name:"+dbm.getUserName());
			System.out.println("Driver Version:"+dbm.getDriverVersion());
			
			//tables : 
			
			String tables[] = {"TABLE"};
			ResultSet rs = dbm.getTables(null, null, null, tables);
			
			while(rs.next()){
				System.out.println(rs.getString(4));
			}
			
			
			
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		//3
	}

}
