package com.onlineinteract.lists;

import com.onlineinteract.queue.api.Deque;

/**
 * Implementing the Deque interface effectively also makes this
 * act like as a Double Ended Queue data structure.
 * 
 * Created by Digilogue on 14/11/2016.
 */
public class DoublyLinkedList<E> implements Deque<E> {

	// Nested node class
	private static class Node<E> {
		private E element;
		private Node<E> prev;
		private Node<E> next;

		public Node(E e, Node<E> p, Node<E> n) {
			this.element = e;
			this.prev = p;
			this.next = n;
		}

		public E getElement() {
			return element;
		}

		public Node<E> getPrev() {
			return prev;
		}

		public void setPrev(Node<E> n) {
			prev = n;
		}

		public Node<E> getNext() {
			return next;
		}

		public void setNext(Node<E> n) {
			next = n;
		}
	}

	private Node<E> header;
	private Node<E> trailer;

	private int size = 0;

	public DoublyLinkedList() {
		header = new Node<>(null, null, null);
		trailer = new Node<>(null, null, null);
		header.setNext(trailer);
		trailer.setPrev(header);
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public E first() {
		if (isEmpty())
			return null;
		return header.getNext().getElement(); // first element is
												// beyond header
	}

	public E last() {
		if (isEmpty())
			return null;
		return trailer.getPrev().getElement(); // last element is
												// before trailer
	}

	// public update methods

	/**
	 * Adds element e to the front of the list.
	 */
	public void addFirst(E e) {
		addBetween(e, header, header.getNext()); // place just after
													// the header
	}

	/**
	 * Adds element e to the end of the list.
	 */
	public void addLast(E e) {
		addBetween(e, trailer.getPrev(), trailer); // place just
													// before the
													// trailer
	}

	/**
	 * Removes and returns the first element of the list.
	 */
	public E removeFirst() {
		if (isEmpty())
			return null; // nothing to remove
		return remove(header.getNext()); // first element is beyond
											// header
	}

	/**
	 * Removes and returns the last element of the list.
	 */
	public E removeLast() {
		if (isEmpty())
			return null; // nothing to remove
		return remove(trailer.getPrev()); // last element is before
											// trailer
	}
	// private update methods

	/**
	 * Adds element e to the linked list in between the given nodes.
	 */
	private void addBetween(E e, Node<E> predecessor, Node<E> successor) {
		// create and link a new node
		Node<E> newest = new Node<>(e, predecessor, successor);
		predecessor.setNext(newest);
		successor.setPrev(newest);
		size++;
	}

	/**
	 * Removes the given node from the list and returns its element.
	 */
	private E remove(Node<E> node) {
		Node<E> predecessor = node.getPrev();
		Node<E> successor = node.getNext();
		predecessor.setNext(successor);
		successor.setPrev(predecessor);
		size--;
		return node.getElement();
	}

	public Node<E> getHeader() {
		return header;
	}

	public void setHeader(Node<E> header) {
		this.header = header;
	}

	public Node<E> getTrailer() {
		return trailer;
	}

	public void setTrailer(Node<E> trailer) {
		this.trailer = trailer;
	}

	public static void main(String[] args) {
		DoublyLinkedList<String> doublyLinkedList = new DoublyLinkedList<>();

		// Add x4 items to doubly linked list.
		System.out.println("* Add x4 items to doubly linked list.");
		doublyLinkedList.addFirst("A");
		doublyLinkedList.addFirst("B");
		doublyLinkedList.addFirst("C");
		doublyLinkedList.addFirst("D");

		// print all items
		System.out.println("\n* print all items");
		Node<String> next = doublyLinkedList.getHeader();
		while ((next = next.getNext()) != null) {
			System.out.println(next.getElement());
		}

		// Search and remove Node with value B
		System.out.println("\n* Search and remove Node with value B");
		next = doublyLinkedList.getHeader();
		while ((next = next.getNext()) != null) {
			if (next.getElement().equals("B")) {
				doublyLinkedList.remove(next);
				break;
			}
		}

		// print all items
		System.out.println("\n* print all items");
		next = doublyLinkedList.getHeader();
		while ((next = next.getNext()) != null) {
			System.out.println(next.getElement());
		}

		// remove first and last nodes
		System.out.println("\n* remove first and last nodes");
		doublyLinkedList.removeFirst();
		doublyLinkedList.removeLast();

		// print all items
		System.out.println("\n* print all items");
		next = doublyLinkedList.getHeader();
		while ((next = next.getNext()) != null) {
			System.out.println(next.getElement());
		}

	}
}
