package com.app.jeevan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Demo {
	public static void main(String[] args) throws Exception {
		//load the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//get connection url
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","1234");
		//create the statement
		Statement stmt = con.createStatement();
		//execute the qurey
		int rowsaffected = stmt.executeUpdate("create database Regex");
		//process the result
		System.out.println("rows Affected = "+rowsaffected);
		//close the connection
		con.close();
	}
}
