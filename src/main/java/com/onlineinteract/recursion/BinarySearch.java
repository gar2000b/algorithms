package com.onlineinteract.recursion;

/**
 * Binary Search algorithm. Searches for target value within an
 * already sorted set of data. Time Complexity: O(logb n)
 * 
 * @author Gary Black / Digilogue
 *
 */
public class BinarySearch {

	public static void main(String[] args) {
		int[] data = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println(binarySearch(data, 8, 1, 10));
	}

	public static boolean binarySearch(int[] data, int target, int low, int high) {
		if (low > high)
			return false; // interval empty; no match
		else {
			int mid = (low + high) / 2;
			if (target == data[mid])
				return true; // found a match
			else if (target < data[mid])
				// recur left of the middle
				return binarySearch(data, target, low, mid - 1);
			else
				// recur right of the middle
				return binarySearch(data, target, mid + 1, high);
		}
	}
}
