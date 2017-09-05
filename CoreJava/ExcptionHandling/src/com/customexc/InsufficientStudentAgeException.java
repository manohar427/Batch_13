package com.customexc;

public class InsufficientStudentAgeException extends RuntimeException{

	public InsufficientStudentAgeException(){
		
	}
	public InsufficientStudentAgeException(String exceptionMessage){
		super(exceptionMessage);
	//
	}
	
}
