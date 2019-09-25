package cp2.arrays;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.Test;

public class Ex7_multiplyTwoNumbers {

	
	//@Test
	public void verifyResult() {
		int b[] = {-7,6,1,8,3,8, 2,5,7, 2,8, 7};
		
		//assertArrayEquals(b, mul(1,b));
		assertArrayEquals(new int[] {-1,5,2,3,6,7,6,5,1,4,5,7,4}, mul(2,b));
	}
	
	@Test
	public void verifyResult2() {
		int a[] = {1,9,3, 7,0,7, 7, 2,1};
		int b[] = {-7,6,1,8,3,8, 2,5,7, 2,8, 7};
		
		//assertArrayEquals(b, mul(1,b));
		assertArrayEquals(new int[] {-1,4, 7,5,7,3, 9,5, 2,5,8, 9,6, 7,6, 4,1, 2, 9, 2,7}, mul(a,b));
	}

	public int[] mul(int[] a, int[] b) {
		int[]min=a.length<b.length?a:b;
		int[]max=a.length>b.length?a:b;
		int[][]sumArray = new int[min.length][min.length+max.length];
		
		int k = 0;
		for(int i: min) {
			sumArray[k++]=mul(i,max);
		}
		
		
		int result[] = new int[sumArray.length+1];
		k=result.length-1;
		
		int r=0;
		int numberOfNegative=0;;
		for(int i=sumArray.length-1;i>=0;i--) {
			int sum=0;
			for(int j=0;j<sumArray.length;j++) {
				sum+=Math.abs(sumArray[j][i]);
				if(i==0 && sumArray[j][i]<0) {
					numberOfNegative++;
				}
			}
			result[k--]=sum%10+r;
			r=sum/10;
		}
		
		if(numberOfNegative%2==1) {
			result[0]=result[0]*-1;
		}
		return result;
	}

	public int[] mul(int i, int[] max) {
		int[] result = new int[max.length+1];
		int index = result.length-1;
		
		int rm = 0, dr=0; 
		boolean isNegative = max[0]<0;
		for(int j=max.length-1;j>=0;j--) {
			int mr = Math.abs(i*max[j])+dr;
			rm = mr%10;
			result[index--]=rm;
			dr = mr/10;
		}
		if(dr>0) {
			if(isNegative) {
				result[0]=-dr;
			}else {
				result[0]=dr;
			}
		}
		
		if(result[0]==0) {
			return Arrays.copyOfRange(result, 1, result.length);
		}else {
			return result;
		}		
	}
}