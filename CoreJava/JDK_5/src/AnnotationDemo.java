
public class AnnotationDemo {
	String name;
	int email;
	
	@Override
	public String toString() {
		return "AnnotationDemo [name=" + name + ", email=" + email + "]";
	}

}

class A1{
	@Deprecated
	void add() {
	}
}

class B1 extends A1{
	void sub() {
		
		A1 a = new A1();
		a.add();
	}
}