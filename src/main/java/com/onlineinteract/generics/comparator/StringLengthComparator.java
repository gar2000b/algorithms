package com.onlineinteract.generics.comparator;

import java.util.Comparator;

public class StringLengthComparator implements Comparator<String> {

	/** Compares two strings according to their lengths. */
	@Override
	public int compare(String o1, String o2) {

		if (o1.length() < o2.length())
			return -1;

		if (o1.length() > o2.length())
			return 1;

		return 0;
	}

	public static void main(String[] args) {
		StringLengthComparator slc = new StringLengthComparator();

		String s1 = "This is a fairly long string full of nonsense";
		String s2 = "This isn't quite as long";

		System.out.println("Long String compared to short string yields: " + slc.compare(s1, s2));
	}

}