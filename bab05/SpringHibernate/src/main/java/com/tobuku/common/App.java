package com.tobuku.common;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tobuku.bo.CustomerBo;
import com.tobuku.model.Customer;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext appContext = new ClassPathXmlApplicationContext("spring/config/Main.xml");
    		
    	CustomerBo custBo = (CustomerBo)appContext.getBean("customerBo");    
    	
    	/* 
    	//INSERT NEW CUSTOMERS 
    	
    	custBo.insert(new Customer(11, "Nicholas Freeman", "06 Thackeray Lane", "nfreeman0@mac.com") );
    	custBo.insert(new Customer(12, "Jack Ortiz", "018 Mesta Circle", "jortiz1@mozilla.org") );
    	custBo.insert(new Customer(13, "Virginia Carroll", "0532 Lighthouse Bay Road", "vcarroll2@pen.io") );
    	custBo.insert(new Customer(14, "Nicholas Welch", "7 Melvin Alley", "nwelch3@nih.gov") );
    	custBo.insert(new Customer(15, "Adam Black", "581 Continental Drive", "ablack4@soup.io") );
    	 */    	
    	
    	//RETRIEVE 1 CUSTOMER
    	//Customer customer = custBo.findByCustomerId(11);
    	//System.out.println(customer11);
    	
    	
    	//UPDATE 1 CUSTOMER
    	/*
    	Customer customer = custBo.findByCustomerId(12);    	
    	System.out.println(customer.getCustId() + " | " + customer.getFullName() +" | "+
    			customer.getAddress() +" | "+ customer.getEmail());
    	
    	
    	customer.setEmail("jortiz1@mozilla.co.id");
    	custBo.update(customer);
    	System.out.println(customer.getCustId() + " | " + customer.getFullName() +" | "+
    			customer.getAddress() +" | "+ customer.getEmail());    
    	*/
    	
    	//DELETE 1 CUSTOMER
    	/*
    	custBo.delete(12); 
    	customer = custBo.findByCustomerId(12);    	
    	System.out.println(customer.getCustId() + " | " + customer.getFullName() +" | "+
    			customer.getAddress() +" | "+ customer.getEmail());
    	*/
    	
    	//DISPLAY ALL CUSTOMERS 
    	/*
        System.out.println("-----------------------------------------------");
        List<Customer> custList = custBo.findAllCustomers();
        for(Customer cust:custList){
            System.out.println(cust.getCustId() + " | " + cust.getFullName() +" | "+
            		cust.getAddress() +" | "+ cust.getEmail());
        } 
    	*/
 
    	//NATIVE INSERT NEW CUSTOMERS     	
    	custBo.nativeInsert(new Customer(31,"Ernest Rose","0 Mccormick Place","erose0@rediff.com") );
    	custBo.nativeInsert(new Customer(32,"James Olson","96 Golf Course Pass","jolson1@craigslist.org") );
    	custBo.nativeInsert(new Customer(33,"Jennifer Harper","112 Green Terrace","jharper2@marriott.com") );
    	custBo.nativeInsert(new Customer(34,"Christopher Anderson","6 East Lane","canderson3@reddit.com") );
    	custBo.nativeInsert(new Customer(35,"Ruby Murray","64 Hermina Drive","rmurray4@loc.gov") );
    	
    	
    	//NATIVE DISPLAY ALL CUSTOMERS 
        System.out.println("-----------------------------------------------");
        List<Customer> custList = custBo.nativeFindAllCustomers();
        for(Customer cust:custList){
            System.out.println(cust.getCustId() + " | " + cust.getFullName() +" | "+
            		cust.getAddress() +" | "+ cust.getEmail());
        }  	    	
    }
}
