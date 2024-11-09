package com.edubridge.springapp2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.edubridge.springapp2.beans.Address;
import com.edubridge.springapp2.beans.CanonPrinter;
import com.edubridge.springapp2.beans.Customer;
import com.edubridge.springapp2.beans.EpsonPrinter;

// @Configuration is a calss level annotaion.

@Configuration
public class AppConfig {
	
	@Bean
	public EpsonPrinter getEpsonPrinter() {
		
		EpsonPrinter epson = new EpsonPrinter("M101", "Black", 12000.0);
	
		return epson;		
	}
	
	@Bean
	public CanonPrinter getCanonPrinter() {
		
		CanonPrinter canon = new CanonPrinter();

		canon.setPrice(45000);
		canon.setColor("Red");
		canon.setModelNo(111);	
	
		return canon;		
	}
	
	@Bean
	public Address GetAddressInstanace() {
		
		return new Address("Hyderabad","Telangana","India");
		// Anonymus object without any name.
		// theya re eligible for garbage collections.
		// they are by deafault removed/cleared after its usage.
	}
	
	@Bean
	public Customer getCustomer() {
		
		Customer customer = new Customer();
		
		customer.setCustomerLastName("Amarender Reddy");
		customer.setCustomerFirstName("Voladri");
		customer.setCustomerAddress(GetAddressInstanace());
		
		return customer;		
	}

}
