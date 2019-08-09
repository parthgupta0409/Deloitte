package com.deloitte.cms.client;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.deloitte.cms.model.Customer;
public class Client {

	public static void main(String[] args) {
		
		
		//hibernate.cfg.xml - and creates db connection
		Configuration configuration =new Configuration().configure();
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Customer customer =(Customer) session.load(Customer.class, 1817);
		System.out.println(customer);
		session.save(customer);
		transaction.commit();
		session.close();
		factory.close();
		
 	}
}
