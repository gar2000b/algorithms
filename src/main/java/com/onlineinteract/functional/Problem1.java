package com.onlineinteract.functional;

import java.util.Arrays;
import java.util.List;

public class Problem1 {

	/**
	 * Find the double(number x 2) of the first even number greater
	 * than 3. In this case, it will be 8 because the first even
	 * number is 4.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1, 2, 3, 5, 4, 6, 7, 8, 9, 10);
		int result = 0;
		for (int e : values) {
			if (e > 3 && e % 2 == 0) {
				result = e * 2;
				break;
			}
		}
		System.out.println(result);

		/**
		 * Functional style
		 */
		Integer value = values.stream()
				.filter(e -> e > 3)
				.filter(e -> e % 2 == 0)
				.map(e -> e * 2)
				.findFirst()
				.get();
		System.out.println(value);
	}
}
