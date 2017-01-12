package com.onlineinteract.stack;

import com.onlineinteract.stack.api.Stack;

/**
 * Tests if every opening tag has a matching closing tag in HTML
 * string. Similar to Matching Delimiters except is strips out the tag
 * label excluding <>s but pushes, pops and evauates the tag label in
 * the same way.
 * 
 * @author Gary Black / Digilogue on 12/01/17
 */

public class HTMLDelimiters {

	public static void main(String[] args) {
		System.out.println(isHTMLMatched("<html><head>this is valid html.</head></html>"));
	}

	public static boolean isHTMLMatched(String html) {
		Stack<String> buffer = new LinkedStack<>();
		// find first ’<’ character (if any)
		int j = html.indexOf('<');
		while (j != -1) {
			// find next ’>’ character
			int k = html.indexOf('>', j + 1);
			if (k == -1)
				return false; // invalid tag
			// strip away < >
			String tag = html.substring(j + 1, k);
			// this is an opening tag
			if (!tag.startsWith("/"))
				buffer.push(tag);
			else {
				// this is a closing tag
				if (buffer.isEmpty())
					return false; // no tag to match
				if (!tag.substring(1).equals(buffer.pop()))
					return false; // mismatched tag
			}
			// find next ’<’ character (if any)
			j = html.indexOf('<', k + 1);
		}
		// were all opening tags matched?
		return buffer.isEmpty();
	}
}
