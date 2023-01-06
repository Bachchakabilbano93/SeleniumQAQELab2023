package com.oracle;

import java.util.Scanner;

public class MathLib {
	
	int num1 = 13;
	int num2 = 20;
	
		public void getValue() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter your name");
//		String name = scanner.nextLine();
		int id = scanner.nextInt();
		System.out.println("You entered "+id);
		
	}
	
	public void Add() {
		int sum = num1 + num2;
		
		System.out.println("Sum of "+num1+" and "+num2+" is "+sum);
		
	}
	
	public int sub(int op1, int op2) {
		int diff = op1 - op2;
//		System.out.println(diff);
		
		return diff;
	}

}
