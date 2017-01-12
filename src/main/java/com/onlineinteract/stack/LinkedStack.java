package com.onlineinteract.stack;

import com.onlineinteract.lists.SinglyLinkedList;
import com.onlineinteract.stack.api.Stack;

/**
 * A collection of objects that are inserted and removed according to
 * the last-in first-out principle. This is the Linked List
 * implementation of the stack. Time Complexity for all methods =
 * O(n).
 * 
 * @author Gary Black / Digilogue
 *
 * @param <E>
 */
public class LinkedStack<E> implements Stack<E> {

	// An empty list
	private SinglyLinkedList<E> list = new SinglyLinkedList<>();

	// new stack relies on the initially empty list
	public LinkedStack() {
	}

	public int size() {
		return list.size();
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}

	public void push(E element) {
		list.addFirst(element);
	}

	public E top() {
		return list.first();
	}

	public E pop() {
		return list.removeFirst();
	}
}
