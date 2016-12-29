package com.onlineinteract.celebrity;

/**
 * This problem is concerned with finding the celebrity in a room of people
 * where everyone knows who the celebrity is but you can only find the solution
 * by asking each person one question at a time: do you know person x? You can
 * ask that question as many times as you like in any order you like but only
 * that question.
 * 
 * The below solution has a time complexity of O(n) for the findCelebrity()
 * operation.
 * 
 * 
 * @author Gary Black (Digilogue Technologies)
 *
 */
public class CelebrityProblem {

	static int[][] matrix = new int[10][10];

	public static void main(String[] args) {

		// Initialise matrix. Celebrity is 8.
		for (int i = 0; i < matrix.length; i++) {
			matrix[i][8] = 1;
		}

		findCelebrity();

	}

	/**
	 * Search for celebrity, pattern = (0 -> 1, 1 -> 0, 2 -> 3, 3 -> 2...)
	 */
	private static void findCelebrity() {
		for (int i = 0; i < matrix.length; i += 2) {
			if (haveAcquaintance(i, i + 1)) {
				System.out.println("* Celebrity found at: " + i + ", "
						+ (i + 1));
				break;
			}
			if (haveAcquaintance(i + 1, i)) {
				System.out.println("* Celebrity found at: " + (i + 1) + ", "
						+ i);
				break;
			}
		}
	}

	public static boolean haveAcquaintance(int a, int b) {
		if (matrix[a][b] == 1)
			return true;
		return false;
	}
}
