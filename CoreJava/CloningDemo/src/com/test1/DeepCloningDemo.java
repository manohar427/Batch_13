package com.test1;

import com.test1.Address;
import com.test1.Customer;

public class DeepCloningDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		Address ad = new Address("Blr","India");
		Customer ocu = new Customer("John",30,"john@email.com",ad);
		
		Customer dco = (Customer)ocu.clone();
		
		
		System.out.println("Original Obj:"+ocu);
		System.out.println("Cloned Obj:"+dco);
		
		ocu.address.city = "Hyd";
		ocu.address.country = "US";
		
		System.out.println("Original Obj data got modified.");
		
		System.out.println("Original Obj:"+ocu);
		System.out.println("Cloned Obj:"+dco);
	}

}
