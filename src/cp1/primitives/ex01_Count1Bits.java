package cp1.primitives;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
 * Writing a program to count the number of bits that are set to 1 in an integer is a good
way to get up to speed with primitive types. The following program tests bits oneat-
a-time starting with the least-significant bit. It illustrates shifting and masking; it
also showshow to avoid hard-coding the size of the integer word.
 * */
public class ex01_Count1Bits {

	public static short countBits(int x) {
		short numBits = 0;
		while (x != 0) {
			numBits += (x & 1);
			x >>>= 1;
		}
		return numBits;
	}
	
	@Test
	public void numberOfBits2() {
		assertEquals(2,countBits(24));
	}
}