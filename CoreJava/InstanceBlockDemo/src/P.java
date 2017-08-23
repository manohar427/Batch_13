
public class P {
  public static void main(String[] args) {
	Q q = new Q();
	q.m1();
}
}
class Q
{
	void m1(){
		m1();
		System.out.println("m1");
	}
	void m2(){
		System.out.println("m2");
	}
}
