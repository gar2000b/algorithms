package com.onlineinteract.queue;

import com.onlineinteract.queue.api.CircularQueue;

public class Josephus {

	/**
	 * Computes the winner of the Josephus problem using a circular
	 * queue.
	 */
	public static <E> E Josephus(CircularQueue<E> queue, int k) {

		if (queue.isEmpty())
			return null;

		while (queue.size() > 1) {
			// Skip past k-1 elements.
			for (int i = 0; i < k - 1; i++)
				queue.rotate();
			// Remove the front element from the collection.
			E e = queue.dequeue();
			System.out.println("	" + e + " is out");
		}
		// The winner.
		return queue.dequeue();
	}

	/**
	 * Builds a circular queue from an array of objects.
	 */
	public static <E> CircularQueue<E> buildQueue(E a[]) {
		CircularQueue<E> queue = new LinkedCircularQueue<>();
		for (int i = 0; i < a.length; i++)
			queue.enqueue(a[i]);
		return queue;
	}

	/**
	 * Tester method main.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String[] a1 = { "Alice", "Bob", "Cindy", "Doug", "Ed", "Fred" };
		String[] a2 = { "Gene", "Hope", "Irene", "Jack", "Kim", "Lance" };
		String[] a3 = { "Mike", "Roberto" };
		System.out.println("First winner is " + Josephus(buildQueue(a1), 3));
		System.out.println("Second winner is " + Josephus(buildQueue(a2), 10));
		System.out.println("Third winner is " + Josephus(buildQueue(a3), 7));
	}
}
