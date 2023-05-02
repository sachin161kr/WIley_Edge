package CollectionFramework;

import java.util.*;

import java.util.concurrent.*;

public class QueueClass {

	public static void main(String[] args) {
		
		Queue<Integer> pq = new PriorityQueue<>();
		PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
		
		pq.add(1);
		pq.add(3);
		pq.add(2);
		pq.add(4);
		
		pQueue.add(5);
		pQueue.add(1);
		pQueue.add(3);
		pQueue.add(2);
		pQueue.add(4);
	
//		pQueue.poll();		
		System.out.println(pq);
		
		System.out.println(pq.peek());
		
		System.out.println(pQueue);
		
		System.out.println(pQueue.peek());
		
		Deque<String> dq = new LinkedList<>();
		
		dq.add("Sachin");
		
		dq.addFirst("Venkat");
		
		System.out.println(dq);
		
		BlockingQueue<String> bq = new LinkedBlockingDeque<>();
		
		bq.add("Sachin");
		
		bq.add("Venkat");
		
		bq.add(null);
		
		System.out.println(bq);
		
	

	}

}
