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
public class WriteBackward {
	
	public static void main(String[] args) {
		writeBackward("cat", 3);
	}
	
	public static void writeBackward (String s, int size) {
		if (size > 0) {
			System.out.print(s.substring(size - 1, size));
			
			writeBackward(s, size - 1);
		} // size == 0 is the base case - do nothing
	}

}
