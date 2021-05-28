package com.tobuku.service;

import org.hibernate.validator.constraints.*;
import javax.validation.constraints.*;

public class CustomerForm {
	@NotNull
	@Range(min=1, max=1000, message="\"Customer ID\" tidak valid")
	private int custId;
	
	@NotBlank (message="\"Full Name\" harus diisi")
	private String fullName;
	
	@NotBlank (message="\"Address\" harus diisi")
	private String address;
	
	@NotEmpty (message="\"Email\" harus diisi")
	@Email (message="Format Email tidak valid")
	private String email;	
	
	private String flag;
	
	public CustomerForm() {
		super();
	}
	
	public CustomerForm(int custId, String fullName, String address, String email) {
		super();
		this.custId = custId;
		this.fullName = fullName;
		this.address = address;
		this.email = email;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}
	
	
}
