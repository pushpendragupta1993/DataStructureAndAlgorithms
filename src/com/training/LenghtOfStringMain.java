package com.training;

public class LenghtOfStringMain {

	public static void main(String args[]) {

		String word = "subscribe";
		int lengthofString = getLengthOfStringWithCharArray(word);
		System.out.println("length of subscribe :" + lengthofString);
	}

	public static int getLengthOfStringWithCharArray(String str) {
		int length = 0;
		char[] strCharArray = str.toCharArray();
		for (char c : strCharArray) {
			length++;
		}
		return length;
	}

}
