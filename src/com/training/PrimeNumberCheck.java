package com.training;

public class PrimeNumberCheck {

	public static void main(String[] args) {

		int num = 33;
		int i = 2;
		int flag = 0;
		while (i <= num / 2) {
			if (num % i == 0) {
				flag++;
				break;
			}
			++i;
		}
		if (flag == 0) {
			System.out.println(num + " is a prime number.");
		}else {
			System.out.println(num + " is not a prime number.");
		}
	}
}