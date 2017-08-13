
public class Customer {
	
	int x =100;
  String getCustName(int cid){
	    if(cid == 10){
	    	return "John";
	    }else if(cid == 20){
	    	return "Marie";
	    }else{
	    	return "Unknown";
	    }
	}
  
  void printCustDetails(String custEmail,int xyz[]){
	  System.out.println("John");
	  System.out.println("01-01-1990");
	  System.out.println("Cust Email:"+custEmail);
  }
  
  Customer(int abc){
	  
	  System.out.println("Customer(int)");
  }
  
   Customer() {
	   System.out.println("Customer(int)");
   }
}
