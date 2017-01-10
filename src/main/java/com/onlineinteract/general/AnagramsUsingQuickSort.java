package com.onlineinteract.general;

import com.onlineinteract.sorting.QuickSort;

public class AnagramsUsingQuickSort {

	public static void main(String[] args) {
		int[] word1 = { 'c', 'o', 'n', 'e' };
		int[] word2 = { 'o', 'n', 'c', 'e' };

		QuickSort.quickSort(word1, 0, word1.length - 1);
		QuickSort.quickSort(word2, 0, word2.length - 1);

		for (int i = 0; i < word1.length; i++) {
			if (word1[i] != word2[i]) {
				System.out.println("is not an anagram.");
				break;
			}

			if (word1.length - 1 == i)
				System.out.println("is an anagram");
		}
	}
}
