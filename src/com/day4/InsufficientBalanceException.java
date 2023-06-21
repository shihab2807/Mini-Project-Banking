package com.day4;

public class InsufficientBalanceException extends RuntimeException {
	private String message;


	public InsufficientBalanceException(String message) {
		this.message = message;
	}
	@Override
	public String getMessage() {
		return message;
	}



}

/**
 * Rules for working with custom exception:
 * 
 *------------------------------------------
 *1.Create a class with the Exception Name.
 *2a.To create checked Exception, inherit Exception class.
 *2b.To create unchecked Exception, inherit RuntimeException class.
 *3.Override getMessage().(variable, constructor,method)
 *4.Invoke Exception object using throw keyword &handle it using try & catch block.
 * 
 * 
 * */
