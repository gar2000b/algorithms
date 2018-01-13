package com.onlineinteract.leetcode.twosum;

/**
 * Brute force search of two numbers in array adding up to target.
 * Time Complexity O(n)
 * 
 * @author Digilogue
 *
 */
class Solution {

	public static void main(String[] args) {
		int[] twoSum = new Solution().twoSum(new int[] { 11, 7, 15, 2 }, 9);
		System.out.println(twoSum[0]);
		System.out.println(twoSum[1]);
	}

	public int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[] { i, j };
				}
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}
}