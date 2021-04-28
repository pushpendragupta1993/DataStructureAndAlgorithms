package com.training;

public class StringRotation {

	public static void main(String[] args) {
		boolean isStrRotation = isRotation("pgupta", "apgupt");
		System.out.println("Is rotation of each other : " +isStrRotation );
	}

	public static boolean isRotation(String str1, String str2) {
		str1 = str1.concat(str1);

		if (str1.contains(str2)) {
			return true;
		}
		return false;

	}

}