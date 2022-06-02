package com.ab.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ab.entities.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	
	@Query(value="SELECT * FROM customer WHERE user_name = :username and password = :password", nativeQuery=true)
	public Customer findCustomerByUsernameAndPassword(@Param("username") String username,
			@Param("password") String password);
	
	// select query in jpa format
	/*
	@Query(value="FROM Customer c WHERE c.userName = :cUsername and c.password = :cPassword")
	@Modifying
	@Transactional
	public int findCustomerByUsernameAndPassword(@Param("cUsername") String userName,
													@Param("cPassword") String password);
	*/
 
}
