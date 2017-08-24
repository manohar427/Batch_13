package com.abs;

public class A {

	void add() {
		//
		System.out.println("OK");
		//
	}
	
	public static void main(String[] args) {
		B b = new D();
		
		b.diff();
		
	}
}

abstract class B {
	abstract void sum();// 2

	void diff() {// 3

	}

	B() {//5
		System.out.println("B()");
	}
}

abstract class C {
	// 1

}

class D extends B {// 4
	void sum() {
		System.out.println("Sum");
	}
}
