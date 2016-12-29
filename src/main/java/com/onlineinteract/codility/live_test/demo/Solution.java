package com.onlineinteract.codility.live_test.demo;

public class Solution {

	public static void main(String[] args) {
		int[] A = { -1, 3, -4, 5, 1, -6, 2, 1 };
		solution(A);
	}

	public static int solution(int[] A) {

		for (int i = 0; i < A.length; i++) {

			long hTotal = 0;
			if (i != 0) {
				for (int h = i - 1; h >= 0; h--) {
					hTotal += A[h];
				}
			}

			long jTotal = 0;
			for (int j = i + 1; j < A.length; j++) {
				jTotal = jTotal + A[j];
			}

			if (jTotal == hTotal) {
				return i;
				// System.out.println(i);
			}

		}

		return -1;
	}
}