package com.tobuku.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.tobuku.dao.CustomerDao;
import com.tobuku.model.Customer;

public class JdbcTemplateCustomerDao implements CustomerDao {

	private DataSource dataSource;
		
	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public void insert(Customer customer) {
		JdbcTemplate jdbcTemplate;
		String sql = "INSERT INTO CUSTOMER "
				+ "(cust_id, full_name, address, email) VALUES (?, ?, ?, ?)";
					 
		jdbcTemplate = new JdbcTemplate(dataSource);
				
		jdbcTemplate.update(sql, new Object[] { 
				customer.getCustId(),
				customer.getFullName(),
				customer.getAddress(),
				customer.getEmail() });		
	}

	public Customer findByCustomerId(int custId) {
		JdbcTemplate jdbcTemplate;
		String sql = "SELECT * FROM CUSTOMER WHERE cust_id = ?";
		jdbcTemplate = new JdbcTemplate(dataSource);

		Customer customer = (Customer) jdbcTemplate.queryForObject(
				sql, new Object[] { custId }, new CustomerRowMapper());
		
		return customer;			
	}

	public List<Customer> findAllCustomers() {
		JdbcTemplate jdbcTemplate;
		String sql = "SELECT * FROM CUSTOMER";
		jdbcTemplate = new JdbcTemplate(dataSource);		
		
		List<Customer> custList = new ArrayList<Customer>();		
		custList = jdbcTemplate.query(sql, new CustomerRowMapper());
		return custList;
	}

}
