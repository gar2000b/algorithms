package com.onlineinteract.sorting;

import java.util.Arrays;
import java.util.Comparator;

/**
 * MergeSort algorithm basically takes a binary recursive divide and
 * conquer approach where the mergeSort method kicks off two other
 * mergeSort calls (1st takes the lh->mid, 2nd takes the mid->rh
 * portions of the array). This continues until the arrays lengths are
 * < 2 in which case it simply returns. Once both binary calls have
 * completed with their returns bubbling back to the calling instance,
 * merge is called to recombine the 2 arrays back in sorted order.
 * Time Complexity is O(n log n).
 * 
 * This is because if you observe the merge sort tree, you'll notice
 * that the tree height is O(log n) and the time spend per level is
 * O(n), hence O(n log n).
 * 
 * @author Digilogue
 *
 */
public class MergeSort {

	public static void main(String[] args) {
		// simpleMerge();
		Integer[] data = { 5, 3, 8, 1, 4, 7, 9, 2 };
		mergeSort(data, new IntegerComparator<Integer>());
		for (Integer value : data) {
			System.out.print(value + " ");
		}
	}

	/** Merge-sort contents of array S. */
	public static <K> void mergeSort(K[] S, Comparator<K> comp) {
		int n = S.length;
		// array is trivially sorted
		if (n < 2)
			return;
		// divide
		int mid = n / 2;
		// copy of first half
		K[] S1 = Arrays.copyOfRange(S, 0, mid);
		// copy of second half
		K[] S2 = Arrays.copyOfRange(S, mid, n);
		// conquer (with recursion)
		// sort copy of first half
		mergeSort(S1, comp);
		// sort copy of second half
		mergeSort(S2, comp);
		// merge results
		// merge sorted halves back into original
		merge(S1, S2, S, comp);
	}

	/**
	 * Merge contents of arrays S1 and S2 into properly sized array S.
	 */
	public static <K> void merge(K[] S1, K[] S2, K[] S, Comparator<K> comp) {

		int i = 0, j = 0;
		while (i + j < S.length) {
			// copy ith element of S1 and increment i
			// else copy jth element of S2 and increment j
			if (j == S2.length || (i < S1.length && comp.compare(S1[i], S2[j]) < 0))
				S[i + j] = S1[i++];
			else
				S[i + j] = S2[j++];
		}
	}

	/**
	 * Simple merge test
	 */
	public static void simpleMerge() {
		IntegerComparator<Integer> ic = new IntegerComparator<Integer>();
		Integer[] data = new Integer[8];
		Integer[] data1 = { 12, 38, 61, 83 };
		Integer[] data2 = { 6, 22, 50, 90 };

		merge(data1, data2, data, ic);

		for (Integer value : data) {
			System.out.print(value + " ");
		}
	}

	public static class IntegerComparator<K> implements Comparator<K> {
		@Override
		public int compare(K o1, K o2) {
			return ((Comparable<K>) o1).compareTo(o2);
		}
	}
}
