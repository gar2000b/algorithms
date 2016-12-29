package com.onlineinteract.codility.lessons.cyclic_rotation;

public class Solution {

	public static int[] solution(int[] A, int K) {

		int[] B = new int[A.length];

		if (A.length == 1) {
			return A;
		}

		for (int i = 0; i < A.length; i++) {

			int position = 0;
			if (K > A.length) {
				position = (K - A.length) + i;
				if (position >= A.length) {
					position = (i + K) % A.length;
				}
			} else {
				position = (i + K) % A.length;
			}

			B[position] = A[i];
		}

		return B;
	}

	public static int[] solution2(int[] A, int K) {

		int nextPos = 0;
		
		int[] B = new int[A.length];

		for (int i = 0; i < A.length; i++) {
			nextPos = nextPosition(i, K, A.length);
			B[nextPos] = A[i];
		}

		return B;
	}

	private static int nextPosition(int currentPos, int advanceBy,
			int arraylength) {
		
		if (advanceBy > arraylength)
			advanceBy = advanceBy % arraylength;
		
		if (arraylength == 1)
			return currentPos;

		int nextPos = 0;

		if (currentPos + advanceBy > arraylength - 1)
			nextPos = currentPos + advanceBy - arraylength;
		else
			nextPos = currentPos + advanceBy;

		return nextPos;
	}
}
