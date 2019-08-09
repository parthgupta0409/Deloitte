package com.deloitte.cms.client;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.deloitte.cms.model.Customer;
import com.deloitte.cms.model.PremiumCustomer;
public class Client {

	public static void main(String[] args) {
		
		
		//hibernate.cfg.xml - and creates db connection
		Configuration configuration =new Configuration().configure();
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		PremiumCustomer customer = new PremiumCustomer(4,"parth","A",152);
		customer.setRewardPoints(415);
		System.out.println(customer);
		session.save(customer);
		transaction.commit();
		session.close();
		factory.close();
		
 	}
}
