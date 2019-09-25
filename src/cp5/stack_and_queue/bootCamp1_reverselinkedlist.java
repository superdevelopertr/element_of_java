package cp5.stack_and_queue;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class bootCamp1_reverselinkedlist {

	public void printReverse(List<Integer> dq) {
		Deque<Integer> stc = new LinkedList<>();
		dq.forEach(stc::push);
		while(!stc.isEmpty()) {
			System.out.println(stc.pop());
		}		
	}
	
	@Test
	public void print() {
		List<Integer> items = Arrays.asList(1,2,3,4,5,6);
		printReverse(items);
	}
}