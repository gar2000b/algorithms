package com.onlineinteract.time_complexity;

public class TotalRange {
	public static void main(String[] args) {
		int n = 10;

		/**
		 * Counting numbers 1 + 2 + 3 ... + 10 = 55. This has the fastest Time
		 * Complexity of O(1) as the fastest growing term / dominant operation
		 * is a single atomic operation.
		 */
		int result = (n * (n + 1)) / 2;
		System.out.println("Total count of n = 10: " + result);
	}
}
