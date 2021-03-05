package com.htl.algorithms;

public class BinarySearch {

	public static void main(String[] args) {
		
		int[] arr = {6,1,7,3,6,9,0};
		
		int toSearch = 6;
		int low = 0;
		int high = arr.length-1;
		
		System.out.println("Element position : "+binarySearch(arr,low,high,toSearch));
	}
	static int binarySearch(int[] arr, int low, int high, int key) {
		while(low<=high) {
			int mid = (low+high)/2;
			if(arr[mid]<key) {
				low=mid+1;
			}else if(arr[mid]>key) {
				high = mid-1;
			}else {
				return mid;
			}
		}
		return -1;
		
	}
}
