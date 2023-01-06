package com.oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBOperations {
	
	Connection conn;
	Statement statement;
	
	public void getconnection() throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");
		statement = conn.createStatement();
	}
	
	public void AddEmployee() throws SQLException {
				
		String qry = "insert into employee values(002, 'temp', 'Magic')";
		
		int result = statement.executeUpdate(qry);
		
	}

}
