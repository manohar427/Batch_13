
public class A {
	public static void main(String[] args) {

		Y x = new Y();
		x.x();

		Y x1 = new Y();
	}
}

class X {

	X() {
		System.out.println(" I am from X()");
	}

	{
		System.out.println(" I am from {}X-1");
	}
	
	{
		System.out.println(" I am from {}X-2");
	}
	
	static{
		System.out.println(" I am from static{}-X");
	}
	
	void x(){
		
	}

}

class Y extends X{
	Y() {
		//super();
		System.out.println(" I am from Y()");
	}

	{
		System.out.println(" I am from {}Y-1");
	}
	
	{
		System.out.println(" I am from {}Y-2");
	}
	
	static{
		System.out.println(" I am from static{}-Y");
	}
}