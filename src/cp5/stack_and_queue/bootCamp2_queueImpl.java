package cp5.stack_and_queue;

import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;

public class bootCamp2_queueImpl {

	private Deque<Integer> data = new LinkedList<>();
	
	public void enqueue(Integer number) {
		data.add(number);
	}
	
	public Integer dequeue() {
		return data.removeFirst();
	}

	public Integer max() {
		return Collections.max(data);
	}

	public boolean isEmpty() {
		return data.isEmpty();
	}
	
	public static void main(String[] args) {
		bootCamp2_queueImpl a = new bootCamp2_queueImpl();
		a.enqueue(1);
		a.enqueue(2);
		a.enqueue(3);
		
		System.out.println(a.max());
		System.out.println(a.dequeue());
	}
}
