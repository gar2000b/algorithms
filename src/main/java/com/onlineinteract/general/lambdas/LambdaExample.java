package com.onlineinteract.general.lambdas;

import java.io.File;
import java.io.FileFilter;
import java.util.Comparator;

public class LambdaExample {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		FileFilter filterLambda = (File pathname) -> pathname.getName().endsWith(".exe");
		File dir = new File("c:\\programs");
		File[] files = dir.listFiles(filterLambda);

		for (File file : files) {
			System.out.println(file);
		}

		// Another example using a comparator that implements the
		// compare method. Don't yet know why you can't do equals().
		// Ah, it is because the equals() method is a default object
		// method that all objects inherit - so in this case, it is
		// ignored.
		Comparator<String> c = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		};

		Comparator<String> cc = (String o1, String o2) -> 0;

		// Comparator<String> dd = (String obj) -> true;
	}
}
