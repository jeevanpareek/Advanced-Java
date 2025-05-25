package com.app.jeevan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {
	public static void main(String[] args) throws Exception {
		//load the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//get the connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/regex", "root", "1234");
		//create statement
		Statement stmt = con.createStatement();
		//execute query
		int rowsAffected = stmt.executeUpdate("create table students"
				+ "(Id int , Name varchar(50), course varchar(20),Moblienumber varchar(50));");
		//process the result
		System.out.println("rowsAffected = "+rowsAffected);
		//close the connection
		con.close();
	}
}
