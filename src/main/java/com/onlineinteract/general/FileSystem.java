package com.onlineinteract.general;

import java.io.File;

/**
 * File System app demonstrating general FS operations.
 * 
 * @author Gary Black / Digilogue
 *
 */
public class FileSystem {

	public static void main(String[] args) {

		File file = new File("/programs");
		printFileList(file);
		System.out.println("'/programs' is " + file.length() 
		+ " bytes");
		System.out.println();

		File file2 = new File("/programs/BitTorrent.exe");
		printFileList(file2);
		System.out.println("'/programs' is " + file2.length() 
		+ " bytes");
		System.out.println();
	}

	private static void printFileList(File file) {
		if (file.isDirectory()) {
			for (String entry : file.list()) {
				System.out.println(entry);
			}
		} else
			System.out.println("'" + file.getAbsolutePath() 
			+ "'" + " does not appear to be a directory");
	}

}
