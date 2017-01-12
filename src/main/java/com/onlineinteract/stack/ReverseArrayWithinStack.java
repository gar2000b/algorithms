package com.onlineinteract.stack;

import java.util.Arrays;
import com.onlineinteract.stack.api.Stack;

public class ReverseArrayWithinStack {

	/** Tester routine for reversing arrays */
	public static void main(String args[]) {
		// autoboxing allows this.
		Integer[] a = { 4, 8, 15, 16, 23, 42 };
		String[] s = { "Jack", "Kate", "Hurley", "Jin", "Michael" };
		System.out.println("a = " + Arrays.toString(a));
		System.out.println("s = " + Arrays.toString(s));
		System.out.println("Reversing...");
		reverse(a);
		reverse(s);
		System.out.println("a = " + Arrays.toString(a));
		System.out.println("s = " + Arrays.toString(s));
	}

	/** A generic method for reversing an array. */
	public static <E> void reverse(E[] a) {
		Stack<E> buffer = new ArrayStack<>(a.length);
		for (int i = 0; i < a.length; i++)
			buffer.push(a[i]);
		for (int i = 0; i < a.length; i++)
			a[i] = buffer.pop();
	}
}