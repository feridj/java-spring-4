package com.tobuku.common;

public class HelloWorld implements Hello{
	private String message;

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
	
	public void printMessage() {
		System.out.println("Your Message : " + message);
	}
}
