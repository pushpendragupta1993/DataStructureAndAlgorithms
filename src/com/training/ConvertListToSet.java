package com.training;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConvertListToSet {

	public static void main(String[] args) {

		List<String> listOfString = new ArrayList<>();

		listOfString.add("Apple");
		listOfString.add("Mango");
		listOfString.add("Orange");
		listOfString.add("Mango");
		listOfString.add("Apple");
		listOfString.add("Apple");

		System.out.println("------ elements of List -------");
		listOfString.stream().forEach(i -> System.out.println(i));

		Set<String> hSet = new HashSet<String>();
		for (String x : listOfString) {
			hSet.add(x);
		}

		System.out.println("------ elements of set ------");
		hSet.stream().forEach(i -> System.out.println(i));

	}
}
