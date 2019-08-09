package com.deloitte.utility;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DbUtility 
	{
	public static Connection getMyConnection() 
	
	{
		
		
		/*FileReader reader = null;
		try 
		{
			reader = new FileReader("property.properties");
		} 
		catch (FileNotFoundException e1) 
		{
			// TODO Auto-generated catch block
			
			e1.printStackTrace();
		}
		Properties properties=new Properties();
		try 
		{
			properties.load(reader);
		} 
		catch (IOException e1) 
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}*/
		
		
		
		/*String driver=properties.getProperty("driver");
		String url=properties.getProperty("url");
		String pass=properties.getProperty("password");
		String username=properties.getProperty("username");*/
		
		Connection connection =null;
		
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:HR/HR@localhost:1521:XE";
		String pass="system";
		String username="system";
		//1. Load the driver
				try {
					Class.forName(driver);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//2. Make the connection
				try {
					connection=DriverManager.getConnection(url, username, pass);
	
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				return connection;
	}

}
