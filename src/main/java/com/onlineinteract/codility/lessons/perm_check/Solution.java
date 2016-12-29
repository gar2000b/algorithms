package com.onlineinteract.codility.lessons.perm_check;

public class Solution {
	public static int solution(int[] A) {
		
		boolean[] usedNumber = new boolean[A.length];
		long count = 0;
		
		for(int i = 1; i < A.length + 1; i++) {
			count += i;
		}
		
		for (int element : A) {
			if(element > A.length) {
				return 0;
			}
			usedNumber[element - 1] = true;
			count -= element;
		}
		
		if(count != 0 || areNumbersNotUsed(usedNumber))
			return 0;
		
		return 1;
	}
	
	private static boolean areNumbersNotUsed(boolean[] usedNumber) {
		
		for (int i = 0; i < usedNumber.length; i++) {
			if(usedNumber[i] == false) {
				return true;
			}
		}
		return false;
	}
}
