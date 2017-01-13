package com.onlineinteract.queue;

import com.onlineinteract.queue.api.Queue;

/** Implementation of the queue ADT using a fixed-length array. */
public class ArrayQueue<E> implements Queue<E> { // instance variables
	private E[] data; // generic array used for storage
	private int f = 0; // index of the front element
	private int sz = 0; // current number of elements
	// Default Array capacity.
	public static int CAPACITY = 1000;

	// constructors
	// constructs queue with default capacity
	public ArrayQueue() {
		this(CAPACITY);
	}

	// constructs queue with given capacity
	@SuppressWarnings("unchecked")
	public ArrayQueue(int capacity) {
		// safe cast; compiler may give warning
		data = (E[]) new Object[capacity];
	}

	// methods
	/** Returns the number of elements in the queue. */
	public int size() {
		return sz;
	}

	/** Tests whether the queue is empty. */
	public boolean isEmpty() {
		return (sz == 0);
	}

	/** Inserts an element at the rear of the queue. */
	public void enqueue(E e) throws IllegalStateException {
		if (sz == data.length)
			throw new IllegalStateException("Queue is full");
		// use modular arithmetic
		int avail = (f + sz) % data.length;
		data[avail] = e;
		sz++;
	}

	/**
	 * Returns, but does not remove, the first element of the queue
	 * (null if empty).
	 */
	public E first() {
		if (isEmpty())
			return null;
		return data[f];
	}

	/**
	 * Removes and returns the first element of the queue (null if
	 * empty).
	 */
	public E dequeue() {
		if (isEmpty())
			return null;
		E answer = data[f];
		// dereference to help garbage collection
		data[f] = null;
		f = (f + 1) % data.length;
		sz--;
		return answer;
	}
}