package com.ab.helper;

import java.util.ArrayList;
import java.util.List;

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
public class CreateAccountNumber {
	
	private List<Integer> listOfAccountNumbers = new ArrayList<Integer>();
	
	
	public int generateAccountNumber() {

		int min = 10000000;
	    int max = 90000000;
	    
	    //Generate random int value from 50 to 100 
	     int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
	     while(this.getListOfAccountNumbers().contains(random_int)) {
	    	 
	    	 random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
	     }
		this.getListOfAccountNumbers().add(random_int);
		
		return random_int;
	}
	
	

}
