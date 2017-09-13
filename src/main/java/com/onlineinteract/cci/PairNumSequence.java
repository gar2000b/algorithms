package com.onlineinteract.cci;

/**
 * Adds adjacent elements between 0 and n.
 * Time Complexity O(n).
 * Space Complexity O(1) as these calls on the call stack do not exist simultaneously like with recursion.
 * 
 * @author Digilogue
 *
 */
public class PairNumSequence {

	public static void main(String[] args) {
		int n = 5;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += pairSum(i, i + 1);
		}
		System.out.println("Sum is: " + sum);
	}

	private static int pairSum(int a, int b) {
		return a + b;
	}
}
