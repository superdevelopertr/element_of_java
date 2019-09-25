package cp5.stack_and_queue;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class KnowingYourLibrary {

	public static void main(String[] args) {
		Deque<Integer> deq = new LinkedList<>();
		
		try {
			deq.pop();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		deq.push(null);
		deq.push(null);
		System.out.println(deq.isEmpty());
		
		
		Deque<Integer> deq2 = new LinkedList<>();
		deq2.push(1);
		deq2.push(2);
		deq2.push(3);
		
		System.out.println("print in stack way");
		Iterator<Integer> i = deq2.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println("print in unstack way");
		i = deq2.descendingIterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}