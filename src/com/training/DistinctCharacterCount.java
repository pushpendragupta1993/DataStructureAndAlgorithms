package com.training;

import java.util.HashMap;
import java.util.Map;

public class DistinctCharacterCount {

	public static void main(String[] args) {

		String str1 = "abcdABCDabcd";
		char[] chars = str1.toCharArray();
		Map<String, Integer> charsCount = new HashMap<>();

		charsCount.put("a", 1);
		charsCount.put("a", 1);
		charsCount.put("a", 1);
		charsCount.put("a", 1);

		System.out.println(charsCount);
	}

}
