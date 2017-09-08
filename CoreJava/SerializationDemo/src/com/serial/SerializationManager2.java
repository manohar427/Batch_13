package com.serial;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationManager2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File file = new File("student.txt");
		
		/*Address a = new Address("Bangalore","India");
    Student s = new Student("abc@email.com",a,"abc");
    
    
    
    FileOutputStream fo = new FileOutputStream(file);
    ObjectOutputStream oo = new ObjectOutputStream(fo);
    
    oo.writeObject(s);
    
    oo.close();
    fo.close();
    
    System.out.println("Object got written in to file system.");*/
    
    FileInputStream fi = new FileInputStream(file);
    ObjectInputStream oi = new ObjectInputStream(fi);
    
    Student ns = (Student)oi.readObject();
    
    oi.close();
    fi.close();
    
    System.out.println("Name:"+ns.name);
    System.out.println("Email:"+ns.email);
    System.out.println("City:"+ns.address.city);
    System.out.println("Country:"+ns.address.country);
    
	}

}
