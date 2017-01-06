package com.onlineinteract.time_complexity;

/**
 * Composing long strings from char c, n times.
 * 
 * @author Gary Black / Digilogue on 05/01/17
 *
 */
public class ComposingLongStrings {

	public static void main(String[] args) {
		System.out.println(repeat1('A', 10));
	}

	/**
	 * Uses repeated concatenation to compose a String with n copies
	 * of character c. Actually the time complexity (since we are
	 * using an immutable string) is O(n^2).
	 */
	public static String repeat1(char c, int n) {
		String answer = "";
		for (int j = 0; j < n; j++)
			answer += c;
		return answer;
	}

	/**
	 * Uses StringBuilder to compose a String with n copies of
	 * character c. Time complexity is O(n).
	 */
	public static String repeat2(char c, int n) {
		StringBuilder sb = new StringBuilder();
		for (int j = 0; j < n; j++)
			sb.append(c);
		return sb.toString();
	}
}
