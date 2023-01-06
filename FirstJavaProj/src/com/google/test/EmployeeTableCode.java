package com.google.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class EmployeeTableCode {

	Connection conn;
	Statement statement;
	ResultSet rs;

	public void getConnection() throws ClassNotFoundException, SQLException {
		//		Register Class
		Class.forName("com.mysql.jdbc.Driver");
		//		Connection
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");
		//		Statement
		statement = conn.createStatement();
	}

	public void addEmployee(int eid, String name, String address) throws SQLException {
		String qry = "insert into employee values("+eid+",'"+name+"','"+address+"')";
		System.out.println(qry);
		Statement statement = conn.createStatement();
		statement.executeUpdate(qry);
		System.out.println("Inserted record successfully");

	}
	public void updateEmployee(int eid, String new_name) throws SQLException {
		String qry = "update employee set name= '"+new_name+"' where Id = '"+eid+"'";
		System.out.println(qry);
		//		Statement statement = conn.createStatement();
		statement.executeUpdate(qry);
		System.out.println("Updated record successfully");
	}
	public void DeleteEmployee(int eid) throws SQLException {
		String qry = "delete from employee where Id = '"+eid+"'";
		System.out.println(qry);
		//		Statement statement = conn.createStatement();
		statement.executeUpdate(qry);
		System.out.println("Deleted record successfully");
	}
	public void printEmployee() throws SQLException {
		String qry = "select * from employee";
		System.out.println(qry);
		//		Statement statement = conn.createStatement();
		rs = statement.executeQuery(qry);
		while (rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));


		}
		System.out.println("Displayed all employees");
	}


}
