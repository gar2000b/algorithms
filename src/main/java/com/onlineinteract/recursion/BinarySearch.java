package com.onlineinteract.recursion;

/**
 * Binary Search algorithm. Searches for target value within an already sorted
 * set of data. Time Complexity: O(logb n)
 * 
 * @author Gary Black / Digilogue
 *
 */
public class BinarySearch {

	public static void main(String[] args) {
		int[] data = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println(binarySearch(data, 7, 0, data.length - 1));
	}

	public static boolean binarySearch(int[] data, int target, int low, int high) {
		if (low > high || (low == 0 && high == 0))
			return false; // no match
		else {
			int mid = (low + high) / 2;
			if (target == data[mid])
				return true; // match
			else if (target < data[mid]) // left
				return binarySearch(data, target, low, mid);
			else // right
				return binarySearch(data, target, mid + 1, high);
		}
	}
}
