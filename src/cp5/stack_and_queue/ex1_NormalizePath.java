package cp5.stack_and_queue;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

import org.junit.Test;

public class ex1_NormalizePath {

	@Test
	public void test_parentSymbol() {
		assertEquals("d:\\data\\projects\\another-project",
				normalize("d:\\data\\projects\\a-project\\..\\another-project"));
		assertEquals("d:\\data\\projects\\another-project",
				normalize("d:\\data\\projects\\.\\a-project\\..\\another-project"));
	}

	private String normalize(String path) {

		String[] items = path.split("\\\\");
		Deque<String> symbolStack = new LinkedList<>();
		Arrays.stream(items).forEach(symbolStack::push);

		Deque<String> resultStack = new LinkedList<>();
		boolean hasParentSymbol = false;
		while (!symbolStack.isEmpty()) {
			String item = symbolStack.pop();
			if (item.equals(".")) {
				continue;
			} else if (item.equals("..")) {
				hasParentSymbol = true;
				continue;
			} else {
				if (!hasParentSymbol) {
					resultStack.push(item);
				} else {
					hasParentSymbol = false;
				}
			}
		}
		
	
		return resultStack.stream().reduce((a,b)->a+"\\"+b).get();
	}
}