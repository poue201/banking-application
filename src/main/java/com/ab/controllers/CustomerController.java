package com.ab.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.ab.entities.Customer;
import com.ab.services.CustomerService;

@SessionAttributes({"session_customer"})
@Controller
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/")
	public String register() {
		
		return "register";
	}
	
	@PostMapping("/register")
	public String registerProcess(@ModelAttribute Customer customer) {
		
		Customer registeredCustomer = this.customerService.registerCustomer(customer);
		
		if(registeredCustomer != null) {
			
			return "login";
		}
		else {
			return "reg_failure";
		}
		
	}
		
		// login
		@PostMapping("/login")
		
		public String loginProcess(@RequestParam(name = "username") String username,
									@RequestParam(name = "password") String password) {
			
			Customer loggedInCustomer = this.customerService.loginCustomer(username, password);
			if(loggedInCustomer != null) {
				
				ModelAndView mv = new ModelAndView();
				mv.addObject("session_customer", loggedInCustomer);
					
				return "account";
			}
			else {
				return "reg_failure";
			}
		}
		
		@GetMapping("/login")
		public String login() {
			
			return "login";
		}


}
