package com.onlineinteract.codility.live_test.task1;

public class Solution {
	public static String solution(String S) {

		String reformattedString = "";

		// Strip out digits only.
		for (int i = 0; i < S.length(); i++) {

			if (Character.isDigit(S.charAt(i))) {
				reformattedString += S.charAt(i);
			}
		}

		String reformattedStringWithHyphen = "";

		// pass over reformatted string and insert -.
		for (int i = 0; i < reformattedString.length(); i++) {

			reformattedStringWithHyphen += reformattedString.charAt(i);

			if (reformattedString.length() - i >= 4) {
				if ((i + 1) % 3 == 0) {
					reformattedStringWithHyphen += "-";
				}
			} else {
				if ((i + 1) % 2 == 0) {
					reformattedStringWithHyphen += "-";
				}
			}

		}
		reformattedStringWithHyphen = reformattedStringWithHyphen.substring(0, reformattedStringWithHyphen.length()-1);

		return reformattedStringWithHyphen;
	}
}