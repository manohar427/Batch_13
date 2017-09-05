package com.ovrd;

public class MethodOverride {

}


class A{
	void add(){
		System.out.println("A-add()"); //1
	}
	
	void div() throws NullPointerException{ //2
		System.out.println("A-div()");
	}
	
	void mul() throws ClassNotFoundException{ //2
		System.out.println("A-mul()");
	}
}

class B extends A{
	
	void add() throws NullPointerException{ //1
		System.out.println("B-add()");
	}
	
	/*void add(){ //1
		System.out.println("B-add()");
	}*/
	
	void div(){ //2
		System.out.println("B-div()");
	}
	
	void mul() throws ClassNotFoundException{ //3
		System.out.println("B-mul()");
	}
}