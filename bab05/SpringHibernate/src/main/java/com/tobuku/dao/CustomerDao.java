package com.tobuku.dao;

import java.util.List;

import com.tobuku.model.Customer;

public interface CustomerDao {
	public void insert(Customer customer);
	public Customer findByCustomerId(int custId);
	public List<Customer> findAllCustomers();
	public void update(Customer customer);
	public void delete(int custId);
	public void nativeInsert(Customer customer);
	public List<Customer> nativeFindAllCustomers();
}
