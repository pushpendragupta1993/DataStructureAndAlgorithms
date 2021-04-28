package com.training;

public class FindElements {
	public int findnumber(int[] numbers, int n) {
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == n) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] numbers = { 5, 9, 6, 12, 56, 77 };
		FindElements findElements = new FindElements();
		int index = findElements.findnumber(numbers, 9);
		System.out.println("found at index " + index);
	}
}
