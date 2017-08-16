
public class OverrideManager {

	public static void main(String[] args) {
      
    /*		House h1 = new A_House();
	h1.getFlooring();
	h1.getWindows();
	*/
	
	House h2 = new B_House();
	h2.getFlooring();
	h2.getWindows();
	h2.getCeiling();
		
	}

}

class House {

	void getFlooring() {
         System.out.println("Floor was buils with cements");
         //6
	}

	void getWindows() {
		 System.out.println("Windows was buils with GLass");
	}
	
	static void getCeiling(){
		 System.out.println("Ceiling was buils with cements");
	}
	
}

class A_House extends House{
	void getFlooring() {
        System.out.println("Floor was buils with Marbles");
        //3
	}
}

class B_House extends House{
	void getWindows() {
		 System.out.println("Windows was buils with wood");
	}
	static void getCeiling(){
		 System.out.println("Ceiling was buils with XXXXXX");
	}
}