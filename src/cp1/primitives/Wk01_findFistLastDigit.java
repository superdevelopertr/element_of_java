package cp1.primitives;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Wk01_findFistLastDigit {

	static int findFirstDigit(int number) {
		while(number>10) {
			number/=10;
		}
		return number;
	}
	
	static int findLastDigit(int number) {
		return number%10;
	}
	
	@Test
	public void firstDigit_is_2() {
		assertEquals(2, findFirstDigit(223));
	}
	
	@Test
	public void lastDigit_is_2() {
		assertEquals(2, findLastDigit(122));
	}
}