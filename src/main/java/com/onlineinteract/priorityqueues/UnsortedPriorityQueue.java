package com.onlineinteract.priorityqueues;

import java.util.Comparator;

import com.onlineinteract.lists.LinkedPositionalList;
import com.onlineinteract.lists.api.Position;
import com.onlineinteract.lists.api.PositionalList;
import com.onlineinteract.priorityqueues.api.Entry;

/** An implementation of a priority queue with an unsorted list. */
public class UnsortedPriorityQueue<K, V> extends AbstractPriorityQueue<K, V> {
	/** primary collection of priority queue entries */
	private PositionalList<Entry<K, V>> list = new LinkedPositionalList<>();

	/**
	 * Creates an empty priority queue based on the natural ordering
	 * of its keys.
	 */
	public UnsortedPriorityQueue() {
		super();
	}

	/**
	 * Creates an empty priority queue using the given comparator to
	 * order keys.
	 */
	public UnsortedPriorityQueue(Comparator<K> comp) {
		super(comp);
	}

	/** Returns the Position of an entry having minimal key. */
	private Position<Entry<K, V>> findMin() { // only called when
												// nonempty
		Position<Entry<K, V>> small = list.first();
		for (Position<Entry<K, V>> walk : list.positions())
			if (compare(walk.getElement(), small.getElement()) < 0)
				small = walk; // found an even smaller key
		return small;
	}

	/** Inserts a key-value pair and returns the entry created. */
	public Entry<K, V> insert(K key, V value) throws IllegalArgumentException {
		checkKey(key); // auxiliary key-checking method (could throw
						// exception)
		Entry<K, V> newest = new PQEntry<>(key, value);
		list.addLast(newest);
		return newest;
	}

	/** Returns (but does not remove) an entry with minimal key. */
	public Entry<K, V> min() {
		if (list.isEmpty())
			return null;
		return findMin().getElement();
	}

	/** Removes and returns an entry with minimal key. */
	public Entry<K, V> removeMin() {
		if (list.isEmpty())
			return null;
		return list.remove(findMin());
	}

	/** Returns the number of items in the priority queue. */
	public int size() {
		return list.size();
	}
	
	public static void main(String[] args) {
		UnsortedPriorityQueue<String, String> upq = new UnsortedPriorityQueue<>();
		
		upq.insert("Gary", "37 year old Software Engineer, flying to Gibralta");
		upq.insert("Derek", "35 year old Model Maker flying to Canada");
		upq.insert("Elaine", "32 year old Accountant flying to USA");
		
		// Print out min entry
		Entry<String, String> min = upq.min();
		System.out.println(min.getKey() + " " + min.getValue());
	}
}