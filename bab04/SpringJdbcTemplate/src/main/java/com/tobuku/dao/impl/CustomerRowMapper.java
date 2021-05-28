package com.tobuku.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.tobuku.model.Customer;

public class CustomerRowMapper implements RowMapper {
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {

		Customer customer = new Customer(rs.getInt("cust_id"), rs.getString("full_name"),
				rs.getString("address"), rs.getString("email"));

		return customer;
	}
}
