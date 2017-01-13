package com.onlineinteract.stack;

import com.onlineinteract.stack.api.Stack;

/**
 * A collection of objects that are inserted and removed according to
 * the last-in first-out principle. This is an array implementation of
 * the stack. Time Complexity for all methods = O(n).
 * 
 * @author Gary Black / Digilogue
 *
 * @param <E>
 */
public class ArrayStack<E> implements Stack<E> {

	// Default Array capacity.
	public static int CAPACITY = 1000;

	// Generic array used for storge.
	private E[] data;

	// Index of the top element in stack
	private int t = -1;

	// Constructs stack with default capacity
	public ArrayStack() {
		this(CAPACITY);
	}

	// Constructs stack with given capacity
	@SuppressWarnings("unchecked")
	public ArrayStack(int capacity) {
		// safe cast - compiler may give warning
		data = (E[]) new Object[capacity];
	}

	@Override
	public int size() {
		return t + 1;
	}

	@Override
	public boolean isEmpty() {
		return t == -1;
	}

	@Override
	public void push(E e) throws IllegalStateException {
		if (size() == data.length)
			throw new IllegalStateException("Stack is full");
		// increment t before storing new item
		data[++t] = e;
	}

	@Override
	public E top() {
		if (isEmpty())
			return null;
		return data[t];
	}

	@Override
	public E pop() {
		if (isEmpty())
			return null;
		E answer = data[t];
		data[t] = null;
		t--;
		return answer;
	}

}
