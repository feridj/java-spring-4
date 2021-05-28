package com.tobuku.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.tobuku.dao.CustomerDao;
import com.tobuku.model.Customer;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;


public class CustomerDaoImpl implements CustomerDao{
	private SessionFactory sessionFactory;	

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public void insert(Customer customer) {
		this.sessionFactory.getCurrentSession().save(customer); 		
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public Customer findByCustomerId(int custId) {		
		List<Customer> list = this.sessionFactory.getCurrentSession()
                .createQuery("from Customer where custId=:custid")
                .setParameter("custid", custId)
                .list(); 	
		return (Customer)list.get(0);
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<Customer> findAllCustomers() {		
		List<Customer> custList = new ArrayList<Customer>();
		custList = this.sessionFactory.getCurrentSession()
                .createQuery("from Customer")
                .list(); 	
		return custList;
	}
	
	
	@Transactional
	public void update(Customer customer) {
		this.sessionFactory.getCurrentSession().update(customer);
	}
	
	@Transactional
	public void delete(int custId) {
		Customer customer = findByCustomerId(custId);
		this.sessionFactory.getCurrentSession().delete(customer);
	}
	
	@Transactional
	public void nativeInsert(Customer customer) {
		Query query = this.sessionFactory.getCurrentSession().createSQLQuery("INSERT INTO CUSTOMER ( CUST_ID, FULL_NAME, ADDRESS, EMAIL ) " +
				"VALUES (:custId, :fullName, :address, :email)"	)
				.setParameter("custId", customer.getCustId())
				.setParameter("fullName", customer.getFullName())
				.setParameter("address", customer.getAddress())
				.setParameter("email", customer.getEmail());

		int affectedRow = query.executeUpdate();
	}
	
	
	@SuppressWarnings("unchecked")
	@Transactional
	public List<Customer> nativeFindAllCustomers() {	
		Query query = this.sessionFactory.getCurrentSession().createSQLQuery("SELECT CUST_ID, FULL_NAME, ADDRESS, EMAIL FROM CUSTOMER")
				.addEntity(Customer.class);
		List<Customer> custList = query.list();
	
		return custList;
	}
}
