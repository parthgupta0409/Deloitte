package com.delloite.cms.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.delloite.cms.dao.CustomerDAO;
import com.delloite.cms.model.Customer;
import com.delloite.utility.DbUtility;

public class CustomerDAOImpl implements CustomerDAO {

	private static final String GET_ALL_CUSTOMER_QUERY = "select * from hr.customer";

	@Override
	public List<Customer> getAllCustomers() {

		Connection connection = DbUtility.getMyConnection();
		boolean isUserExists = false;
		
		List<Customer> allCustomers = new ArrayList<Customer>();

		try {
			PreparedStatement statement = connection.prepareStatement(GET_ALL_CUSTOMER_QUERY);

			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				Customer customer = new Customer();
				customer.setCustomerId(resultSet.getInt(1));
				customer.setCustomerName(resultSet.getString(2));
				customer.setCustomerAddress(resultSet.getString(3));
				customer.setBillAmount(resultSet.getInt(4));
				allCustomers.add(customer);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return allCustomers;
	}

	private static final String INSERT_CUSTOMER_QUERY = "insert into hr.customer values (?,?,?,?)";

	@Override
	public boolean insertCustomer(Customer customer) {
		Connection connection = DbUtility.getMyConnection();
		int noOfRecords = 0;
		try {
			PreparedStatement statement = connection.prepareStatement(INSERT_CUSTOMER_QUERY);
			statement.setInt(1, customer.getCustomerId());
			statement.setString(2, customer.getCustomerName());
			statement.setString(3, customer.getCustomerAddress());
			statement.setInt(4, customer.getBillAmount());
			noOfRecords = statement.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (noOfRecords == 0)
			return false;
		else
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
		Connection connection = DbUtility.getMyConnection();
		int rows = 0;
		try {
			PreparedStatement statement = connection.prepareStatement(DELETE_CUSTOMER_QUERY);
			statement.setInt(1, customerId);

			rows = statement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		if (rows == 0)
			return false;
		else
			return true;

	}

	@Override
	public Customer searchCustomerById(int customerId) {
		Connection connection = DbUtility.getMyConnection();
		boolean isUserExists = false;
		Customer customer = new Customer();
		try {
			PreparedStatement statement = connection.prepareStatement(SELECT_CUSTOMER_QUERY);
			statement.setInt(1, customerId);

			ResultSet resultSet = statement.executeQuery();

			resultSet.next();
			customer.setCustomerId(resultSet.getInt(1));
			customer.setCustomerName(resultSet.getString(2));
			customer.setCustomerAddress(resultSet.getString(3));
			customer.setBillAmount(resultSet.getInt(4));

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return customer;
	}

	private static final String SELECT_CUSTOMER_QUERY = "select * from hr.customer where customerId = ?";

	@Override
	public boolean isCustomerExists(int customerId) {
		Connection connection = DbUtility.getMyConnection();
		boolean isUserExists = false;
		try {
			PreparedStatement statement = connection.prepareStatement(SELECT_CUSTOMER_QUERY);
			statement.setInt(1, customerId);

			ResultSet resultSet = statement.executeQuery();

			if (resultSet.next()) {
				isUserExists = true;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return isUserExists;
	}

}
