package com.training;

import java.util.*;

public class ArraySet {

	public static void main(String[] args) {

		String[] array = { "a", "b", "b", "c", "d", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p" };
		Set<String> set = new HashSet<>(Arrays.asList(array));

		System.out.println("Set: " + set);
	}
}