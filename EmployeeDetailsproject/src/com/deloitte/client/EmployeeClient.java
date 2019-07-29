package com.deloitte.client;

import java.util.Scanner;


import com.deloitte.ems.dao.EmployeeDAO;
import com.deloitte.ems.dao.impl.EmployeeDAOImpl;
import com.deloitte.ems.model.Employee;

public class EmployeeClient {

	 public static void main(String[] args) {
		 
		 EmployeeDAO employeeDAO=new EmployeeDAOImpl();
			Scanner sc =new Scanner(System.in);
			
			
			System.out.println("First Name");
			String firstName  = sc.next();
			System.out.println(" Last Name");
			String lastName  = sc.next();
			System.out.println("Date Of Birth in DD/MM/YYYY format");
			String dateOfBirth = sc.next();
			System.out.println("Employee Address");
			String employeeAddress = sc.next();
			
			String employeeId = firstName.substring(0,2).toUpperCase()+lastName.substring(0,2).toUpperCase()+(int)(Math.random()*1000);
		
			Employee employee = new Employee(firstName, lastName, employeeId, dateOfBirth,employeeAddress);
			
			boolean result=employeeDAO.insertEmployee(employee);
			
			System.out.println(result);
			
			
			/*customer.setCustomerId(5);
			customer.setCustomerName("Ishita");
			customer.setCustomerAddress("Pune");
			customer.setBillAmount(586870);
			boolean result=customerDAO.insertCustomer(customer);*/
			
		}
	 }
		 
		 
		
	
	
