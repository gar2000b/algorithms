package com.onlineinteract.recursion;

public class ReverseArray {

	public static void main(String[] args) {
		int[] data = { 1, 2, 3, 4, 5 };
		reverseArray(data, 0, 4);
		for (int i : data) {
			System.out.println(i);
		}
	}

	/**
	 * Reverses the contents of subarray data[low] through data[high]
	 * inclusive. Time Complexity = O(n), even though it looks like
	 * O(n/2) because of constant amount of work.
	 */
	public static void reverseArray(int[] data, int low, int high) {
		if (low < high) {
			int temp = data[low];
			data[low] = data[high];
			data[high] = temp;
			reverseArray(data, ++low, --high);
		}
	}
}
