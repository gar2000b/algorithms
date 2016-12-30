package com.onlineinteract.recursion;

import java.util.Arrays;

/**
 * This search dictionary algorithm uses recursion to help find a word in the
 * dictionary represented by a String[] array.
 * 
 * @author Gary Black / Digilogue Technologies - 29/12/16
 *
 */
public class SearchDictionary {

	public static void main(String[] args) {
		String[] dictionary = { "Abacus", "Bannana", "Chalk", "Definition",
				"Erata", "Foolish", "Greater" };
		search(dictionary, "Abacus");
	}

	public static boolean search(String[] dictionary, String word) {

		if (dictionary == null || dictionary.length == 0)
			return false;

		// If the dictionary is of size one, search for the word.
		if (dictionary.length == 1) {
			if (dictionary[0] == word)
				return true;
			else
				return false;
		} else {
			// Else find the midpoint of the dictionary and 
			// determine which half of the dictionary 
			// contains the word.
			int midpoint = dictionary.length / 2;

			// If in first half, search first half of dictionary
			if (word.compareTo(dictionary[midpoint]) < 0) {
				return search(Arrays.copyOfRange(dictionary, 0, midpoint), word);
			}

			// If in second half, search second half of dictionary
			if (word.compareTo(dictionary[midpoint]) >= 0) {
				return search(Arrays.copyOfRange(dictionary, midpoint,
						dictionary.length), word);
			}
		}
		return false;
	}

}
