package com.ab.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int customerId;
	
	
	private String customerName;
	
	private String customerEmail;
	
	private String customerContactNumber;
	
	private String userName;
	
	private String password;
	
	@OneToMany(mappedBy = "customer")
	private List<CurrentAccount> currentAccounts = new ArrayList<>();
	
	

}
