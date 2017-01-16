package com.onlineinteract.queue;

import com.onlineinteract.lists.DoublyLinkedList;

/**
 * This example demonstrates the use of a doubly linked list as a
 * double ended queue as it simply implements the Deque interface.
 * 
 * @author Gary Black / Digilogue
 *
 */
public class DoubleEndedQueueExample {

	public static void main(String[] args) {
		DoublyLinkedList<Integer> dll = new DoublyLinkedList<>();
		dll.addLast(5);
		dll.addFirst(3);
		dll.addFirst(7);

		System.out.println(dll.first());
		System.out.println(dll.removeLast());
		System.out.println(dll.size());
		System.out.println(dll.removeLast());
		System.out.println(dll.removeFirst());

		dll.addFirst(6);

		System.out.println(dll.last());

		dll.addFirst(8);

		System.out.println(dll.isEmpty());
		System.out.println(dll.last());
	}

}
