package cp2.arrays;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class ex2_sortByEvenOddWithoutExtraMemory {


	/*
	 * Your input is an
array of integers, and you have to reorder its entries so that the even entries appear
first. This is easy if you use 0(n) space, where n is the length of the array.
However,
you are required to solve it without allocating additional storage.
	 * */
	private int[] sortByEvenOdd(int[] numbers) {
		int nextEven=0, nextOdd = numbers.length-1;
		while(nextEven<nextOdd) {
			if(numbers[nextEven]%2==0) {
				nextEven++;
			}else {
				int temp = numbers[nextEven];
				numbers[nextEven]= numbers[nextOdd];
				numbers[nextOdd--]=temp;
			}
		}
		
		return numbers;
	}
	
	@Test
	public void test_arrays_sorted_equals() {
		int[] numbers = {1,2,3,4,5,6,7};
		int[] expected = {6,2,4,5,3,7,1};
		
		assertArrayEquals(expected, sortByEvenOdd(numbers));
	}
	
	@Test
	public void test_arrays_equals() {
		int[] numbers = {3,5,1,2,6,9,0,12};
		int[] expected = {12,0,6,2,9,1,5,3};
		
		assertArrayEquals(expected, sortByEvenOdd(numbers));
	}
}