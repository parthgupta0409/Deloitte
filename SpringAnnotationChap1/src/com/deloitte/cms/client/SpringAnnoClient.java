package com.deloitte.cms.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.deloitte.cms.config.AppConfiguration;
import com.deloitte.cms.model.Address;
import com.deloitte.cms.model.Customer;

public class SpringAnnoClient {

	public static void main(String[] args) {
		AbstractApplicationContext context=new AnnotationConfigApplicationContext(AppConfiguration.class);
		
				
				Customer customer=context.getBean(Customer.class);
			    Address address= context.getBean(Address.class);
			   
			   customer.setCustomerId(111);
			   customer.setCustomerName("gupta");
			   customer.setCustomerAddress("bengaluru");
			   customer.setBillAmount(1500);
			   
			   address.setaId(121215);
			   address.setCity("pune");
			   address.setState("goa");
//			   
					 //  customer.setAddress(address);
				System.out.println(customer);
				context.registerShutdownHook();
				
	}
}

