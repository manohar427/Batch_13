package com.serial;

import java.io.Serializable;

public class Student implements Serializable{

	public static String name = "XXXXX";
	public transient String email = "XXXXXX@XXX.com";
	public Address address;
	
	
	public Student(String email, Address address,String name) {
		this.email = email;
		this.address = address;
		this.name = name;
	}
}
