package com.tobuku.service.impl;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.tobuku.service.Greeting;
 
@XmlRootElement (name = "guest")
@XmlAccessorType(XmlAccessType.NONE)
public class GreetingXml  implements Greeting {
	@XmlAttribute
	private int guestId=0;	
	
	@XmlElement
	private String guestName="";
	
	@XmlElement
	private String message="";
	
	public GreetingXml() {
		super();
		
	}

	public GreetingXml(int id, String name, String msg) {
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
