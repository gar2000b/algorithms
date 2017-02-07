package com.onlineinteract.priorityqueues.app;

import com.onlineinteract.priorityqueues.UnsortedPriorityQueue;
import com.onlineinteract.priorityqueues.api.Entry;
import com.onlineinteract.priorityqueues.api.PriorityQueue;

public class UnsortedPriorityQueueApp {
	public static void main(String[] args) {
		PriorityQueue<String, String> upq = new UnsortedPriorityQueue<>();

		upq.insert("Gary", "37 year old Software Engineer, flying to Gibralta");
		upq.insert("Derek", "35 year old Model Maker flying to Canada");
		upq.insert("Elaine", "32 year old Accountant flying to USA");

		// Print out min entry
		Entry<String, String> min = upq.min();
		System.out.println(min.getKey() + " " + min.getValue());

		// Iterate over Unsorted PriorityQueue removing all entries
		// and printing to screen.
		int size = upq.size();
		for (int i = 0; i < size; i++) {
			Entry<String, String> removeMin = upq.removeMin();
			System.out.println(removeMin.getKey() + " " + removeMin.getValue());
		}

		// Print out size of unsorted priority queue.
		System.out.println("The size of the unsorted priority queue is now: " + upq.size());

	}
}
