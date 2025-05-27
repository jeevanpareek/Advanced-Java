package com.app.jeevan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertIntoTable {
	public static void main(String[] args) throws Exception {
		//load the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//get the connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/regex", "root", "1234");
		//create the statement
		Statement stmt = con.createStatement();
		//execute query
		int rowsAffected = stmt.executeUpdate("insert into students"
				+ "(Id, Name, course, Moblienumber)"
				+ "values"
				+ "(1,'Jeevan','JAVA',8107072971),"
				+ "(2,'Ridam','JAVA',8596852563),"
				+ "(3,'Arun','JAVA',9563258953),"
				+ "(4,'Ajay','JAVA',9865823659),"
				+ "(5,'Abhishek','JAVA',9856963658),"
				+ "(6,'Vikram','JAVA',8965236541);");
		//process the result
		System.out.println("Rows Affected = "+rowsAffected);
		//close the connection
		con.close();
	}
}
