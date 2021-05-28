package com.tobuku.bo.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tobuku.bo.CustomerBo;
import com.tobuku.dao.CustomerDao;
import com.tobuku.service.Customer;

public class CustomerBoImpl implements CustomerBo {
	@Autowired
	private CustomerDao custDao;	
	
	public CustomerDao getCustDao() {
		return custDao;
	}

	public void setCustDao(CustomerDao custDao) {
		this.custDao = custDao;
	}

	public void insert(Customer customer) {
		custDao.insert(customer);		
	}

	public Customer findByCustomerId(int custId) {
		return custDao.findByCustomerId(custId);
	}

	public List<Customer> findAllCustomers() {		
		return custDao.findAllCustomers();
	}
	
	public void update(Customer customer) {
		custDao.update(customer);
	}
	
	public void delete(int custId) {
		custDao.delete(custId);
	}

}
