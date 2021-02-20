package com.javapractice;

import java.util.Scanner;

public class findFactorial {
	
	public static void main(String [] args) {
		int number;
		
	Scanner userInput = new Scanner(System.in);
	System.out.println("Enter a number to find the factorial:");
	number = userInput.nextInt();
	userInput.close();
	findFactorial f = new findFactorial();
	int factorialResult = f.factorialFunction(number);
	System.out.println("Result of factorial is:" + factorialResult);
	}
	
	public int factorialFunction(int number) {
		int factorialResult;
		if(number == 1) {
			return 1;
		}
		else { 
			factorialResult = factorialFunction(number-1)*number; // recursion as factorialFunction calls itself again
			return factorialResult;
		}
	}

}
