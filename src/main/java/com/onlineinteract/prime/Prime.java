package com.onlineinteract.prime;

import java.util.stream.IntStream;

/**
 * 
 * Is a prime number if it is not divisible between 2 and (number -
 * 1).
 * 
 * Functional programming is declarative rather than imperative. We
 * now focus on what to do rather than how to do it.
 * 
 * 
 * @author Digilogue
 *
 */
public class Prime {

	public static void main(String[] args) {
		System.out.println(isPrime(1));
		System.out.println(isPrime(2));
		System.out.println(isPrime(3));
		System.out.println(isPrime(4));
	}

	private static boolean isPrime(final int number) {
		return number > 1 && IntStream.range(2, number).noneMatch(index -> number % index == 0);
	}

}
