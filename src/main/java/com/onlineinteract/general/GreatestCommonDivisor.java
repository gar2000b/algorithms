package com.onlineinteract.general;

/**
 * The Greatest Common Divisor (GCD) or Greatest Common Factor (GCF) basically
 * takes two whole numbers and works out the largest number that wholly divides
 * into both. 8, 12 => 4.
 * 
 * @author Digilogue
 *
 */
public class GreatestCommonDivisor {

	/**
	 * We take in two numbers and work and set the largest and smallest numbers.
	 * In this version, we start the divisor at 2 and iterate over until the
	 * divisor is greater than or equal to the smallest number. We increment the
	 * divisor each time.
	 * 
	 * The main business of the algorithm (for each iteration) looks to see if
	 * the divisor divides equally into both the largest and smallest numbers.
	 * If it does, it then determines the return value - if the smaller number
	 * divides into the larger number equally, then return the smallest number
	 * or else return the smallest number / divisor.
	 * 
	 * If the loop exists without return, we check for zeros and return the
	 * largest number or 0. Then we do a final check to see if the smaller
	 * number divides equally into the larger number and return the smaller
	 * number or else simply return 1 as that would be the Greatest Common
	 * Factor.
	 * 
	 * @param number1
	 * @param number2
	 * @return
	 */
	public static int greatestCommonDivisor(int number1, int number2) {
		int divisor = 2;
		int smallestNumber = (number1 < number2) ? number1 : number2;
		int largerNumber = (number1 < number2) ? number2 : number1;

		while (divisor < smallestNumber) {
			if (smallestNumber % divisor == 0 && largerNumber % divisor == 0) {
				if (largerNumber % smallestNumber == 0)
					return smallestNumber;
				else
					return smallestNumber / divisor;
			}
			divisor++;
		}

		if (smallestNumber == 0 && largerNumber == 0)
			return 0;

		if (smallestNumber == 0 && largerNumber > 0)
			return largerNumber;

		if (largerNumber % smallestNumber == 0)
			return smallestNumber;
		else
			return 1;

	}

	/**
	 * This is the simplest implementation of the GCD / GCF algorithm using
	 * recursion. It constantly checks the second number to see if it's 0. If it
	 * is, then return the first number as the answer.
	 * 
	 * If it isn't then the business end of the algorithm uses a recursive call
	 * passing in the second number as the first parameter and the num1 mod num2
	 * as the second parameter.
	 * 
	 * I guess the real magic in this solution is the second parameter as it
	 * will pass in a 0 if num2 equally divides into num1. If that's the case,
	 * it is the GCF.
	 * 
	 * @param number1
	 * @param number2
	 * @return
	 */
	public static int greatestCommonDivisorUsingRecursion(int number1, int number2) {

		if (number2 == 0)
			return number1;
		else
			return greatestCommonDivisorUsingRecursion(number2, number1 % number2);
	}

	public static void main(String[] args) {
		System.out.println(greatestCommonDivisor(6, 12));
		System.out.println(greatestCommonDivisorUsingRecursion(12, 6));
	}
}
