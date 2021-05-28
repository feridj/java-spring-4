package com.tobuku.bo;

import java.util.List;

import com.tobuku.service.Customer;

public interface CustomerBo {
	public void insert(Customer customer);
	public Customer findByCustomerId(int custId);
	public List<Customer> findAllCustomers();
	public void update(Customer customer);
	public void delete(int custId);
}

