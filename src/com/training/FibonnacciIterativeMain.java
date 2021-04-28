package com.training;

public class FibonnacciIterativeMain {
	public static void main(String[] args) {
		System.out.println("Printing Fibonacci series:");
		int prev = 0;
		int next = 1;
		System.out.print(prev + " " + next);

		int numberOfElements = 10;
		int sum = 0;
		for (int i = 2; i < numberOfElements; i++) {
			sum = prev + next;
			System.out.print(" " + sum);
			prev = next;
			next = sum;
		}
	}

}