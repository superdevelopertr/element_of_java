package cp2.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class Study {

	// @Test
	public void study_length() {

		int[] a = { 3, 5, 7, 9 };
		System.out.println(a.length);

		String word = "hello world";
		System.out.println(word.length());

		List<String> words = new ArrayList<>();
		System.out.println(words.size());

		int[][] sample = new int[5][];
		System.out.println(sample.length);
		// System.out.println(sample[0].length);

		int[] b = new int[10];
		Arrays.fill(b, 12);
		System.out.println(b);

		int[] c = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12 };
		System.out.println(Arrays.binarySearch(c, 3));

		int[] a1 = { 1, 2, 3, 4, 5 };
		int[] a2 = { 1, 2, 3, 4, 5 };
		System.out.println(a1);
		System.out.println(a2);

		System.out.println(Arrays.equals(a1, a2));

		int[] res = Arrays.copyOf(a1, 10);
		System.out.println("arrays:" + Arrays.toString(res));

		List<Integer> items = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		System.out.println("collections:" + Collections.binarySearch(items, 3));
	}
	
	@Test
	public void test_2d_arrays() {
		int[][] a = new int[5][];
		a[0]= new int[]{1,2,3,4,5};
		a[1]= new int[]{1,2,3,4,5,6};
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(Arrays.toString(a[i]));
		}
	}
}