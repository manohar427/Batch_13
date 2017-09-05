package com.customexc;

public class CustomException {

	public static void main(String[] args) {

		int age = new Integer(args[0]).intValue();
		
		if(age<5){
			throw new InsufficientStudentAgeException("Student age less for enroll:"+age);
		}else{
			System.out.println("Student enrolled successfully!");
		}
	}

}
