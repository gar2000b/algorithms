package com.onlineinteract.codility.lessons.tape_equilibrium;

public class Solution {

	public static int solution(int[] A) {
		
		int difference = Integer.MAX_VALUE;
		
		int right = 0;
		for(int i : A) {
			right += i;
		}
		
		int left = 0;
		for(int i = 0; i < A.length - 1; i++) {
			left += A[i];
			right -= A[i];
			difference = Math.min(difference, Math.abs(left - right));
		}
		
		return difference;
	}
}
