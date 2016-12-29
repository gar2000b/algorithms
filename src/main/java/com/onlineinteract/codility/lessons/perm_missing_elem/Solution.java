package com.onlineinteract.codility.lessons.perm_missing_elem;

public class Solution {
	public static int solution(int[] A) {

		// long missing = (A.length + 1L) * (A.length + 2) / 2;
		long missing = 0;
		for (int i = 1; i < A.length + 2; i++) {
			missing += i;
		}

		for (int element : A) {
			missing -= element;
		}
		return (int) missing;
	}

	public static int solution2(int[] A) {

		long totalCount = (((long) (A.length) + 1) * ((long) (A.length) + 1 + 1)) / 2;
		long actualCount = 0;

		for (int i = 0; i < A.length; i++) {
			actualCount += A[i];
		}

		return (int) (totalCount - actualCount);
	}

	public static void main(String[] args) {
		long totalCount = (((long) (50000l) + 1) * ((long) (50000l) + 1 + 1)) / 2;
		System.out.println("total count: " + totalCount);
	}
}
