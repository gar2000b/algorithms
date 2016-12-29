package com.onlineinteract.strings;

public class StringConcat {

	public static void main(String[] args) {
		String abc = "abc";
		abc = concat(abc, "def");
		System.out.println("Concatenated String is: " + abc);
		
		abc = concat2(abc, "ghi");
		System.out.println("Concatenated String is: " + abc);
	}

	protected static String concat(String dest, String src) {
		dest = dest.concat(src);
		return dest;
	}

	protected static String concat2(String dest, String src) {
		
		StringBuffer sb = new StringBuffer(dest);
		sb.append(src);
		
		return sb.toString();
	}
}
