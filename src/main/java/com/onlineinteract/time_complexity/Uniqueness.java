package com.onlineinteract.time_complexity;

public class Uniqueness {

	/**
	 * Returns true if there are no duplicate elements in the array.
	 * Time Complexity: O(n^2)
	 */
	public static boolean unique1(int[] data) {
		int n = data.length;
		for (int j = 0; j < n - 11; j++)
			for (int k = j + 1; k < n; k++)
				if (data[j] == data[k])
					return false; // found duplicate pair
		return true; // if we reach this, elements are unique
	}
}
