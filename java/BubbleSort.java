package com.htl.algorithms;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] arr = {6,1,7,3,6,9,0}; // unsorted array
				  //{0,1,2,3,4,5,6} index
		int arrLength = arr.length; //array length 7
		System.out.println(arrLength);
		
		//call bubbleSort method
		bubbleSort(arr,arrLength);
		
		for(int i : arr) {
			System.out.print(i+" ");
		}
		

	}
	
	/**
	 * Bubble sort has the time complexity for O(n^2) (Big O of n squared)
	 * because the entire array needs to be iterated for every element
	 */
	public static void bubbleSort(int[] arr, int len) {
		int loopTill = len-1;
		
		int temp;
		for(int i=0; i<loopTill; i++) { // To be looped till last second element in array
			/**
			 * Whenever the inner loop completes the last element in arary is sorted
			 * So, everytime the outer loop (i) increments then inner loop (j) is decreases by i
			 */
			for(int j=0; j<loopTill-i; j++) { //When ever this loop completes last element in array is sorted
				if(arr[j]> arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			
		}
	}
}
