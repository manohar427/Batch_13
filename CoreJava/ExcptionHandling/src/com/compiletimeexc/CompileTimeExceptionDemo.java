package com.compiletimeexc;

import java.io.File;
import java.io.IOException;

public class CompileTimeExceptionDemo {

	public static void main(String[] args) {

		//1
		try{
			Class.forName("com.mysql.jdbc.Driver");
			
			//2.
			File file = new File("abc.txt");
			file.createNewFile();
			
		}catch(ClassNotFoundException e){
			
		}
		catch(IOException e){
			
		}
		
	}

}
