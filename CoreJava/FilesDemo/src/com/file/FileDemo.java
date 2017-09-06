package com.file;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {

		//Directory creation
		// File file = new File("C:\\Users\\dell\\Desktop\\Temp\\Abc");
		File file = new File("C:/Users/dell/Desktop/Temp/Abc");

		boolean flag = file.mkdir();

		if (flag) {
			System.out.println("Directory got created ");
		} else {
			System.out.println("Not created");
		}

		File file1 = new File("C:/Users/dell/Desktop/Temp/Xyz/Pqr");

		boolean flag1 = file1.mkdirs();

		if (flag1) {
			System.out.println("Directories got created ");
		} else {
			System.out.println("Not created");
		}
		
		//File Creation
		File file3 = new File("C:/Users/dell/Desktop/Temp/test.txt");

		boolean flag3 = file3.createNewFile();

		if (flag3) {
			System.out.println("File got created ");
		} else {
			System.out.println("Not created");
		}
	}

}
