package com.onlineinteract.queue;

/**
 * Examples testing both the ArrayQueue and LinkedQueue
 * @author Gary Black / Digilogue
 *
 */
public class QueueExamples {

	public static void main(String[] args) {
		LinkedQueue<Integer> lq1 = new LinkedQueue<>();
		lq1.enqueue(5);
		lq1.enqueue(8);
		lq1.enqueue(4);
		lq1.enqueue(9);

		int length = lq1.size();
		for (int j = 0; j < length; j++) {
			Integer result = lq1.dequeue();
			System.out.println(result);
		}
		
		System.out.println("Queue size is: " + lq1.size() + "\n");
		
		ArrayQueue<Integer> aq1 = new ArrayQueue<>();
		aq1.enqueue(5);
		aq1.enqueue(8);
		aq1.enqueue(4);
		aq1.enqueue(9);

		length = aq1.size();
		for (int j = 0; j < length; j++) {
			Integer result = aq1.dequeue();
			System.out.println(result);
		}
		
		System.out.println("Queue size is: " + aq1.size());
	}
}
