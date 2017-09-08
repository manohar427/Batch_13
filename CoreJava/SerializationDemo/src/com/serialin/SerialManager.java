package com.serialin;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class SerialManager {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		
		File file = new File("a.txt");
       
		B b = new B();
		
		b.a = 10;
		b.b = 20;
	    
	    
	    FileOutputStream fo = new FileOutputStream(file);
	    ObjectOutputStream oo = new ObjectOutputStream(fo);
	    
	    oo.writeObject(b);
	    
	    oo.close();
	    fo.close();
	    
	    System.out.println("Object got written in to file system.");
	    
	     FileInputStream fi = new FileInputStream(file);
	    ObjectInputStream oi = new ObjectInputStream(fi);
	    
	    B nb = (B)oi.readObject();
	    
	    oi.close();
	    fi.close();
	    
	    System.out.println("a:"+nb.a);
	    System.out.println("b:"+nb.b);
	    
	}

}
