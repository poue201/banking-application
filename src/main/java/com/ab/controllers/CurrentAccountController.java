package com.ab.controllers;


import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.ab.entities.CurrentAccount;
import com.ab.entities.Customer;
import com.ab.helper.CreateAccountNumber;
import com.ab.helper.GenerateDateTime;
import com.ab.services.CurrentAccountService;

@SessionAttributes({"session_balance", "customer_id"})
@Controller
public class CurrentAccountController {
	
	@Autowired
	private CurrentAccountService currentAccountService;
	
	// after login we want to create an account
	@PostMapping("/account")
	public String createCurrentAccount(@RequestParam(name = "firstName") String firstname,
			@RequestParam(name = "lastName") String lastname, Model model) {
		
		// retrieving customer
		Customer loggedInCustomer =(Customer) model.asMap().get("session_customer");
		
		// retrieve customer Id
		int id = loggedInCustomer.getCustomerId();
		model.addAttribute("customer_id", id);
		// generate account Number;
		LocalDateTime time = GenerateDateTime.generateLocalDateTime();
		// set balance to 0;
		double balance = 0.00;
		// generate LocalDateTime;
		CreateAccountNumber accountNumber = new CreateAccountNumber();
		int randomAccountNumber = accountNumber.generateAccountNumber();
		
		CurrentAccount newCurrentAccount = new CurrentAccount(randomAccountNumber, firstname, lastname, balance, time);
		return null;
		
	}
	
//	@GetMapping("/account")
//	public String account() {
//		
//		Customer customer = (Customer)request.getAttribute("session_customer");
//		int id = customer.getCustomerId(); 
//		CurrentAccount loggedInCustomerCurrentAccount = this.currentAccountService.viewCurrentAccount(id);
//		loggedInCustomerCurrentAccount.getBalance();		
//				
//				ModelAndView mv2 = new ModelAndView();
//				mv2.addObject("session_balance", );
//		return "account";
//	}

}
