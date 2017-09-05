package com.throwex;

public class ThrowDemo {

	public static void main(String[] args) {

		A obj = new A();
		try {
			System.out.println(obj.getCustomerDetails(100));
		} catch (Exception e) {
			System.out.println("Service got failed .. Unable to get Customer Info");
			e.printStackTrace();
		}
		
	}

}


class A{
	
	public String getCustomerDetails(int custId)throws ArithmeticException,ClassNotFoundException{
		String dtls = null;
		try{
			//Process custId
			//int avg = 1000/0;
			dtls =  "Cousre Founder";
			
			Class.forName("abc");
		}
		catch(ClassNotFoundException e){
			throw e;
		}
		catch(ArithmeticException e){
			//System.out.println("Exception occured");
			throw e;
		}
		return dtls;
	}
}