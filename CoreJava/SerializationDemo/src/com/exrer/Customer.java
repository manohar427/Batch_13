package com.exrer;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Customer implements Externalizable{

	String ssn;
	String pwd;
	String name;
	
	public Customer(String ssn, String pwd, String name) {
		this.ssn = ssn;
		this.pwd = pwd;
		this.name = name;
	}
	
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		ssn  = (String)in.readObject();
		name  = (String)in.readObject();
	}
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(ssn);
		out.writeObject(name);
	}
	
	public Customer() {
	}
	
}
