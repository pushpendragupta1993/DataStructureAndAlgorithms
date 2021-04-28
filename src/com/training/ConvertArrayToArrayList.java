package com.training;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayToArrayList {
	
	public static void main(String[] args) {

		
		String[] arrayOfProgrammingLanguage = { "Java", "Python", "C" };
		System.out.println("Array: " + Arrays.toString(arrayOfProgrammingLanguage));


		ArrayList<String> listOfProgrammingLanguages = new ArrayList<>(Arrays.asList(arrayOfProgrammingLanguage));

		System.out.println("ArrayList: " + listOfProgrammingLanguages);

	}
}