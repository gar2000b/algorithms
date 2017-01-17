package com.onlineinteract.general;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Demonstrating the use of an iterator. Remember, an iterator is none
 * other than a software design pattern for scanning / iterating over
 * a sequence of elements.
 * 
 * @author Gary black / Digilogue
 *
 */
public class ArrayListIteratorExample {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);

		Iterator<Integer> iterator = al.iterator();

		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
	}
}
