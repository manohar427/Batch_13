
public class VarArgsDemo {

	public static void main(String[] args) {
     
		add("Abc",10,30,30,10);
	}

	
	/*static void  add(int x,int y){
		System.out.println("Sum1:"+(x+y));
	}*/
	
	static void  add(String name, int ... a){
		int x = 0 ;
		for(int i : a){
			x = x +i;
		}
		System.out.println("Sum2:"+x);
	}
}
