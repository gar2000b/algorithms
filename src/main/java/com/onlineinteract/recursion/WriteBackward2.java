package com.onlineinteract.recursion;

/**
 * The purpose of this algorithm is to write
 * a string backwards using recursion. It should
 * start by writing the last character first 
 * and proceed until size is 0.
 * 
 * @param s
 * @param size
 */
public class WriteBackward2 {
	
	public static void main(String[] args) {
		writeBackward2("bat", 3);
	}
	
	/**
	 * This time the method should print out
	 *  the first character after recursion
	 * @param s
	 * @param size
	 */
	public static void writeBackward2 (String s, int size) {
		
		if (size > 0) {
			writeBackward2(s.substring(1, size), size - 1);
			System.out.print(s.substring(0, 1));
		} // size == 0 is the base case - do nothing
	}

}
