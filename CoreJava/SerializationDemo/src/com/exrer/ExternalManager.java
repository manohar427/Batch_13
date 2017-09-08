package com.exrer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class ExternalManager {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		File file = new File("cust.txt");
	  /* Customer c = new Customer("87787678","*&*(&@8787","John");
	    
	    
	    
	    FileOutputStream fo = new FileOutputStream(file);
	    ObjectOutputStream oo = new ObjectOutputStream(fo);
	    
	    oo.writeObject(c);
	    
	    oo.close();
	    fo.close();
	    
	    System.out.println("Object got written in to file system.");*/
	    
	    FileInputStream fi = new FileInputStream(file);
	    ObjectInputStream oi = new ObjectInputStream(fi);
	    
	    Customer nc = (Customer)oi.readObject();
	    
	    oi.close();
	    fi.close();
	    
	    System.out.println("Name:"+nc.name);
	    System.out.println("Pwd:"+nc.pwd);
	    System.out.println("SSN:"+nc.ssn);
	}

}
