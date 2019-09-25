package cp1.primitives;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Wk02_isPalindromeNumber {

	static int findFirstDigit(int number) {
		while(number>10) {
			number/=10;
		}
		return number;
	}
	
	static int findLastDigit(int number) {
		return number%10;
	}
	
	static int findNumberOfDigits(int number) {
		int count = 0;
		while(number>10) {
			number/=10;
			count++;
		}
		return count;
	}
	
	static boolean isPalindrome(int number) {
		
		while(number>10) {
			int first = findFirstDigit(number);
			int last = findLastDigit(number);
			if(first!=last) {
				return false;
			}
			number/=10;
			number-=first*Math.pow(10, findNumberOfDigits(number));
		}
		return true;
	}
	
	@Test
	public void isPalindrome_IsTrue() {
		assertTrue(isPalindrome(12321));
	}
	
	@Test
	public void isPalindrome_IsFalse() {
		assertFalse(isPalindrome(125321));
	}
}