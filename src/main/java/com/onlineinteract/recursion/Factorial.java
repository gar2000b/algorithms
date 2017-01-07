package com.onlineinteract.recursion;

/**
 * Using Recursion:
 * Factorial of a non-negative integer n is the product
 * of all positive integers less than or equal to n.
 * e.g: 3! = 3 x 2 x 1 = 6. or 3! = 1 x 2 x 3 = 6.
 * @author Gary Black / Digilogue Technologies
 * 29/12/16
 *
 */
public class Factorial {

	public static void main(String[] args) {
		System.out.println(fact(3));
	}
	
	public static int fact(int n) {

		if (n == 0)
			return 1;
		else
			return n * fact(n - 1);

	}
}
