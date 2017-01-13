package com.onlineinteract.queue.api;

/**
 * A collection of objects that are inserted and removed according to
 * the first-in first-out principle. Although similar in purpose, this
 * interface differs from java.util.Queue.
 * 
 * @author Gary Black / Digilogue
 *
 * @param <E>
 */
public interface Queue<E> {
	/** Returns the number of elements in the queue. */
	int size();

	/** Tests whether the queue is empty. */
	boolean isEmpty();

	/** Inserts an element at the rear of the queue. */
	void enqueue(E e);

	/**
	 * Returns, but does not remove, the first element of the queue
	 * (null if empty).
	 */
	E first();

	/**
	 * Removes and returns the first element of the queue (null if
	 * empty).
	 */
	E dequeue();
}