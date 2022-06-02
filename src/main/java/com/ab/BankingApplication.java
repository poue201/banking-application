package com.ab;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ab.helper.CreateAccountNumber;
import com.ab.helper.GenerateDateTime;

@SpringBootApplication
public class BankingApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankingApplication.class, args);
		
//		CreateAccountNumber accountNumber = new CreateAccountNumber();
//		int random_number = accountNumber.generateAccountNumber();
//		System.out.println(random_number);
//		
//		LocalDateTime time = GenerateDateTime.generateLocalDateTime();
//		System.out.println(time);

	}

}
