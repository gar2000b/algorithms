package com.onlineinteract.leetcode.reverse_integer;

class Solution {

	public static void main(String[] args) {
		System.out.println(new Solution().reverse(-123));
	}

	public int reverse(int x) {
		char[] charArray = String.valueOf(x).toCharArray();

		for (int i = 0; i < charArray.length / 2; i++) {
			if (charArray[i] == '-') {
				i++;
				char temp = charArray[i];
				charArray[i] = charArray[charArray.length - i];
				charArray[charArray.length - i] = temp;
			} else {
				char temp = charArray[i];
				charArray[i] = charArray[charArray.length - i - 1];
				charArray[charArray.length - i - 1] = temp;
			}
		}

		return Integer.valueOf(new String(charArray));
	}
}
