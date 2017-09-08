package com.serial;

import java.io.Serializable;

public class Customer implements Serializable{

	public static String name = "XXXXX";
	public transient String email = "XXXXXX@XXX.com";
	public String address;
	
	
	
	public Customer(String email, String address,String name) {
		this.email = email;
		this.address = address;
		this.name = name;
	}
	
}
