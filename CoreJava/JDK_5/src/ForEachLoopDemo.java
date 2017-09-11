
public class ForEachLoopDemo {

	public static void main(String[] args) {
        int all[] = {12,34,56,78};
        
        for(int i=0;i<all.length;i++){
        	System.out.println(all[i]);
        }
        System.out.println("En loop");
        //JDK-5
        for(int i : all){
        	System.out.println(i);
        }
	}

}
