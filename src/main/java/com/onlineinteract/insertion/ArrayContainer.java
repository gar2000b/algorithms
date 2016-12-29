package com.onlineinteract.insertion;


public class ArrayContainer {

	private String[] array;
	private static final int NONE = -1;

	public ArrayContainer(String[] array) {
		setArray(array);
	}

	public static void main(String[] args) {

		ArrayContainer arrayContainer = new ArrayContainer(new String[] {
				"The", "cat", "sat", "on", "the", "mouse", "mat" });
		arrayContainer.printArray();
		printNewline();

		ArrayContainer.insert("fat", 1, arrayContainer.getArray(), 1, 6);
		arrayContainer.printArray();
	}

	private static void printNewline() {
		System.out.println();
	}

	public String[] getArray() {
		return array;
	}

	public void setArray(String[] array) {
		this.array = array;
	}

	private void printArray() {
		for (int i = 0; i < getArray().length; i++) {
			System.out.println(i + " is: " + getArray()[i]);
		}
	}

	// Time complexity is O(n).
	public static void insert(Object val, int ins, Object[] a, int left,
			int right) {
		for (int i = right; i > ins; i--)
			a[i] = a[i - 1];
		a[ins] = val;
	}

	// Time complexity is O(n).
	public static void delete(int del, Object[] a, int left, int right) {
		for (int i = del + 1; i <= right; i++)
			a[i - 1] = a[i];
		a[right] = null;
	}

	// Linear Search or Sequential Search or Brute Force Search.
	// Time complexity is O(n).
	static int linearSearch(String target, Object[] a, int left, int right) {

		for (int i = left; i <= right; i++) {
			if (target.equals(a[i])) {
				return i;
			}
		}

		return NONE;
	}

	// Time complexity is O(n).
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static int sortedLinearSearch(Comparable target, Comparable[] a,
			int left, int right) {
		for (int p = left; p <= right; p++) {
			int comp = target.compareTo(a[p]);
			if (comp == 0)
				return p;
			else if (comp < 0)
				return NONE;
		}

		return NONE;
	}

	// Time complexity is O(log n).
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static int binarySearch(Comparable target, Comparable[] a, int left,
			int right) {

		int l = left, r = right;
		while (l <= r) {
			int m = (l + r) / 2;
			int comp = target.compareTo(a[m]);
			if (comp == 0)
				return m;
			else if (comp < 0)
				r = m - 1;
			else
				l = m + 1;
		}

		return 0;
	}

	// Time complexity is O(n).
	@SuppressWarnings({ "rawtypes", "unchecked" })
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

	// Merge Sort O(n log n): Divide and Conquer using recursion.
	@SuppressWarnings("rawtypes")
	public static void mergeSort(Comparable[] a, int left, int right) {
		// Sort a[left...right].
		if (left < right) {
			int m = (left + right) / 2;
			mergeSort(a, left, m);
			mergeSort(a, m + 1, right);
			Comparable[] b = new Comparable[right - left + 1];
			merge(a, left, m, a, m + 1, right, b, 0);
			for (int k = left; k <= right; k++)
				a[k] = b[k - left];
		}
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked", "unused" })
	private static int partition(Comparable[] a, int left, int right) {
		Comparable pivot = a[left]; int p = left;
		for(int r = left + 1; r <= right; r++) {
			int comp = a[r].compareTo(pivot);
			if(comp < 0) {
				a[p] = a[r]; a[r] = a[p+1]; a[p+1] = pivot;
				p++;
			}
		}
		return p;
	}
	
	// Quick Sort - BestToWorst: O(n log n) -> O(nsquared) - most frameworks use this.
	// It uses the idea of choosing a random element in the array calling it the pivot
	// then splits into 3 subarrays with the pivot being the middle one with lesser values to
	// the LH subarray and vice-versa.
	@SuppressWarnings("rawtypes")
	public static void quickSort(Comparable[] a, int left, int right) {
		if(left < right) {
			int p = partition(a, left, right);
			quickSort(a, left, p - 1);
			quickSort(a, p + 1, right);
		}
	}
	
	// TODO:
	// Selection Sort O(nsquared): sorts an array by iterating over and
	// replacing LH with least.
	// Insertion Sort O(nsquared): ^ similar
}
