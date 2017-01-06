package com.onlineinteract.time_complexity;

/**
 * Array Max - Algorithm to find the maximum value in an array with Time
 * Complexity O(n).
 * 
 * @author Gary Black / Digilogue on 05/01/17
 *
 */
public class ArrayMax {

	public static void main(String[] args) {
		double[] data = { 1, 2, 4, 7, 68, 23 };

		System.out.println("Largest value in array is: " + arrayMax(data));
	}

	/** Returns the maximum value of a nonempty array of numbers. */
	public static double arrayMax(double[] data) {
		int n = data.length;
		double currentMax = data[0]; // assume first entry is biggest (for now)
		for (int j = 1; j < n; j++) // consider all other entries
			if (data[j] > currentMax) // if data[j] is biggest thus far...
				currentMax = data[j]; // record it as the current max
		return currentMax;
	}
}
