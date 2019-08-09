package com.deloitte.MyFirstMaven;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException
    {
    	Class.forName("oracle.jdbc.driver.OracleDriver");
        System.out.println( "Driver Loaded" );
    }
}
