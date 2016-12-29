package com.onlineinteract.codility.lessons.binary_gaps;

class Solution {

	public static void main(String[] args) {
		int maxBinaryGap = solution(561892);
		System.out.println(maxBinaryGap);
	}

	public static int solution1(int N) {

		String binary = Integer.toBinaryString(N);
		System.out.println(binary);
		int maxCount = 0;
		int currentMaxCount = 0;
		int lastUpdate = 1;

		for (int i = 0; i < binary.length(); i++) {
			if (Character.getNumericValue(binary.charAt(i)) == 0) {
				if (lastUpdate == 1) {
					currentMaxCount = 1;
				} else {
					currentMaxCount = currentMaxCount + 1;
				}
			} else {
				if (currentMaxCount > maxCount) {
					maxCount = currentMaxCount;
					currentMaxCount = 0;
				}
			}

			lastUpdate = Character.getNumericValue(binary.charAt(i));
		}

		return maxCount;
	}

	public static int solution(int N) {

		String binaryString = Integer.toBinaryString(N);

		int currentBinaryGap = 0;
		int highestBinaryGap = 0;
		boolean startBoundary = false;

		for (int i = 0; i < binaryString.length(); i++) {
			if (!startBoundary && i == 0 && binaryString.charAt(i) == '1') {
				startBoundary = true;
			}

			if (i != 0) {
				if (binaryString.charAt(i) == '0' && startBoundary) {
					currentBinaryGap++;
				} else if (highestBinaryGap <= currentBinaryGap) {
					startBoundary = true;
					highestBinaryGap = currentBinaryGap;
					currentBinaryGap = 0;
				} else {
					currentBinaryGap = 0;
				}
			}
		}

		return highestBinaryGap;
	}
}