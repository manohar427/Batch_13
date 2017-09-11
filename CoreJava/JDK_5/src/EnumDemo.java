
public class EnumDemo {

	public static void main(String[] args) {

		getMonth(Months.JAN);
		
		getMonth(Months.MAR);
		
	}

	
	static void getMonth(Months monthName){
		System.out.println(monthName);
	}
}

enum Months{
	JAN,FEB,MAR,APR
}