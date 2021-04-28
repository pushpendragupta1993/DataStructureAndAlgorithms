package com.training;

import java.util.Arrays;

class TwoSumLeetCode {
	
	public static int[] twoSum(int[] input, int target) {
		int[] result = new int[2];
		for (int i = 0; i < input.length - 1; i++) {
			for (int j = i + 1; j < input.length; j++) {
				if (input[i] + input[j] == target) {
					result[0] = i;
					result[1] = j;
					return result;
				}
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[] input = {1,6,7,9,2,4};
		System.out.println(Arrays.toString(twoSum(input, 16)));
		
		
	}
}