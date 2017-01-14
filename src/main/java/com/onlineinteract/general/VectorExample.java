package com.onlineinteract.general;

import java.util.Vector;

/**
 * This example demonstrates the data structure Vector (from the
 * collections framework) and is now part of the List interface. it is
 * often said to be like a dynamic array.
 * 
 * It is actually very similar to the ArrayList collection. The API is
 * similar but has some major differences. Vectors are synchronised
 * are are therefore deemed to be thread safe where as ArrayList is
 * not, however, this means Vectors incur a performance hit. In terms
 * of data growth strategy, it is similar to the ArrayList except it
 * doubles capacity every time it reaches the capacity limit as
 * opposed to the 50% increase in capacity offered by the ArrayList.
 * Usage patterns and performance are the same as the ArrayList /
 * Array operations - think, add, remove elements etc...
 * 
 * @author Digilogue
 *
 */
public class VectorExample {

	public static void main(String[] args) {
		System.out.println();
		Vector<String> v = new Vector<String>();
		v.add("abc");
		v.add("def");
		v.add("ghi");
		System.out.println(v);

		for (String value : v) {
			System.out.println(value);
		}
	}
}
