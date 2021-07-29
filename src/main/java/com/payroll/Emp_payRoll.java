package com.payroll;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Enumeration;

public class Emp_payRoll {

	public static void main(String[] args) {
		String jdbcURL = "jdbc:mysql://localhost:3306/payroll_services";
		String userName = "root";
		String password = "shubha@1995.";
		Connection con;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded!");

		} catch (ClassNotFoundException e) {
			throw new IllegalStateException("Cannot find the driver in the classpath!", e);

		}

		try {
			System.out.println("Connecting to database:" + jdbcURL);
			con = (Connection) DriverManager.getConnection(jdbcURL, userName, password);
			System.out.println("Connection is Successful!!!!" + con);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
