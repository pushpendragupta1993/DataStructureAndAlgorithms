package com.training;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListOfStrings {
	public static void main(String[] args) {

		List<String> listOfString = new ArrayList<>();
		
		listOfString.add("Apple");
		listOfString.add("Mango");
		listOfString.add("Orange");
		listOfString.add("kivi");
		listOfString.add("Pineapple");
		listOfString.add("Jackfruit");

		Collections.sort(listOfString, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.compareTo(s2);
			}
		});

		listOfString.stream().forEach(i -> System.out.println(i));
	}
}  