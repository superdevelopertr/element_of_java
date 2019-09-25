package cp1.primitives;

import java.util.Random;

import org.junit.Test;

public class Study {

	//@Test
	public void negative_twos_complement() {
		System.out.println("************SHIFTING**************");
		System.out.println(-60>>1);
		System.out.println(Integer.toBinaryString(-60>>1));
		System.out.println(Integer.toBinaryString(-60>>>1));
		
		System.out.println("************MATHS**************");
		System.out.println(Math.abs(-12.99));
		System.out.println(Math.ceil(12.99));
		System.out.println(Math.floor(12.99));

		System.out.println("************USEFULL**************");
		System.out.println(Character.getNumericValue('4'));
		System.out.println('4'-'0');
		
		System.out.println("************RANDOM**************");
		Random r = new Random();
		System.out.println(r.nextInt(100));
		System.out.println(r.nextDouble());
		System.out.println(r.nextGaussian());
		
		
		int [] x = {1,8,3,0,-100,600,400};
		
		int max = Integer.MIN_VALUE;
		for(int i:x) {
			max = Math.max(max, i);
		}		
		System.out.println("max is "+max);
		
	}
	
	//@Test
	public void replace() {
		int number = 73;
		System.out.println(Integer.toBinaryString(number));
		System.out.println(Integer.toBinaryString((73>>>3)&1));
		
//		int mask = (1<<3 )| (1<<5);
//		System.out.println("mask: "+Integer.toBinaryString(mask));
//		System.out.println("res: "+Integer.toBinaryString(number ^ mask));
	}
	
	//@Test
	public void minMax() {
		System.out.println("max");
		System.out.println(Float.MAX_VALUE);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Byte.MAX_VALUE);
		
		System.out.println("min");
		System.out.println(Float.MIN_VALUE);
		System.out.println(Double.MIN_VALUE);
		System.out.println(Short.MIN_VALUE);
		System.out.println(Byte.MIN_VALUE);

		
	}
	
	@Test
	public void mathFunctions() {
		System.out.println(Math.pow(2, 3));
		System.out.println(Math.sqrt(16));
		System.out.println(Math.min(12, 4));
	}
}