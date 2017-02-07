package com.onlineinteract.priorityqueues.app;

import com.onlineinteract.priorityqueues.SortedPriorityQueue;
import com.onlineinteract.priorityqueues.api.Entry;
import com.onlineinteract.priorityqueues.api.PriorityQueue;

public class SortedPriorityQueueApp {

	public static void main(String[] args) {
		PriorityQueue<String, String> spq = new SortedPriorityQueue<>();

		spq.insert("Gary", "37 year old Software Engineer, flying to Gibralta");
		spq.insert("Derek", "35 year old Model Maker flying to Canada");
		spq.insert("Elaine", "32 year old Accountant flying to USA");

		// Print out min entry
		Entry<String, String> min = spq.min();
		System.out.println(min.getKey() + " " + min.getValue());

		// Iterate over Sorted PriorityQueue removing all entries
		// and printing to screen.
		int size = spq.size();
		for (int i = 0; i < size; i++) {
			Entry<String, String> removeMin = spq.removeMin();
			System.out.println(removeMin.getKey() + " " + removeMin.getValue());
		}

		// Print out size of sorted priority queue.
		System.out.println("The size of the unsorted priority queue is now: " + spq.size());

	}
}
