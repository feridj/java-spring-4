package com.tobuku.common;

import org.springframework.web.client.RestTemplate;

import com.tobuku.service.Customer;
import java.util.LinkedHashMap;
import java.util.List;
public class App 
{
	static final String REST_SERVICE_URI = "http://localhost:8081/SpringJerseyCrud"; 
	//http://localhost:8081/SpringWsCrud
	//http://localhost:8081/SpringJerseyCrud
		
		
	/* GET */
	@SuppressWarnings("unchecked")
    private static void listAllCustomers(){
		RestTemplate restTemplate = new RestTemplate();
		List<LinkedHashMap<String, Object>> customerMap = restTemplate.getForObject(REST_SERVICE_URI+"/customer/", List.class);
        
        if(customerMap!=null){
        	System.out.println("Retrieve all customers:");
            for(LinkedHashMap<String, Object> map : customerMap){
                System.out.println("Customer : id="+map.get("custId")+", Name="+map.get("fullName")+
                		", Address="+map.get("address")+", Email="+map.get("email"));
            }
        }
        else{
            System.out.println("No customer exist----------");
        }		
	}
	
	
	/* GET */
    private static Customer getCustomer(int id){
        RestTemplate restTemplate = new RestTemplate();
        Customer cust = restTemplate.getForObject(REST_SERVICE_URI+"/customer/" + id, Customer.class);
        if(cust != null) {
        	System.out.println("Retrieve a customer:");
        	System.out.println("Customer : id="+ cust.getCustId() +", Name="+ cust.getFullName()+
            		", Address="+ cust.getAddress() +", Email="+ cust.getEmail());
        	return cust;
        }
        else {
        	System.out.println("No customer exist----------");
        	return null;
        }
    }
    
    
    /* POST */
    private static void createCustomer(Customer cust) {
        RestTemplate restTemplate = new RestTemplate();
        System.out.println("Create a customer: " + cust.getFullName());
        restTemplate.postForLocation(REST_SERVICE_URI+"/customer/", cust, Customer.class);
    }
    
    /* PUT */
    private static void updateCustomer(Customer cust) {
        RestTemplate restTemplate = new RestTemplate();
        System.out.println("Update a customer: " + cust.getCustId());
        restTemplate.put(REST_SERVICE_URI+"/customer", cust);
    }
 
    /* DELETE */
    private static void deleteCustomer(int id) {
        RestTemplate restTemplate = new RestTemplate();
        System.out.println("Delete a customer: " + id);        
        restTemplate.delete(REST_SERVICE_URI+"/customer/" + id);
    }
    
    /* DELETE */
    private static void deleteAllCustomers() {
        RestTemplate restTemplate = new RestTemplate();
        System.out.println("Delete all customers");
        restTemplate.delete(REST_SERVICE_URI+"/customer/");
    }
	
    public static void main( String[] args )
    {
    	//REMOVE ALL (DELETE)
    	deleteAllCustomers();
    	
    	//CREATE CUSTOMRES (POST)    	
    	createCustomer(new Customer(71,"Tammy Hawkins","691 Luster Center","thawkinsi2@thetimes.co.uk"));
    	createCustomer(new Customer(72,"Jack Tucker","25445 Surrey Alley","jtuckeri5@abc.net.au"));
    	createCustomer(new Customer(73,"Matthew Morgan","9 Jay Pass","mmorgani6@kickstarter.com"));
    	createCustomer(new Customer(74,"Timothy Watkins","746 Center Alley","twatkinsi7@tumblr.com"));
    	createCustomer(new Customer(75,"Sara Williamson","97121 Algoma Drive","swilliamsoni8@woothemes.com"));
    	createCustomer(new Customer(76,"Eugene Mcdonald","513 Merrick Way","emcdonaldi9@usnews.com"));
    	
    	//RETRIEVE ALL (GET)
    	listAllCustomers();	
    	
    	//GET ONE CUSTOMER (GET)
    	Customer cust = getCustomer(74);  
    	
    	//UPDATE (PUT)
    	cust.setEmail("no-email");
    	updateCustomer(cust);

    	//REMOVE A CUSTOMER (DELETE)
    	deleteCustomer(73);
    	
    	//RETRIEVE ALL (GET)    	
    	listAllCustomers();	
    	
    }
}
