package com.onlineinteract.surgeon;

public class MeMainClass {

	public static void main(String[] args) {
		int[] theArray = { 1, 2, 3, 4, 5, 6, 7, 8 };
		
		System.out.println("Index of 4 is: " + indexOf(theArray, 4));
	}

	static int indexOf(int[] theArray, int targetValue) {

		for (int i = 0; i < theArray.length; i++) {
			if (theArray[i] == targetValue) {
				return i;
			}
		}
		return -1;
	}
}
