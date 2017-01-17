package com.onlineinteract.lists;

import com.onlineinteract.lists.api.List;

/**
 * An unbounded ArrayList something akin to java.util.ArrayList.
 * 
 * @author Gary Black / Digilogue
 *
 * @param <E>
 */
public class DynamicArrayList<E> implements List<E> {

	// Instance variables
	public static final int CAPACITY = 5;
	private E[] data;
	private int size = 0;

	// Constructors
	public DynamicArrayList() {
		this(CAPACITY);
	}

	@SuppressWarnings("unchecked")
	public DynamicArrayList(int capacity) {
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
		// Double the capacity if capacity is reached.
		if (size == data.length)
			resize(2 * data.length);
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

	/** Resizes internal array to have given capacity >= size. */
	@SuppressWarnings("unchecked")
	protected void resize(int capacity) {
		// safe cast; compiler, may give warning.
		E[] temp = (E[]) new Object[capacity];
		for (int k = 0; k < size; k++)
			temp[k] = data[k];
		// start using the new array
		data = temp;
	}

	// utility method
	/** Checks whether the given index is in the range [0, n−1]. */
	protected void checkIndex(int i, int n) throws IndexOutOfBoundsException {
		if (i < 0 || i >= n)
			throw new IndexOutOfBoundsException("Illegal index: " + i);
	}

	public int getInnerArrayLength() {
		return data.length;
	}

	/**
	 * Testing simple Bounded ArrayList data structure.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		DynamicArrayList<Integer> al = new DynamicArrayList<>();
		al.add(0, 1);
		al.add(0, 2);
		al.add(0, 3);
		al.add(0, 4);
		al.add(0, 5);

		for (int i = 0; i < al.size; i++) {
			System.out.println(al.get(i));
		}

		System.out.println("\nInner Array Length is: " + al.getInnerArrayLength());

		al.add(0, 4);
		al.add(0, 5);

		System.out.println("\nInner Array Length is: " + al.getInnerArrayLength());

		al.add(0, 6);
		al.add(0, 7);
		al.add(0, 8);
		al.add(0, 9);

		System.out.println("\nInner Array Length is: " + al.getInnerArrayLength());

	}
}
