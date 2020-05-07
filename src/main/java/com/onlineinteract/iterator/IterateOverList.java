package com.onlineinteract.iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class IterateOverList {
	public static <T> void main(String[] args) {
		List<String> l = new ArrayList<>();
		l.add("Hello");
		l.add("how");
		l.add("are");
		l.add("you");
		l.add("today");

		l.forEach(new Consumer<String>() {
			@Override
			public void accept(String value) {
				System.out.println(value);
			}
		});
		
		System.out.println();

		l.forEach((String value) -> System.out.println(value));
	}
}
