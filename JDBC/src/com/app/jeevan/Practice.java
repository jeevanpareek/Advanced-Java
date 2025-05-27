package com.app.jeevan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Practice {
	public static void main(String[] args) throws Exception {
		//load the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//get the connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "1234");
		//create statement
		Statement stmt = con.createStatement();
		//execute query
		int rowsAffected = stmt.executeUpdate("create database jeevan");
		int rowsAffected3 = stmt.executeUpdate("use jeevan");
		int rowsAffected1 = stmt.executeUpdate("create table employees(id int, name varchar(50), course varchar(50), mobilenumber varchar(50))");
		int rowsAffected2 = stmt.executeUpdate("insert into employees(id,name,course,mobilenumber)"
				+ "values"
				+ "(1,'Jeevan','JAVA',8107072971),"
				+ "(2,'Ridam','JAVA',8596852563),"
				+ "(3,'Arun','JAVA',9563258953);");
		//process the result
		System.out.println("Success");
		//close the connection
		con.close();
	}
}
