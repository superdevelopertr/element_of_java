package cp2.arrays;

import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class ex6_sudoko_isValid {

	public boolean isValid(int[][] values) {

		// check rows
		for (int i = 0; i < values.length; i++) {
			if (hasDuplicate(values, i, i + 1, 0, values[i].length)) {
				return false;
			}
		}

		// check columns
		for (int i = 0; i < values.length; i++) {
			if (hasDuplicate(values, 0, values[i].length, i , i+1)) {
				return false;
			}
		}
		
		//check region constraints
		double length = Math.sqrt(values.length);
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				if(hasDuplicate(values, i*(int)length, (i+1)*(int)length, j*(int)length, (j+1)*(int)length)) {
					return false;
				}
			}
		}
		
		return true;
	}

	private boolean hasDuplicate(int[][] values, int startRow, int endRow, int startColumn, int endColumn) {
		Set<Integer> temp = new HashSet<>();
		for (int i = startRow; i < endRow; i++) {
			for (int j = startColumn; j < endColumn; j++) {
				if (temp.contains(values[i][j])) {
					return true;
				} else {
					temp.add(values[i][j]);
				}
			}
		}
		return false;
	}

	@Test
	public void validate_valid_sudoku() {
		int[][] values = { 
				{ 5, 3, 4, 6, 7, 8, 9, 1, 2 }, 
				{ 6, 7, 2, 1, 9, 5, 3, 4, 8 }, 
				{ 1, 9, 8, 3, 4, 2, 5, 6, 7 },
				{ 8, 5, 9, 7, 6, 1, 4, 2, 3 }, 
				{ 4, 2, 6, 8, 5, 3, 7, 9, 1 }, 
				{ 7, 1, 3, 9, 2, 4, 8, 5, 6 },
				{ 9, 6, 1, 5, 3, 7, 2, 8, 4 }, 
				{ 2, 8, 7, 4, 1, 9, 6, 3, 5 }, 
				{ 3, 4, 5, 2, 8, 6, 1, 7, 9 } };

		assertTrue(isValid(values));
	}

}