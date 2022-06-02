package com.ab.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ab.entities.CurrentAccount;
import com.ab.repositories.CurrentAccountRepository;

@Service
public class CurrentAccountService {
	
	@Autowired
	CurrentAccountRepository currentAccounRepository;
	
	public CurrentAccount viewCurrentAccount(int id) {
		
		return this.currentAccounRepository.findAccountByCustomerId(id);
	}

}
