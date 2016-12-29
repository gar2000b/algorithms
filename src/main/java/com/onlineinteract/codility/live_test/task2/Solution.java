package com.onlineinteract.codility.live_test.task2;

import java.util.Arrays;

public class Solution {
	 static int solution(int[] A, int[] B) {
	 int n = A.length;
	 int m = B.length;;
	 Arrays.sort(A);
	 Arrays.sort(B);
	 int i = 0;
	 for (int k = 0; k < n; k++) {
	 if (i < m && B[i] < A[k])
	 i += 1;
	 if (A[k] == B[i])
	 return A[k];
	 }
	 return -1;
	 }

//	static int solution(int[] A, int[] B) {
//		int n = A.length;
//		int m = B.length;
//		;
//		Arrays.sort(A);
//		Arrays.sort(B);
//		int i = 0;
//		int j = 0;
//
//		for (i = 0; i < A.length; i++) {
//			if (A[i] == B[j]) {
//				return A[i];
//			}
//
//			if (A[i] < B[j]) {
//				i = i + 1;
//			}
//
//			if (A[i] > B[j]) {
//				j = j + 1;
//			}
//		}
//
//		return -1;
//	}
}