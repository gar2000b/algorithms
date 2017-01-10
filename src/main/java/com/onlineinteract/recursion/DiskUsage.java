package com.onlineinteract.recursion;

import java.io.File;

public class DiskUsage {

	public static void main(String[] args) {
		diskUsage(new File("/programs"));
	}
	
	/**
	 * Calculates the total disk usage (in bytes) of the portion of
	 * the file system rooted at the given path, while printing a
	 * summary akin to the standard 'du' Unix tool.
	 * Time Complexity = O(n).
	 */
	public static long diskUsage(File root) {
		// start with direct disk usage
		long total = root.length();
		// and if this is a directory, then for each child
		// compose full path to child
		if (root.isDirectory()) {
			for (String childname : root.list()) {
				File child = new File(root, childname);
				// add child’s usage to total
				total += diskUsage(child);
			}
		}
		System.out.println(total + "\t" + root); // descriptive output
		return total; // return the grand total
	}
}
