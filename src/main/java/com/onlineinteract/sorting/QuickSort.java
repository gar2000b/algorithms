package com.onlineinteract.sorting;

/**
 * The QuickSort algorithm is similar to MergeSort, however the
 * strategy is a little different. It does the work up front before
 * the binary recursion calls.
 * 
 * The first thing it does is orders the partition of the array based
 * on a pivot we assign as the last value in the array. The partition
 * function returns the pivot index to be used in the subsequent
 * recursion calls, which happens next.
 * 
 * The base case, to break out of this recursion is to determine is
 * the length of sub-array is less than 1, therefore return as by that
 * point, single or no element sub-arrays do not require sorting.
 * 
 * Time Complexity = O(n^2) worst case. Average = O(n log n).
 * 
 * @author Gary Black / Digilogue
 *
 */
public class QuickSort {

	public static void main(String[] args) {
		int[] A = { 83, 12, 61, 90, 22, 50, 6, 30 };
		quickSort(A, 0, A.length - 1);
		for (int i : A) {
			System.out.print(i + " ");
		}
	}

	public static void quickSort(int[] A, int start, int end) {
		if (end - start < 1)
			return;

		int pIndex = partition(A, start, end);
		quickSort(A, start, pIndex - 1);
		quickSort(A, pIndex + 1, end);
	}

	private static int partition(int[] A, int start, int end) {

		int pPos = end; // pivot position
		int pIndex = start; // pivot index

		for (int i = start; i < A.length; i++) {
			if (A[i] <= A[pPos]) {
				// If element is less than pivot then swap element
				// with pivot index position.
				int tmp = A[pIndex];
				A[pIndex] = A[i];
				A[i] = tmp;
				// If we reached the pivot element itself then don't
				// increment the pivot index.
				if (A[i] != A[pPos])
					pIndex++;
			}
		}

		return pIndex;
	}
}
