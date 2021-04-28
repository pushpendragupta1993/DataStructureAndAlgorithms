package com.training;

import java.util.HashSet;
import java.util.Set;

public class StringAllUniqueCharMain {

	public static void main(String[] args) {
		boolean isUnique = hasAllUniqueChars("subscribe");
		System.out.println("subscribe has all unique chars : " + isUnique);
	}

	public static boolean hasAllUniqueChars(String word) {
		Set<Character> alphaSet = new HashSet<>();

		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			if (!alphaSet.add(c)) {
				return false;
			}
		}

		return true;
	}
}