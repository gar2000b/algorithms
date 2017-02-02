package com.onlineinteract.priorityqueues.api;

/** Interface for the priority queue ADT. */
public interface PriorityQueue<K, V> {
	int size();

	boolean isEmpty();

	Entry<K, V> insert(K key, V value) throws IllegalArgumentException;

	Entry<K, V> min();

	/**
	 * Testign javadoc for removeMin which incidentally removes and
	 * returns the min entry.
	 * 
	 * @return
	 */
	Entry<K, V> removeMin();
}