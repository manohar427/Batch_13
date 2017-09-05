package com.test;

public class StringDemo {

	public static void main(String[] args) {

		String name1 = "Abc";//1
		String name2 = new String("Abc");//2
		
		/*final int age =90;
		age = 91;*/
		
		System.out.println("Count :"+name1.length());
		System.out.println("Upper :"+name1.toUpperCase());
		System.out.println("Lower :"+name1.toLowerCase());
		
		String s1 = " xyz ";
		
		s1 = s1.trim();
		
		System.out.println("s1:"+s1.length());
		
		
		String name = "ahsgdahsdkjhjak askjdhasd";
		System.out.println("Sub portion 1:"+name.substring(2,5));
		
		System.out.println("Sub portion 2:"+name.substring(4));
		
		int temp =0;
		for(int i=0;i<name.length();i++){
			
			if(name.charAt(i)=='h')
				temp++;//temp = temp +1;
		}
		
		System.out.println("H count:"+temp);
		
		
		String a1 = "abc";//3
		String a2 = "abc";
		String a3 = new String("abc");//0
		String a4 = new String("abc");
	//	String a3 = null;//
		
		System.out.println("Equal:"+a1.equals(a2));
		
		System.out.println("==:"+(a1 == a2));//T
		System.out.println("==:"+(a1 == a3));//F
		System.out.println("==:"+(a2 == a3));//F
		System.out.println("==:"+(a3 == a4));//F
		
		String obj = "abcd";
		obj = obj +"e"; //Immutable
		
		
		
		
	}

}
