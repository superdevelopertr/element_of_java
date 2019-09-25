package cp2.arrays;

import static org.junit.Assert.assertArrayEquals;

import java.util.LinkedHashSet;
import java.util.Set;

import org.junit.Test;

/*
 * This problem is concerned with deleting repeated elements from a sorted array.
For example, for the array (2,3,5,5,7,11,11,11,13), then after deletion, the array is
(2,3,5,7,11,13,0,0,0). After deleting repeated elements, there are 6 valid entries.
There are no requirements as to the values stored beyond the last valid element.
Write a program which takes as input a sorted array and updates it so that all dupli¬
cates have been removed and the remaining elements have been shifted left to fill the
emptied indices. Return the number of valid elements. Many languages have library
functions for performing this operation—you cannot use these functions.
Hint: There is an0(n) time and 0(1) space solution.
 * */
public class ex4_deleteDuplicatesInSortedArray_hash {

	public int[] deletedDuplicate(int[] numbers) {
		Set<Integer> distinctValues = new LinkedHashSet<>();
		for(int i: numbers) {
			distinctValues.add(i);
		}
		int index = 0;
		int [] result = new int[numbers.length];
		for(int i:distinctValues) {
			result[index++]=i;
		}
		return result;
	}


	@Test
	public void test_delete_duplicate_in_sorted_array() {
		int[] numbers = { 2, 3, 5, 5, 7, 11, 11, 11, 13 };
		int[] expected = { 2, 3, 5, 7, 11, 13, 0, 0, 0 };

		assertArrayEquals(expected, deletedDuplicate(numbers));
	}

	//@Test
	public void test_delete_duplicate_in_sorted_array2() {
		int[] numbers = { 2, 3, 5, 5, 7, 11, 11, 11, 13, 13, 25 };
		int[] expected = { 2, 3, 5, 7, 11, 13, 25, 0, 0, 0, };

		assertArrayEquals(expected, deletedDuplicate(numbers));
	}

}