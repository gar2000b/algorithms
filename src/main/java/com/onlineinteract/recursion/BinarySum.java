package com.onlineinteract.recursion;

/**
 * Binary Sum algorithm. Sums up all values with a given set. 
 * Time Complexity: O(n)
 * 
 * @author Gary Black / Digilogue
 *
 */
public class BinarySum {

	public static void main(String[] args) {
		int[] data = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int result = binarySum(data, 0, data.length - 1);
		System.out.println(result);
	}

	public static int binarySum(int[] data, int low, int high) {

		if (low > high)
			return 0;
		else if (low == high)
			return data[low];
		else {
			int mid = (low + high) / 2;
			return binarySum(data, low, mid) + binarySum(data, mid + 1, high);
		}
	}

}
