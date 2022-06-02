package com.ab.controllers;


import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.ab.helper.CreateAccountNumber;
import com.ab.helper.GenerateDateTime;
import com.ab.services.CurrentAccountService;

@SessionAttributes({"session_balance"})
@Controller
public class CurrentAccountController {
	
	@Autowired
	private CurrentAccountService currentAccountService;
	
	@PostMapping("/account")
	public String createCurrentAccount(@RequestParam(name = "firstName") String firstname,
			@RequestParam(name = "lastName") String lastname) {
		
		// generate account Number;
		LocalDateTime time = GenerateDateTime.generateLocalDateTime();
		// set balance to 0;
		// generate LocalDateTime;
		CreateAccountNumber accountNumber = new CreateAccountNumber();
		int random_number = accountNumber.generateAccountNumber();
		
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
