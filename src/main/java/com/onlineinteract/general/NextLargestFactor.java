package com.onlineinteract.general;

/**
 * This algorithm seeks out the Next Largest Factor of a number. In other words,
 * it seeks out the Largest Divisor / the largest numbers that divide the input
 * number exactly (no remainders) *excluding the input number* itself unless
 * there are no others that divide equally. So 6 would be 2 x 3 with the largest
 * being 3. 11 would be 1 x 11 with the largest being 11 as no other number in
 * between divide exactly.
 * 
 * @author Gary Black / Digilogue
 *
 */
public class NextLargestFactor {

	/**
	 * The solution is to set the divisor to 2 and iterate over the divisor
	 * while it's less than the input number. Within this loop, we divide the
	 * number by the divisor and return it if there is no remainder
	 * (incrementing the divisor each time around). If there are always
	 * remainders, the Largest Factor will be the number itself as 1 x number =
	 * number.
	 * 
	 * @param number
	 * @return
	 */
	public static int nextLargestFactor(int number) {
		int divisor = 2;
		while (divisor < number) {
			if (number % divisor == 0)
				return number / divisor;
			divisor++;
		}
		return number;
	}

	public static void main(String[] args) {
		System.out.println(nextLargestFactor(16));
	}
}
