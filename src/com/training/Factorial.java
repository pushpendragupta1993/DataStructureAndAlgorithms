package com.training;

public class Factorial {

	public static void main(String[] args) {

		int num = 6;
		long factorial = 1;
		for (int i = 1; i <= num; ++i) 
			{
				factorial = factorial * i;
			}
		System.out.printf("Factorial of " + num + " is " + factorial);
	}
}