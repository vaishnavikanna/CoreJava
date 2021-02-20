package com.javapractice;

public class addTwoNumbers {
	
	public static void main(String [] args) { //main function - entry point to java
		int num1 = 4;
		int num2 = 5;
		addTwoNumbers a = new addTwoNumbers(); // creating a class object
		int result = a.add(num1, num2); // calling add function with the created object a
		System.out.println("Result of addition is" +" "+ result); // same logic can be used to multiply, subtract and divide numbers
	}
	
	public int add(int a , int b) { //add function
		int result = a+b;
		return result;
	}
	

}
