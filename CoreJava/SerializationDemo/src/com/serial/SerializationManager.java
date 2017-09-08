package com.serial;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializationManager {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File file = new File("customer.txt");
    /*Customer c = new Customer("abc@email.com","Bangalore","abc");
    
    
    
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
    System.out.println("Email:"+nc.email);
    System.out.println("Address:"+nc.address);
    
	}

}
