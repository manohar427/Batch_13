package com.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamDemo {

	public static void main(String[] args) throws IOException {

		//Write data in to file
		File f1 = new File("C:/Users/dell/Desktop/Temp/Stream.txt");
		FileOutputStream fos = new FileOutputStream(f1);
		
		String name = "Course Founder";
		String location = "\n Balgalore/India";
		
		byte all1[] = name.getBytes();
		byte all2[] = location.getBytes();
		fos.write(all1);
		fos.write(all2);
		
		fos.close();
		
		System.out.println("Data writing part completed!");
		
		//Read the Data
		FileInputStream fis = new FileInputStream(f1);
		
		int i=0;
		i=fis.read();
		while(  i != -1){
			System.out.print((char)i);
			i=fis.read();
		}
		fis.close();
	}

}
