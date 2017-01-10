package com.onlineinteract.arrays;

/**
 * Created by Gary Black / Digilogue on 10/11/2016.
 */
public class InsertionSort {

	/**
	 * Implementing Insertion Sort from scratch (Gary Black). The first loop
	 * walks up the array from index 1. For each iteration, we have another loop
	 * where we walk backwards shifting the previous index to the right if the
	 * previous value is greater than the current value, else we break the inner
	 * loop.
	 * 
	 * Note: the index j for the inner loop is declared outside the inner loop.
	 * this ensures that it can still be accessed outside the loop. We access
	 * this value outside the loop to finally slot in the current value at index
	 * pos j.
	 * 
	 * @param data
	 */
	public static void insertionSort2(char[] data) {
		for (int i = 1; i < data.length; i++) {
			char current = data[i];
			int j;
			for (j = i; j > 0; j--) {
				if (current < data[j - 1]) {
					data[j] = data[j - 1]; // shift data to right.
				} else
					break;
			}
			data[j] = current; // inject current value to new position.
		}
	}
	
	/**
	 * Insertion-sort of an array of characters into ascending order
	 * [small..large].
	 * <p>
	 * X2 loop constructs. The outer loop iterates over the whole collection
	 * starting from index position 1.
	 * <p>
	 * The inner loop takes that (current index pos from out loop) and works
	 * back to 0 swapping (current with current - 1) if (current is smaller than
	 * current - 1). If it is not, we break out the loop and assign the current
	 * inner index position to the current char.
	 * 
	 * Time Complexity = Θ(n^2).
	 */
	public static void insertionSort(char[] data) {
		int n = data.length;
		for (int k = 1; k < n; k++) { // begin with second character
			char cur = data[k]; // time to insert cur=data[k]
			int j = k; // find correct index j for cur
			// thus, data[j-1] must go
			// after cur
			while (j > 0 && data[j - 1] > cur) {
				data[j] = data[j - 1]; // slide data[j-1] rightward
				j--; // and consider previous j for cur
			}
			data[j] = cur; // this is the proper place for cur
		}
	}

	public static void main(String[] args) {
		char[] a = { 'C', 'E', 'B', 'D', 'A', 'I', 'J', 'L', 'K', 'H', 'G', 'F' };
		System.out.println(java.util.Arrays.toString(a));
		insertionSort2(a);
		System.out.println(java.util.Arrays.toString(a));
	}
}