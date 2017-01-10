package com.onlineinteract.general;

import java.util.Comparator;

import com.onlineinteract.sorting.MergeSort;

/**
 * The purpose of this class is to determine on one word is an anagram
 * of another word.
 * 
 * Time Complexity is O(n log n) as this is the dominant term from
 * mergeSort. Notice, we also have a O(n) term from our for construct.
 * The terms together are O(n) + O(n log n) + O(n log n) = O(n log n).
 * 
 * @author Gary Black / Digilogue on 09/01/17.
 *
 */
public class Anagrams {

	public static void main(String[] args) {
		Character[] word1 = { 'c', 'o', 'n', 'e' };
		Character[] word2 = { 'o', 'n', 'c', 'e' };

		MergeSort.mergeSort(word1, new CharacterComparator<Character>());
		MergeSort.mergeSort(word2, new CharacterComparator<Character>());

		for (int i = 0; i < word1.length; i++) {
			if (!word1[i].equals(word2[i])) {
				System.out.println("is not an anagram.");
				break;
			}

			if (word1.length - 1 == i)
				System.out.println("is an anagram");
		}
	}

	static class CharacterComparator<K> implements Comparator<K> {
		@Override
		public int compare(K o1, K o2) {
			return ((Comparable<K>) o1).compareTo(o2);
		}
	}
}
