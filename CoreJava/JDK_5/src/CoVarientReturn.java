
public class CoVarientReturn {

	public static void main(String[] args) {

	}

}
class A{
}
class B extends A{
}

class P{
	
	Number getDetail(){
		return 100;
	}
}

class Q extends P{
	
	Integer  getDetail(){
		return 200;
	}
}