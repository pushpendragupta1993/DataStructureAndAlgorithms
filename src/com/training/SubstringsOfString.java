package com.training;

import java.util.HashSet;
import java.util.Set;

public class SubstringsOfString {
	public static void main(String args[]) {
		String str = "abbc";
		Set<String> uss = new HashSet<>();
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) 
			{
				if(uss.add(str.substring(i, j))) {
				System.out.println(str.substring(i, j));
				}
			}
		}
	}
}