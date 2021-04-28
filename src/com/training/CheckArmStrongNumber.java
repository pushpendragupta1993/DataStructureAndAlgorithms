package com.training;

public class CheckArmStrongNumber {
	public static void main(String[] args) {

		boolean arnstrongnumber = isArmStrongNumber(153);
		System.out.println(" Is 153 Armstrong number: " + arnstrongnumber);
		
	}

	public static boolean isArmStrongNumber(int number) {
		int sum = 0;
		int originalNumber = number;
		while (number != 0) {

			int remainder = number % 10;
			sum = sum + remainder * remainder * remainder;
			number = number / 10;
		}
		if (originalNumber == sum) {
			return true;
		}
		return false;
	}
}