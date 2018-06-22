package com.util;

public class BaseException extends Exception{
	public BaseException(){
		super();
	}
	
	public BaseException(String message){
		super(message);
	}
	
	public BaseException(String message, Throwable cause){
		super(message,cause);
	}
	
}
