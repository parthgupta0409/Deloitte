package com.deloitte.ems.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.deloitte.ems.dao.EmployeeDAO;
import com.deloitte.ems.model.Employee;
import com.deloitte.utility.DbUtility;



public class EmployeeDAOImpl implements EmployeeDAO {
	
	private static final String  INSERT_EMPLOYEE_QUERY= "Insert into hr.employee values(?,?,?,?,?)";
	public boolean insertEmployee(Employee employee) {
		Connection connection =DbUtility.getMyConnection();
		int result=0;
		try {
			PreparedStatement statement= connection.prepareStatement(INSERT_EMPLOYEE_QUERY);
			
			statement.setString(1,employee.getfName());
			statement.setString(2,employee.getlName());
			statement.setString(3,employee.getEmpId());
			statement.setString(4,employee.getDob());
			statement.setString(5,employee.getAddress());
			result=statement.executeUpdate();
			


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(result>0)
			return true;
		return false;
	}


}
