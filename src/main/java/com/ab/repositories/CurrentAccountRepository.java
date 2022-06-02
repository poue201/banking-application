package com.ab.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ab.entities.CurrentAccount;

// do you extend the superclass type or the subclass
// do you create an interface for the super class?
@Repository
public interface CurrentAccountRepository extends JpaRepository<CurrentAccount, Integer>{

	@Query(value="SELECT * from current_account WHERE customer_id = :id", nativeQuery=true)
	public CurrentAccount findAccountByCustomerId(@Param("id") int id);
	
}
