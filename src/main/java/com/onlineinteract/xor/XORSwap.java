package com.onlineinteract.xor;

public class XORSwap {

	private static long a;
	private static long b;

	/**
	 * 
	 * This XOR example actually uses the XOR operator to swap the values of two
	 * variables around without the need to actually use a temporary variable.
	 * Demonstrates swapping longs and booleans.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		a = 3;
		b = 5;

		System.out.println("a is: " + a);
		System.out.println("b is: " + b);
		System.out.println();

		xorSwap();

		System.out.println("a is: " + a);
		System.out.println("b is: " + b);
		System.out.println();

		boolean c = true;
		boolean d = false;

		c = c ^ d;
		d = d ^ c;
		c = c ^ d;

		System.out.println("c is: " + c);
		System.out.println("d is: " + d);
	}

	private static void xorSwap() {
		a = a ^ b;
		b = b ^ a;
		a = a ^ b;
	}

}
