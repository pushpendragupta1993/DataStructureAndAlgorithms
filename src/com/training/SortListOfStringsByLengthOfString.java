package com.training;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListOfStringsByLengthOfString {
	public static void main(String[] args) {

		List<String> listOfString = new ArrayList<>();

		listOfString.add("yyyyy");
		listOfString.add("zz");
		listOfString.add("aaaa");
		listOfString.add("dddddd");
		listOfString.add("ggggggg");
		listOfString.add("zzzzzzzzz");

		Collections.sort(listOfString, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.length() -s2.length();
			}
		});

		listOfString.stream().forEach(i -> System.out.println(i));
	}
}