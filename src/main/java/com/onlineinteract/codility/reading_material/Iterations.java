package com.onlineinteract.codility.reading_material;

public class Iterations {

	public static void main(String[] args) {
		triangle(4);
		factoral(4);
		factoral2(4);

		upsideDownTriangle(4);
		System.out.println();
		upsideDownTriangle(5);
		System.out.println();
		upsideDownTriangle(6);
		System.out.println();
		upsideDownTriangle(7);
		System.out.println();

		noOfDigitsInDecimal(8);
		noOfDigitsInDecimal(12);
		
		printFibonacciUpTo(144);
		
		System.out.println();
		printEvenNumbersUpTo(20);
		System.out.println();
		printOddNUmberUpTo(20);
	}

	public static void printOddNUmberUpTo(int n) {
		
		for (int i = 0; i < n; i++) {
			if (i % 2 != 0)
				System.out.println(i);
		}
	}

	public static void printEvenNumbersUpTo(int n) {
		
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0)
				System.out.println(i);
		}
	}

	public static void triangle(int n) {

		for (int i = 1; i < n + 1; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void factoral(int n) {

		int factoral = 1;

		for (int i = 1; i < n + 1; i++) {
			factoral = factoral * i;
		}

		System.out.println("Factoral is: " + factoral);
	}

	public static void factoral2(int n) {
		int factoral = n;
		for (int i = n - 1; i > 0; i--) {
			factoral = factoral * i;
		}

		System.out.println("Factoral is: " + factoral);
	}

	public static void upsideDownTriangle(int n) {

		for (int i = n; i > 0; i -= 2) {
			for (int j = 0; j < (n - i) / 2; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void noOfDigitsInDecimal(int n) {

		int result = 0;
		int tmp = n;

		while (tmp > 0) {
			tmp /= 10;
			result++;
		}

		System.out.println("The number of digits in the decimal of " + n
				+ " is " + result);
	}
	
	public static void printFibonacciUpTo(int n) {
		int a = 0;
		int b = 1;
		int c = 0;
		
		while (a <= n) {
			System.out.println(a);
			c = a + b;
			a = b;
			b = c;
		}
	}
}
