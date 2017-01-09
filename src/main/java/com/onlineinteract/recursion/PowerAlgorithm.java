package com.onlineinteract.recursion;

public class PowerAlgorithm {

	public static void main(String[] args) {
		System.out.println(power(2, 4));
		System.out.println(powerRevised(2, 4));
	}

	/**
	 * Computes the value of x raised to the nth power, for
	 * nonnegative integer n. Time Complexity: O(n)
	 */
	public static double power(double x, int n) {
		if (n == 0)
			return 1;
		else
			return x * power(x, n - 1);
	}

	/**
	 * Computes the value of x raised to the nth power, for
	 * nonnegative integer n. Time complexity: O(log n)
	 */
	public static double powerRevised(double x, int n) {

		if (n == 0)
			return 1;
		else {
			// rely on truncated division of n
			double partial = power(x, n / 2);
			double result = partial * partial;
			if (n % 2 == 1)
				// if n odd, include extra factor of x
				result *= x;

			return result;
		}
	}
}
