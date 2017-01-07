package com.onlineinteract.recursion;

/**
 * Returns the sum of the first n integers of the given array. 
 * Time Complexity: O(n).
 * 
 * @author Gary Black / Digilogue
 *
 */
public class LinearSum {

	public static void main(String[] args) {
		System.out.println(linearSum(new int[] { 4, 3, 6, 2, 8 }, 5));
	}

	public static int linearSum(int[] data, int n) {

		if (n == 0)
			return 0;

		return data[n - 1] + linearSum(data, n - 1);
	}
}
