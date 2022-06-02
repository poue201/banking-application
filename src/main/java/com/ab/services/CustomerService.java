package com.ab.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ab.entities.Customer;
import com.ab.repositories.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository customerRepository;
	
	public Customer registerCustomer(Customer customer) {
		
		return this.customerRepository.save(customer);
	}
	
	public Customer loginCustomer(String username, String password) {
		
		return this.customerRepository.findCustomerByUsernameAndPassword(username, password);
	}

}
