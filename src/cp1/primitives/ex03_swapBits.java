package cp1.primitives;

public class ex03_swapBits {

	/*
	 * A 64-bit integer can be viewed as an array of 64 bits, with the bit at index 0 corre¬
sponding to the least significant bit (LSB), and the bit at index 63 corresponding to
the most significant bit (MSB). Implement code that takes as input a 64-bit integer
and swaps the bits at indices i and y. Figure 5.1 illustrates bit swapping for an 8-bit
integer.
	 * */
	public int swap(int n, int i, int j) {
		if(((n>>i)&1)!=((n>>j)&1)) { //if bits are not equal
			int mask = 1>>i | 1>>j;
			n = n ^ mask;
		}
		return n;
	}
}