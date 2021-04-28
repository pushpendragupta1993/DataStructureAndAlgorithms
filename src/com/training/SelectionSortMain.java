package com.training;

public class SelectionSortMain {
	
	public static void main(String a[]) {
		int[] arr = { 40, 10, -30, 45, 39, 32 };
		arr = selectionSort(arr);
	}

	public static int[] selectionSort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[index] > arr[j] )
					index = j;
			}
			int smallerNumber = arr[index];
			arr[index] = arr[i];
			arr[i] = smallerNumber;
			
			
			System.out.print("Iteration " + (i+1) + ": ");
			printArray(arr);
		}
		return arr;
	}
	
	public static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}


}