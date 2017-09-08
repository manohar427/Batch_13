package com.serial;

import java.io.Serializable;

public class Address implements Serializable{
	public String city;
	public String country;

	public Address(String city, String country) {
		this.city = city;
		this.country = country;
	}

}
