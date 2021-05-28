package com.tobuku.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.tobuku.dao.CustomerDao;
import com.tobuku.model.Customer;

public class JdbcDaoSupportCustomerDao extends JdbcDaoSupport implements CustomerDao {
	public void insert(Customer customer) {
		String sql = "INSERT INTO CUSTOMER "
				+ "(cust_id, full_name, address, email) VALUES (?, ?, ?, ?)";
					 
		getJdbcTemplate().update(sql, new Object[] { 
				customer.getCustId(),
				customer.getFullName(),
				customer.getAddress(),
				customer.getEmail() });		
	}

	public Customer findByCustomerId(int custId) {
		String sql = "SELECT * FROM CUSTOMER WHERE cust_id = ?";

		Customer customer = (Customer) getJdbcTemplate().queryForObject(
				sql, new Object[] { custId }, new CustomerRowMapper());
		
		return customer;			
	}	
	
	public List<Customer> findAllCustomers() {
		List<Customer> custList = new ArrayList<Customer>();
		String sql = "SELECT * FROM CUSTOMER";
		custList = getJdbcTemplate().query(sql, new CustomerRowMapper());
		return custList;
	}

}

