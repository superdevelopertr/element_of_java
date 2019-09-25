package cp1.primitives;

/*
 * 
 * The parity of a binary word is 1 if the number of Is in the word is odd; otherwise,
	it is 0. For example, the parity of 1011 is 1, and the parity of 10001000 is 0.
 * */
public class ex02_ParityBits {
	public static short parity(int x) {
		short res = 0;
		while (x != 0) {
			res ^= (x & 1);
			x >>>= 1;
		}
		return res;
	}
}