package com.onlineinteract.codility.lessons.counting;

public class CountingElements {
	public static void main(String[] args) {

		// Counting Example
		int[] A = { 1, 2, 3, 1, 4, 5, 3, 6, 7, 2, 8 };
		int m = 10;

		int[] count = counting(A, m);

		for (int i = 0; i < count.length; i++) {
			System.out.println("i(" + i + ") = " + count[i]);
		}
	}

	/**
	 * Generates a count array based on array of integer values passed in.
	 * 
	 * @param A
	 *            : array of integers passed in.
	 * @param m
	 *            : max number in set.
	 * @return int[] count
	 */
	private static int[] counting(int[] A, int m) {
		int[] count = new int[m + 1];
		for (int i = 0; i < A.length; i++) {
			count[A[i]] += 1;
		}
		return count;
	}
}
