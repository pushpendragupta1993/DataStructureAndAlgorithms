package com.training;

public class FindSecondLargestMain {
	public static void main(String args[]) {
		int[] arr1 = { 7, 5, 6, 1, 4, 2 };
		int secondHighest = findSecondLargestNumberInTheArray(arr1);
		System.out.println("Second largest element in the array : " + secondHighest);
	}

	public static int findSecondLargestNumberInTheArray(int array[]) {
		//minimum value possible for integer is -2147483648
		int highest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > highest) {

				secondHighest = highest;
				highest = array[i];
				
			} else if (array[i] > secondHighest && array[i] != highest)
				secondHighest = array[i];
		}
		return secondHighest;
	}
}