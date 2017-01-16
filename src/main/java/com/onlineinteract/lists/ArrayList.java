package com.onlineinteract.lists;

import com.onlineinteract.lists.api.List;

public class ArrayList<E> implements List<E> {

	// Instance variables
	public static final int CAPACITY = 16;
	private E[] data;
	private int size = 0;

	// Constructors
	public ArrayList() {
		this(CAPACITY);
	}

	@SuppressWarnings("unchecked")
	public ArrayList(int capacity) {
		data = (E[]) new Object[capacity];
	}

	/**
	 * Time Complexity = O(1)
	 */
	@Override
	public int size() {
		return size;
	}

	/**
	 * Time Complexity = O(1)
	 */
	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	/**
	 * Returns (but does not remove) the element at index i. Time
	 * Complexity = O(1)
	 */
	@Override
	public E get(int i) throws IndexOutOfBoundsException {
		checkIndex(i, size);
		return data[i];
	}

	/**
	 * Replaces the element at index i with e, and returns the
	 * replaced element. Time Complexity = O(1)
	 */
	@Override
	public E set(int i, E e) throws IndexOutOfBoundsException {
		checkIndex(i, size);
		E temp = data[i];
		data[i] = e;
		return temp;
	}

	/**
	 * Inserts element e to be at index i, shifting all subsequent
	 * elements later. Time Complexity = O(n)
	 */
	@Override
	public void add(int i, E e) throws IndexOutOfBoundsException {
		checkIndex(i, size + 1);
		if (size == data.length)
			throw new IllegalStateException("Array is full");
		// Start by shifting rightmost
		for (int j = size; j > i; j--)
			data[j] = data[j - 1];
		// Ready to place the new element
		data[i] = e;
		size++;
	}

	/**
	 * Removes/returns the element at index i, shifting subsequent
	 * elements earlier. Time Complexity = O(n)
	 */
	@Override
	public E remove(int i) throws IndexOutOfBoundsException {
		checkIndex(i, size);
		E temp = data[i];
		// Move elements leftward to fill empty
		for (int j = i; j < size - 1; j++)
			data[j] = data[j + 1];
		// Help garbage collect
		data[size - 1] = null;
		size--;

		return temp;
	}

	// utility method
	/** Checks whether the given index is in the range [0, n−1]. */
	protected void checkIndex(int i, int n) throws IndexOutOfBoundsException {
		if (i < 0 || i >= n)
			throw new IndexOutOfBoundsException("Illegal index: " + i);
	}

	/**
	 * Testing simple Bounded ArrayList data structure.
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(0, 1);
		al.add(0, 2);
		al.add(0, 3);
		al.add(0, 4);
		
		for (int i = 0; i < al.size; i++) {
			System.out.println(al.get(i));
		}
		
		al.remove(1);
		al.remove(0);
		System.out.println();
		
		for (int i = 0; i < al.size; i++) {
			System.out.println(al.get(i));
		}
		
		
	}
}
