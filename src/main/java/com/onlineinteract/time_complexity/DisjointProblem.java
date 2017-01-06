package com.onlineinteract.time_complexity;

public class DisjointProblem {

	public static void main(String[] args) {
		int[] data1 = { 1, 2, 3, 4, 5 };
		int[] data2 = { 6, 2, 8, 9, 10 };
		int[] data3 = { 11, 2, 13, 14, 15 };
		
		System.out.println(disjoint1(data1, data2, data3));
		System.out.println(disjoint2(data1, data2, data3));
	}

	/**
	 * Returns true if there is no element common to all three arrays.
	 * If there are no common elements, the sets are said to be
	 * disjoint. Time complexity: O(n^3)
	 * 
	 * Disjoint Definition: (of two or more sets) having no elements
	 * in common.
	 */
	public static boolean disjoint1(int[] groupA, int[] groupB, int[] groupC) {
		for (int a : groupA)
			for (int b : groupB)
				for (int c : groupC)
					if ((a == b) && (b == c))
						// we found a common value
						return false;
		// if we reach this, sets are disjoint
		return true;
	}

	/**
	 * Improved efficiency of the algorithm. Returns true if there is
	 * no element common to all three arrays. Time complexity: O(n^2)
	 */
	public static boolean disjoint2(int[] groupA, int[] groupB, int[] groupC) {
		for (int a : groupA)
			for (int b : groupB)
				// only check C when we find match from A
				if (a == b)
					for (int c : groupC)
						// and thus b == c as well
						if (a == c)
							// we found a common value
							return false;
		// if we reach this, sets are disjoint
		return true;
	}
}
