package com.onlineinteract.arrays;

import java.util.Arrays;

public class MergeSortedArrays {

	public static void main(String[] args) {
		int[] array1 = { 0, 3, 4, 31 };
		int[] array2 = { 4, 6, 30 };

		System.out.println(Arrays.toString(mergeSortedArrays(array1, array2)));
	}

	private static int[] mergeSortedArrays(int[] array1, int[] array2) {
		int[] mergedArray = new int[array1.length + array2.length];
		int p1 = 0;
		int p2 = 0;
		int pos = 0;

		Integer item1 = (p1 < array1.length) ? array1[p1] : null;
		Integer item2 = (p2 < array2.length) ? array2[p2] : null;

		while (item1 != null || item2 != null) {
			if (item2 == null || item1 < item2) {
				mergedArray[pos] = array1[p1];
				p1++;
				pos++;
				item1 = (p1 < array1.length) ? array1[p1] : null;
			} else {
				mergedArray[pos] = array2[p2];
				p2++;
				pos++;
				item2 = (p2 < array2.length) ? array2[p2] : null;
			}
		}

		return mergedArray;
	}
}
