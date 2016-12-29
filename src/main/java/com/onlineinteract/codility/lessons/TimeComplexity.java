package com.onlineinteract.codility.lessons;

public class TimeComplexity {

	public static void main(String[] args) {
		int n = 2;
		int result = 0;
		
		for(int i = 0; i < n + 1; i++) {
			result += (i + 1);
		}
		
		System.out.println("Result is: " + result);
		
		int result2 = n * (n + 1);
		
		System.out.println("Result2 is: " + result2);
	}
}
