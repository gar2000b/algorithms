package com.onlineinteract.general;

import java.util.ArrayList;
import java.util.List;

/**
 * Moral of the story as it relates to objects:
 * 
 * You can implicitly cast a reference of a sub type to its base type
 * - this is called an upcast.
 * 
 * You can explicitly case a reference of a base type to one of its
 * sub types - this is called a downcast.
 * 
 * Moral of the story as it relates to primitives:
 * 
 * You can implicitly cast a smaller type value into a bigger type.
 * 
 * You can explicitly cast a bigger type value into a smaller type.
 * However, this can lead to a loss in precision.
 * 
 * 
 * @author Digilogue
 *
 */
public class CastingExample {
	public static void main(String[] args) {
		
		// ---- Casting as it relates to objects.

		ArrayList<String> al = new ArrayList<>();
		al.add("1");
		al.add("2");
		al.add("3");

		// Implicit upcast.
		List<String> nl = al;

		// Explicit downcast
		al = (ArrayList<String>) nl;

		for (String value : al) {
			System.out.println(value);
		}

		// ---- Casting as it relates to primitives.

		int a = 12;
		// implicit upcast - fitting smaller value into a bigger
		// position.
		float b = a;
		b = b + 0.2f;
		System.out.println(b);
		// explicit downcast - forcing bigger value into smaller
		// position.
		int c = (int) b;

		System.out.println(c);
	}
}
