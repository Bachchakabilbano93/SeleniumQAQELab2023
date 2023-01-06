package com.oracle;

import java.sql.SQLException;
import java.util.Scanner;

public class DBOperationsUsingMenu {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		DBOperations db = new DBOperations();
		db.getconnection();
		
		System.out.println("Done");
		
		boolean progexit = true;
		while (!progexit) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Please enter your choice\n" + 
					"			1. Add User\n" + 
					"			2. Update User\n" + 
					"			3. Delete User\n" + 
					"			4. Display All Users\n" + 
					"			5. Exit");
			int choice = scanner.nextInt();
			System.out.println("You have selected "+choice);
//			if (choice == 5) {
//				progexit = true;
//				
//			}
			switch (choice) {
			case 1:
				System.out.println("Add a user");
				break;

			default:
				break;
			}
			
		}

	}

}
