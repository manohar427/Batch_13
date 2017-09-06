package com.buffer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileBufferDemo {

	public static void main(String[] args) throws IOException {

		// Write data in to file
		File f1 = new File("C:/Users/dell/Desktop/Temp/Buffer.txt");
		FileWriter fw = new FileWriter(f1);
		BufferedWriter bw = new BufferedWriter(fw);

		String name = "Course Founder";
		String location = "Bangalore,India";

		bw.write(name);
		bw.newLine();
		bw.write(location);

		bw.close();
		fw.close();
		
		System.out.println("Data writing part is completed !");

		//Read the Data
		FileReader fr = new FileReader(f1);
		BufferedReader br = new BufferedReader(fr);
		
		String oneLine = br.readLine();
		
		File f2 = new File("C:/Users/dell/Desktop/Temp/Stream.txt");
		FileReader fr1 = new FileReader(f2);
		BufferedReader br1 = new BufferedReader(fr1);
		String oneLine1 = br1.readLine();
		
		StringBuilder sbl = new StringBuilder();
		while(oneLine != null || oneLine1 != null){
			sbl.append("\n");
			sbl.append(oneLine);
			sbl.append("\n");
			sbl.append(oneLine1);
			oneLine = br.readLine();//GC
			oneLine1 = br1.readLine();
		}
		System.out.println(sbl);
		
		
		br.close();
		fr.close();
		br1.close();
		fr1.close();
	}

}
