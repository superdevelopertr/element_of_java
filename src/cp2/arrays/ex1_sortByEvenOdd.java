package cp2.arrays;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class ex1_sortByEvenOdd {


	/*
	 * Your input is an
array of integers, and you have to reorder its entries so that the even entries appear
first. This is easy if you use 0(n) space, where n is the length of the array.
	 * */
	private int[] sortByEvenOdd(int[] numbers) {
		int []temp = new int[numbers.length];
		int eventIndex = 0;
		int oddIndex = numbers.length-1;
		
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i]%2==0) {
				temp[eventIndex++]=numbers[i];
			}else {
				temp[oddIndex--]=numbers[i];
			}
		}
		return temp;
	}
	
	@Test
	public void test_arrays_equals() {
		int[] numbers = {3,5,1,2,6,9,0,12};
		int[] expected = {2,6,0,12,9,1,5,3};
		
		assertArrayEquals(expected, sortByEvenOdd(numbers));
	}
	
	@Test
	public void test_arrays_sorted_equals() {
		int[] numbers = {1,2,3,4,5,6,7};
		int[] expected = {2,4,6,7,5,3,1};
		
		assertArrayEquals(expected, sortByEvenOdd(numbers));
	}

}