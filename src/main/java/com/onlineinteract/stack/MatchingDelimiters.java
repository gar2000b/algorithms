package com.onlineinteract.stack;

import com.onlineinteract.stack.api.Stack;

/**
 * Tests if delimiters in the given expression are properly matched.
 * Time Complexity O(n)
 * 
 * @author Gary Black / Digilogue on 12/01/17
 *
 */
public class MatchingDelimiters {

	public static void main(String[] args) {
		System.out.println(isMatched("((( )(( )){([( )])}))"));
	}

	public static boolean isMatched(String expression) {
		// opening delimiters
		final String opening = "({[";
		// respective closing delimiters
		final String closing = ")}]";
		Stack<Character> buffer = new LinkedStack<>();
		for (char c : expression.toCharArray()) {
			// this is a left delimiter
			if (opening.indexOf(c) != -1)
				buffer.push(c);
			else if (closing.indexOf(c) != -1) {
				// this is a right delimiter
				// nothing to match with
				if (buffer.isEmpty())
					return false;
				if (closing.indexOf(c) != opening.indexOf(buffer.pop()))
					return false; // mismatched delimiter
			}
		}
		// were all opening delimiters matched?
		return buffer.isEmpty();
	}
}
