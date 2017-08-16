
public class MethodOverLoadManager {

	public static void main(String[] args) {
		Customer c = new Customer();
		c.getCustomerName(12);
	}

}


class Customer{
	String getCustomerName(int cid){
		return "John";
	}
	
	String getCustomerName(long phno){
		return "John";
	}
	
}