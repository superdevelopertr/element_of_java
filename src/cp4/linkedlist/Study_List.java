package cp4.linkedlist;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Study_List {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10,1,4,7,9,12);
		//numbers.add(56);
		//numbers.remove(4);
		System.out.println(numbers);
		
		Collections.sort(numbers);
		System.out.println(numbers);
		
		Collections.reverse(numbers);
		System.out.println(numbers);
		
		Collections.rotate(numbers, 2);
		System.out.println(numbers);
		
		System.out.println(Collections.max(numbers));
		
		Collections.swap(numbers, 1, 5);
		System.out.println(numbers);

		
		List<Integer> items= Arrays.asList(new Integer[]{3,5,7,10});
		System.out.println(items);
				
	}
}
