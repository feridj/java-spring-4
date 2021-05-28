package com.tobuku.service;


import javax.validation.constraints.*;

public class CustomerForm {
	@NotNull
	@Size(min=1, max=1000, message="\"Customer ID\" tidak valid")
	private int custId;
	
	@NotNull (message="\"Full Name\" harus diisi")
	private String fullName;
	
	@NotNull (message="\"Address\" harus diisi")
	private String address;
	
	@NotNull (message="\"Email\" harus diisi")
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
