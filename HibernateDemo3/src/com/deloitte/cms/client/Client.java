package com.deloitte.cms.client;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.deloitte.cms.model.Address;
import com.deloitte.cms.model.EmployeeDetails;
public class Client {

	public static void main(String[] args) {
		
		
		//hibernate.cfg.xml - and creates db connection
		Configuration configuration =new Configuration().configure();
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Set allAddress= new HashSet();
		EmployeeDetails emp1 = new EmployeeDetails(4,"parth",15257);
		EmployeeDetails emp2 = new EmployeeDetails(5,"Arth",59332);
		EmployeeDetails emp3 = new EmployeeDetails(6,"Uday",65493);
		
		Address address1=new Address(4,"blr","karnataka");
		Address address2=new Address(5,"Newyork","Newyork");
		
		allAddress.add(address1);
		allAddress.add(address2);
		
		emp1.setEmployeeAddress(allAddress);
		emp2.setEmployeeAddress(allAddress);
		
		session.save(emp1);
		session.save(emp2);
		session.save(emp3);
		System.out.println("data recorded successfully");
		transaction.commit();
		session.close();
		factory.close();
		
 	}
}
