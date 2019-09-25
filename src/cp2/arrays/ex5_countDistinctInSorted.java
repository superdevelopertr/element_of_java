package cp2.arrays;

import static org.junit.Assert.assertEquals;

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
public class ex5_countDistinctInSorted {

	public int deletedDuplicate(int[] numbers) {
		int k = 0;	int count = 0;
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] != numbers[k]) {
				count++;
				k = i;
			}
		}
		return count+1;
	}

	@Test
	public void test_delete_duplicate_in_sorted_array() {
		int[] numbers = { 1, 2, 2, 3, 4, 5, 5, 6 };

		assertEquals(6, deletedDuplicate(numbers));
	}

	@Test
	public void test_delete_duplicate_in_sorted_array2() {
		int[] numbers = { 1, 2, 2, 2, 2, 3, 4, 5, 5, 5, 5, 6 };

		assertEquals(6, deletedDuplicate(numbers));
	}

}