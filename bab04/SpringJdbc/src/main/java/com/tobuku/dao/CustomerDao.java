package com.tobuku.dao;

import com.tobuku.model.Customer;

public interface CustomerDao {
	public void insert(Customer customer);
	public Customer findByCustomerId(int custId);
}
