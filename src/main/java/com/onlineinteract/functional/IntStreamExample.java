package com.onlineinteract.functional;

import java.util.stream.IntStream;

public class IntStreamExample {

	public static void main(String[] args) {
		int[] values = {3, 10, 6, 1, 4, 8, 2, 5, 9, 7, 12};
		
		System.out.println("Original values:");
		IntStream.of(values)
					.forEach(value -> System.out.printf("%d ", value));
		System.out.println();
		
		/**
		 * count min, max, sum and average of the values
		 */
		System.out.printf("%nCount: %d%n", IntStream.of(values).count());
		System.out.printf("%nMin: %d%n", IntStream.of(values).min().getAsInt());
		System.out.printf("%nMax: %d%n", IntStream.of(values).max().getAsInt());
		System.out.printf("%nSum: %d%n", IntStream.of(values).sum());
		System.out.printf("%nAverage: %.2f%n", IntStream.of(values).average().getAsDouble());
		
		/**
		 * Sum using reduce()
		 */
		System.out.printf("%nSum using reduce: %d%n", IntStream.of(values).reduce(0, (x, y) -> x + y));
		
		/**
		 * Even values displayed in sorted order
		 */
		IntStream.of(values)
		.filter(value -> value % 2 == 0)
		.sorted()
		.forEach(value -> System.out.printf("%d ", value));
	}
}
