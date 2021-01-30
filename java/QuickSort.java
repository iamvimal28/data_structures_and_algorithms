package com.htl.algorithms;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {

		int[] arr = { 6, 1, 7, 3, 6, 9, 0 }; // unsorted array
		         // { 0, 1, 2, 3, 4, 5, 6 } index
		int arrLength = arr.length; // array length 7
		System.out.println(arrLength);

		// call quickSort method
		quickSort(arr, 0, arrLength-1);

		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	static void swap(int[] arr, int index1, int index2) {
		int temp;
		temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}

	static int partition(int[] arr, int start, int end) {
		// taking the right most element as pivot
		int pivot = arr[end];
		int partitionIndex = start; // setting the partition index as start initially

		for (int i = start; i < end; i++) {
			if (arr[i] <= pivot) {
				swap(arr, i, partitionIndex);
				partitionIndex++;
			}
		}
		swap(arr, partitionIndex, end);
		return partitionIndex;
	}

	static void quickSort(int[] arr, int start, int end) {
		if (start < end) {
			int partitionIndex = partition(arr, start, end);
			quickSort(arr, start, partitionIndex - 1);
			quickSort(arr, partitionIndex + 1, end);
		}
	}
}
