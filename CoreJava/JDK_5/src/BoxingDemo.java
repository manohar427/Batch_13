
public class BoxingDemo {

	public static void main(String[] args) {
       
		//jdk <5
		
		int x =10 ; 
		
		String age  = "30";
		
		//int agei = age; 
		
		int agei = new Integer(age).intValue();//<5
		
		int ag = new Integer(age);//5 -- Un Boxing
		Integer xi = new Integer(x);
		
		System.out.println("X:"+x);
		System.out.println("Xi:"+xi);
		
		Integer y = x ; //5 -- Boxing (new Integer(x))
		
		
	}

}
