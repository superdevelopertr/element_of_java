package cp5.stack_and_queue;

import java.util.Deque;
import java.util.LinkedList;

public class Study_Queue {

	public static void main(String[] args) {
		Deque<Integer> deq = new LinkedList<>();

		try {
		//	System.out.println("poll first: "+deq.pollFirst());
			System.out.println(deq.removeFirst());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
		//	System.out.println("getFirst: "+deq.peekFirst());
			System.out.println(deq.getFirst());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
