package com.onlineinteract.diff;

public class Two {
	public static void mergeSort(Comparable[] a, int left, int right,
			boolean tracing) {
		// Sort a[left...right].
		if (left < right) {
			int m = (left + right) / 2;
			mergeSort(a, left, m, false);
			mergeSort(a, m + 1, right, false);
			Comparable[] b = new Comparable[right - left + 1];
			merge(a, left, m, a, m + 1, right, b, 0);
			for (int k = left; k <= right; k++)
				a[k] = b[k - left];
		}
	}

	public static void merge(Comparable[] a1, int left1, int right1,
			Comparable[] a2, int left2, int right2, Comparable[] a, int left) {
		// Merge a1[left1...right1] and a2[left2...right2]into
		// a[left...] (where both a1 and a2 are sorted).
		int i = left1, j = left2, k = left;
		while (i <= right1 && j <= right2) {
			int comp = a1[i].compareTo(a2[j]);
			if (comp <= 0)
				a[k++] = a1[i++];
			else
				a[k++] = a2[j++];
		}
		while (i <= right1)
			a[k++] = a1[i++];
		while (j <= right2)
			a[k++] = a2[j++];
	}
}
