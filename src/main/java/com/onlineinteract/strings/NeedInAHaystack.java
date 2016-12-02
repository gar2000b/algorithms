package com.onlineinteract.strings;

public class NeedInAHaystack {

	public static void main(String[] args) {
		int needleInHaystackPosition = getNeedleInAHaystack(
				"azklneedleqbacszg", "needle");
		System.out
				.println("Needle is at location: " + needleInHaystackPosition);
	}

	/**
	 * Function to check for a string within a string
	 * 
	 * @param haystack
	 * @param needle
	 * @return position in haystack where needle was found.
	 */
	protected static int getNeedleInAHaystack(String haystack, String needle) {

		int mainPos = 0;

		for (int i = 0; i < haystack.length(); i++) {
			int hPos = mainPos;
			int nPos = 0;

			for (int j = 0; j < needle.length(); j++) {
				if (haystack.charAt(hPos) == needle.charAt(nPos)) {
					hPos++;
					nPos++;
				} else
					break;
			}

			if (nPos == needle.length())
				return mainPos;
			else
				mainPos++;
		}

		return -1;
	}

	/**
	 * Function to check for a string within a string - this time using while
	 * instead of for.
	 * 
	 * @param haystack
	 * @param needle
	 * @return position in haystack where needle was found.
	 */
	protected static int getNeedleInAHaystack2(String haystack, String needle) {

		int mainPos = 0;
		int i = 0;
		while (i < haystack.length()) {
			int hPos = mainPos;
			int nPos = 0;

			int j = 0;
			while (j < needle.length()) {
				if (haystack.charAt(hPos) == needle.charAt(nPos)) {
					hPos++;
					nPos++;
				} else
					break;

				j++;
			}

			if (nPos == needle.length())
				return mainPos;
			else
				mainPos++;

			i++;
		}

		return -1;
	}

	/**
	 * Function to check for a string within a string - optimisation of while
	 * instead of for.
	 * 
	 * @param haystack
	 * @param needle
	 * @return position in haystack where needle was found.
	 */
	protected static int getNeedleInAHaystack3(String haystack, String needle) {

		int mainPos = 0;
		int i = 0;
		while (i < haystack.length()) {
			int hPos = mainPos;
			int nPos = 0;

			int j = 0;
			while (j < needle.length()
					&& haystack.charAt(hPos) == needle.charAt(nPos)) {
				hPos++;
				nPos++;
				j++;
			}

			if (nPos == needle.length())
				return mainPos;
			else
				mainPos++;

			i++;
		}

		return -1;
	}
}
