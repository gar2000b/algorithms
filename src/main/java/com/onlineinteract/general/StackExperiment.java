package com.onlineinteract.general;

/**
 * Running this experiment over and over again on local machine was
 * yielding stack overflow error from time to time with the base case
 * of our recursive method set to 20900.
 * 
 * This indicated that the stack frame default limit is close to this
 * value. Also that the stack memory space is filled up by other JVM
 * processes, not just this app, hence the intermittent failures.
 * 
 * Note: we only used one simple local variable passed in to method.
 * 
 * Main take away from this experiment is to be careful with the input
 * range when using recursion. Time Complexity O(n) across tens of
 * thousands of records (in our case 20'000) risks stack overflow
 * error with default stack space.
 * 
 * @author Digilogue on 12/02/17
 *
 */
public class StackExperiment {

	public static void main(String[] args) {
		testRecursion(0);
	}

	private static void testRecursion(int in) {

		if (in == 20900) {
			System.out.println("Base case reached. Returning...");
			return;
		}

		testRecursion(++in);
	}
}
