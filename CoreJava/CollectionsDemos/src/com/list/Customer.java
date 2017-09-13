package com.list;

public class Customer {
	String name;
	int empId;

	public Customer(String name, int empId) {
		super();
		this.name = name;
		this.empId = empId;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", empId=" + empId + "]";
	}
	
}
