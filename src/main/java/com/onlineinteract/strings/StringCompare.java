package com.onlineinteract.strings;

public class StringCompare {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Result is: " + ("aaaa".compareTo("aaa")));
		System.out.println("Result is: " + strcmp("aaaa", "aaa"));
	}

	/**
	 * strcmp: Replicating Javas compareTo or Cs strcmp.
	 * 
	 * @param string1
	 * @param string2
	 * @return int lexicographical value < 0, == 0 or > 0
	 */
	protected static int strcmp(String string1, String string2) {

		if (string1 == null && string2 == null)
			return 0;

		if (string1 == null)
			return 0 - string2.charAt(0);

		if (string2 == null)
			return string1.charAt(0);

		for (int i = 0; i < string1.length(); i++) {
			if (i == string2.length() - 1) {
				return string1.length() - string2.length();
			}

			if (string1.charAt(i) == string2.charAt(i))
				i++;
			else
				return string1.charAt(i) - string2.charAt(i);
		}

		if (string2.length() > string1.length())
			return string1.length() - string2.length();
		else
			return 0;
	}

}
