package com.htl.algorithms;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = { 6, 1, 7, 3, 6, 9, 0 }; // unsorted array
		         // { 0, 1, 2, 3, 4, 5, 6 } index
		int arrLength = arr.length; // array length 7
		System.out.println(arrLength);
		
		//call selectionSort method
		selectionSort(arr,arrLength);
		
		for(int i : arr) {
			System.out.print(i+" ");
		}
	}
	
	/**
	 * 
	 * Selection sort has the time complexity for O(n^2) (Big O of n squared)
	 *
	 */
	static void selectionSort(int[] arr, int arrLen) {
		int minimum;
		for(int i=0; i<arrLen-1; i++) {
			
			minimum = i; //assuming to be minimum element index
			int temp;
			for(int j=i+1; j<arrLen; j++) {// ignoring first sorted element every time
				// To Find the minimum element
				if(arr[j]<arr[minimum]) {
					minimum = j;
				}
			}
			//Swapping elements
			temp = arr[i];
			arr[i] = arr[minimum];
			arr[minimum] = temp;
		}
	}
}
