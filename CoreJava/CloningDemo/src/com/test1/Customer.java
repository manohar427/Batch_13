package com.test1;

public class Customer implements Cloneable{
    String name;
    int age;
    String email;
    Address address;
    
	public Customer(String name, int age, String email, Address address) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.address = address;
	}

	public String toString() {
		return "Customer [name=" + name + ", age=" + age + ", email=" + email + ", address=" + address + "]";
	}
	protected Object clone() throws CloneNotSupportedException {
		
		Customer c = (Customer)super.clone();
		
		Address ad = new Address(this.address.city,this.address.country);
		c.address = ad;
		return c;
	}
}
