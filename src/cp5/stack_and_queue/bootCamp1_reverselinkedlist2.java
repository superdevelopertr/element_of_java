package cp5.stack_and_queue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class bootCamp1_reverselinkedlist2 {

	public void printReverse(List<Integer> dq) {
		for (int i = dq.size() - 1; i >= 0; i--) {
			System.out.println(dq.get(i));
		}
	}

	@Test
	public void print() {
		List<Integer> items = Arrays.asList(1, 2, 3, 4, 5, 6);
		printReverse(items);
	}
}