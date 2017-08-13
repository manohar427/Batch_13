
public class MethodDemo {

	public static void main(String[] args) {
       
		Customer obj = new Customer(10);
		String name = obj.getCustName(10);
		
		System.out.println(name);
		
		int marks [] = {12,345,6};
		obj.printCustDetails("abc@email.com",marks);
		
	}
   
}
