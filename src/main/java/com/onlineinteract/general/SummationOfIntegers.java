package com.onlineinteract.general;

public class SummationOfIntegers {

	public static void main(String[] args) {
		System.out.println(sumAllIntegers(100));
	}

	public static int sumAllIntegers(int value) {
		int sum = 0;

		for (int i = 1; i < value + 1; i++) {
			sum += i;
		}

		return sum;
	}
}
