package com.training;

public class FindCharacterCount {

	public static void main(String[] args) {
		String string1 = "if you like this video please subscribe to be updated with the latest videos";
		String string2 = string1.replaceAll("i", "");
		int charcount = string1.length() - string2.length();
		System.out.println("character count is : " + charcount);
	}
}
