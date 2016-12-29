package com.onlineinteract.codility.lessons;

public class Factorial {
	public static void main(String[] args) {
		
		int n = 6;
		int factorial = 1;
		
		
		for(int i = 1; i < n + 1; i++) {
			factorial *= i;
		}
		
		System.out.println("factorial is: " + factorial);
	}
}
