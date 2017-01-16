package com.onlineinteract.queue;

import com.onlineinteract.lists.CircularlyLinkedList;
import com.onlineinteract.queue.api.CircularQueue;

/**
 * Realization of a FIFO queue as an adaptation of a
 * CircularlyLinkedList.
 */
public class LinkedCircularQueue<E> implements CircularQueue<E> {

	// An empty list
	private CircularlyLinkedList<E> list = new CircularlyLinkedList<>();

	@Override
	public int size() {
		return list.size();
	}

	@Override
	public boolean isEmpty() {
		return list.isEmpty();
	}

	@Override
	public void enqueue(E e) {
		list.addLast(e);
	}

	@Override
	public E first() {
		return list.first();
	}

	@Override
	public E dequeue() {
		return list.removeFirst();
	}

	@Override
	public void rotate() {
		list.rotate();
	}

}
