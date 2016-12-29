package com.onlineinteract.codility.reading_material;

public class Arrays {

	public static void main(String[] args) {

		int[] reverseArray = reverseArray(new int[] { 1, 2, 3, 4, 5, 6, 7, 8 });
		for (int i = 0; i < reverseArray.length; i++) {
			System.out.println(reverseArray[i]);
		}
	}

	public static int[] reverseArray(int[] a) {

		for (int i = 0; i < a.length / 2; i++) {
			int tmp = a[i];
			a[i] = a[a.length - 1 - i];
			a[a.length - 1 - i] = tmp;
		}

		return a;
	}

}
