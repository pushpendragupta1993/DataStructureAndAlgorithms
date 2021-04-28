package com.training;

public class Palindrome {
	public static void main(String[] args) {

		String orginalWord = "madam";
		String reverseWord = "";


		for (int i = orginalWord.length() - 1; i >= 0; i--) {
			reverseWord = reverseWord + orginalWord.charAt(i);
		}

		if (orginalWord.equals(reverseWord)) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String is not palindrome");
		}
	}
}