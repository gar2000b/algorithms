package com.onlineinteract.queue;

import com.onlineinteract.lists.SinglyLinkedList;
import com.onlineinteract.queue.api.Queue;

/**
 * Realization of a FIFO queue as an adaptation of a SinglyLinkedList.
 */
public class LinkedQueue<E> implements Queue<E> {
	// An empty list
	private SinglyLinkedList<E> list = new SinglyLinkedList<>();

	// new queue relies on the initially empty list
	public LinkedQueue() {
	}

	public int size() {
		return list.size();
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}

	public void enqueue(E element) {
		list.addLast(element);
	}

	public E first() {
		return list.first();
	}

	public E dequeue() {
		return list.removeFirst();
	}
}