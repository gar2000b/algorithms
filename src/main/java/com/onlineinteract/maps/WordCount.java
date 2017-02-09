package com.onlineinteract.maps;

import java.util.Scanner;

import com.onlineinteract.maps.api.Entry;
import com.onlineinteract.maps.api.Map;

/**
 * A program that counts words in a document, printing the most
 * frequent.
 */
public class WordCount {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// or any concrete map.
		Map<String, Integer> freq = new UnsortedTableMap<>();

		// scan input for words, using all nonletters as delimiters
		Scanner doc = new Scanner(System.in).useDelimiter("[^a-zA-Z]+");
		while (doc.hasNext()) {
			// convert next word to lowercase
			String word = doc.next().toLowerCase();
			// get the previous count for this word.
			Integer count = freq.get(word);
			if (count == null)
				count = 0; // if not in map, previous count is zero
			// (re)assign new count for this word
			freq.put(word, 1 + count);
		}
		int maxCount = 0;
		String maxWord = "no word";
		// find max-count word
		for (Entry<String, Integer> ent : freq.entrySet())
			if (ent.getValue() > maxCount) {
				maxWord = ent.getKey();
				maxCount = ent.getValue();
			}
		System.out.print("The most frequent word is '" + maxWord);
		System.out.println("' with " + maxCount + " occurrences.");
	}
}