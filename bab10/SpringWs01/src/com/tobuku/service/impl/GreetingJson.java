package com.tobuku.service.impl;

import com.tobuku.service.Greeting;

public class GreetingJson implements Greeting {
	private int guestId=0;	
	private String guestName="";
	private String message="";
	
	public GreetingJson() {
		super();		
	}

	public GreetingJson(int id, String name, String msg) {
		this.guestId = id;
		this.guestName = name;
		this.message = msg;
	}

	public int getGuestId() {
		return guestId;
	}

	public void setGuestId(int guestId) {
		this.guestId = guestId;
	}

	public String getGuestName() {
		return guestName;
	}

	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}


}
