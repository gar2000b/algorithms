package com.onlineinteract.codility.lessons.odd_occurences_array;

public class Solution {
	
	public static void main(String[] args) {
		System.out.println(1 ^ 1);
		System.out.println(2 ^ 2);
		System.out.println(3 ^ 3);
		System.out.println(4 ^ 4);
		System.out.println(10 ^ 5);
		System.out.println(4 ^ 4);
		System.out.println(5 ^ 4);
		System.out.println(6 ^ 4);
		System.out.println(7 ^ 4);
		System.out.println(8 ^ 4);
		System.out.println(9 ^ 4);
		System.out.println(10 ^ 4);
		System.out.println(11 ^ 4);
		System.out.println(12 ^ 4 ^ 8);
		System.out.println(100 ^ 10 ^ 200 ^ 100 ^ 120 ^ 80);
		
	}

	public static int solution(int[] A) {
		int unpaired = 0;
		for (int number : A) {
			unpaired ^= number;
		}
		return unpaired;
	}
	
	public static int solution2 (int[] A) {
		int unpaired = 0;
		for (int i = 0; i < A.length; i++) {
			unpaired = unpaired ^ A[i];
		}
		return unpaired;
	}
}
