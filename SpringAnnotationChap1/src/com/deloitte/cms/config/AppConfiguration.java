package com.deloitte.cms.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.deloitte.cms.model.Address;
import com.deloitte.cms.model.Customer;

@Configuration
public class AppConfiguration {

	@Bean
	public Customer getCustomerObject()
	{
		return new Customer();
	}
	@Bean
	public Address getAddressObject()
	{
		return new Address();
	}	
	
}
