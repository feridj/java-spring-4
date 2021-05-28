package com.tobuku.dao;

import java.util.List;

import com.tobuku.model.Customer;

public interface CustomerDao {
	public void insert(Customer customer);
	public Customer findByCustomerId(int custId);
	public List<Customer> findAllCustomers();
	
}
