package com.javapractice;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String [] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter the number upto which fibonacci series is required: ");
		int count = userInput.nextInt();
		userInput.close();
		int firstNumber = 0;
		int secondNumber = 1;
		int sumOfPreceedingTwoNumbers;
		for(int i=0;i<=count;++i) {
			System.out.println(firstNumber + " ");
			sumOfPreceedingTwoNumbers = firstNumber + secondNumber;
			firstNumber = secondNumber;
			secondNumber = sumOfPreceedingTwoNumbers;
		}
		
	}

}
