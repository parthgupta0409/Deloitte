package com.deloitte.client;

import java.util.Scanner;


import com.deloitte.ems.dao.EmployeeDAO;
import com.deloitte.ems.dao.impl.EmployeeDAOImpl;
import com.deloitte.ems.model.Employee;

public class EmployeeClient 

	{

	 public static void main(String[] args) 
		
		{
		 
		 EmployeeDAO employeeDAO=new EmployeeDAOImpl();
			Scanner sc =new Scanner(System.in);
			
			
			System.out.println("Enter the First Name of the Employee");
			String firstName  = sc.next();
			System.out.println("Enter the Last Name of the Employee");
			String lastName  = sc.next();
			System.out.println("Enter the Date Of Birth of Employee in DD/MM/YYYY format");
			String dateOfBirth = sc.next();
			System.out.println("Enter the Employee Address");
			String employeeAddress = sc.next();
			
			String employeeId = firstName.substring(0,2).toUpperCase()+lastName.substring(0,2).toUpperCase()+(int)(Math.random()*1000);
		
			Employee employee = new Employee(firstName, lastName, employeeId, dateOfBirth,employeeAddress);
			
			boolean result=employeeDAO.insertEmployee(employee);
			
			System.out.println(result);
			
			
		}
	 }
		 
		 
		
	
	
