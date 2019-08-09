package com.delloite.cms.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.delloite.cms.dao.CustomerDAO;
import com.delloite.cms.model.Customer;
import com.delloite.utility.DbUtility;

public class CustomerDAOImpl implements CustomerDAO {

	private static final String GET_ALL_CUSTOMER_QUERY = "select * from hr.customer";
	
	Configuration configuration= new Configuration().configure();
	SessionFactory factory= configuration.buildSessionFactory();
	Session session;
	
	@Override
	public List<Customer> getAllCustomers() {
		List<Customer> allCustomers=new ArrayList<Customer>();
		
		session = factory.openSession();
		Query query = session.createQuery("from com.delloite.cms.model.Customer");
		Iterator<Customer> iterator = query.iterate();
		
		while(iterator.hasNext())
		{
			Customer customer = iterator.next();
			allCustomers.add(customer);
		}
//		Connection connection = DbUtility.getMyConnection();
//		boolean isUserExists = false;
//		
//		List<Customer> allCustomers = new ArrayList<Customer>();
//
//		try {
//			PreparedStatement statement = connection.prepareStatement(GET_ALL_CUSTOMER_QUERY);
//
//			ResultSet resultSet = statement.executeQuery();
//			while (resultSet.next()) {
//				Customer customer = new Customer();
//				customer.setCustomerId(resultSet.getInt(1));
//				customer.setCustomerName(resultSet.getString(2));
//				customer.setCustomerAddress(resultSet.getString(3));
//				customer.setBillAmount(resultSet.getInt(4));
//				allCustomers.add(customer);
//			}
//
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		return allCustomers;
	}

	

	@Override
	public boolean insertCustomer(Customer customer) {
	
		
		//hibernate.cfg.xml - and creates db connection
		Configuration configuration =new Configuration().configure();
		
		SessionFactory factory= configuration.buildSessionFactory();
		Session session=factory.openSession();
		
		Transaction transaction=session.beginTransaction();
		session.save(customer);
		transaction.commit();
		session.close();
		factory.close();
		return true;
		
	}

	private static final String UPDATE_CUSTOMER_QUERY = "update hr.customer set customerName = ?, customerAddress = ? ,"
			+ " billAmount = ? where customerId = ?";

	@Override
	public boolean updateCustomer(Customer customer) {
		Connection connection = DbUtility.getMyConnection();
		int noOfRecords = 0;
		try {
			PreparedStatement statement = connection.prepareStatement(UPDATE_CUSTOMER_QUERY);
			statement.setInt(4, customer.getCustomerId());
			statement.setString(1, customer.getCustomerName());
			statement.setString(2, customer.getCustomerAddress());
			statement.setInt(3, customer.getBillAmount());
			noOfRecords = statement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		if (noOfRecords == 0)
			return false;
		else
			return true;
	}

	private static final String DELETE_CUSTOMER_QUERY = "delete from hr.customer where customerId = ?";

	@Override
	public boolean deleteCustomer(int customerId) {
Configuration configuration =new Configuration().configure();
		
		SessionFactory factory= configuration.buildSessionFactory();
		Session session=factory.openSession();
		
		Transaction transaction=session.beginTransaction();
		Customer customer=new Customer();
		customer.setCustomerId(customerId);
		session.delete(customer);
		transaction.commit();
		session.close();
		factory.close();
		return true;
	}

	@Override
	public Customer searchCustomerById(int customerId) {
Configuration configuration =new Configuration().configure();
		
		SessionFactory factory= configuration.buildSessionFactory();
		Session session=factory.openSession();
		
		
		Customer customer=new Customer();
		customer=(Customer) session.get(Customer.class, customerId);
		session.delete(customer);
		
		session.close();
		factory.close();
		
		return customer;
	}

	private static final String SELECT_CUSTOMER_QUERY = "select * from hr.customer where customerId = ?";

	@Override
	public boolean isCustomerExists(int customerId) {
Configuration configuration =new Configuration().configure();
		
		SessionFactory factory= configuration.buildSessionFactory();
		Session session=factory.openSession();
		
		Transaction transaction=session.beginTransaction();
		Customer customer=new Customer();
		customer=(Customer) session.get(Customer.class, customerId);
		session.delete(customer);
		transaction.commit();
		session.close();
		factory.close();
		if(customer==null)
			return false;
		return true;
	}

}
