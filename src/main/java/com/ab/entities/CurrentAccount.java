package com.ab.entities;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class CurrentAccount extends BankAccount{
	
	
	
public CurrentAccount(int accountNumber, String firstName, String lastName, double balance, LocalDateTime dateOpened) {
		
		this.accountNumber = accountNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.balance = balance;
		this.dateOpened = dateOpened;
	}
	
	
	@ManyToOne
	@JoinColumn(name = "customer_id")
	private Customer customer;
	

	
}
