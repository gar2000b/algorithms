package com.onlineinteract.codility.lessons;

/**
 * Factorial of a non-negative integer n is the product
 * of all positive integers less than or equal to n.
 * e.g: 3! = 3 x 2 x 1 = 6. or 3! = 1 x 2 x 3 = 6.
 * @author Gary Black / Digilogue Technologies
 * 29/12/16
 *
 */
public class Factorial {
	public static void main(String[] args) {
		
		int n = 6;
		int factorial = 1;
		
		for(int i = 1; i < n + 1; i++) {
			factorial *= i;
		}
		
		// The factorial of 6! is 720.
		System.out.println("factorial is: " + factorial);
	}
}
