package cp4.linkedlist;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class PhoneSimulate {

	String[] numberMap={"0","1","ABC","DEF","GHI", "JKL", "MNO", "PQRS","TUV","WXYZ"};
	
	//[1PA100T, 1PA100U, 1PA100V, 1PB100T, 1PB100U, 1PB100V, 1PC100T, 1PC100U, 1PC100V, 1QA100T, 1QA100U, 1QA100V, 1QB100T, 1QB100U, 1QB100V, 1QC100T, 1QC100U, 1QC100V, 1RA100T, 1RA100U, 1RA100V, 1RB100T, 1RB100U, 1RB100V, 1RC100T, 1RC100U, 1RC100V, 1SA100T, 1SA100U, 1SA100V, 1SB100T, 1SB100U, 1SB100V, 1SC100T, 1SC100U, 1SC100V]
	//@Test //time 7^n
	public void test_number(){
		String number = "1721008";
		int oneth = number.charAt(0)-'0';
		int twoth = number.charAt(1)-'0';
		int threeth = number.charAt(2)-'0';
		int fourth = number.charAt(3)-'0';
		int fiveth = number.charAt(4)-'0';
		int sixth = number.charAt(5)-'0';
		int seventh = number.charAt(6)-'0';

		List<String> words = new ArrayList<>();
		
		for (Character a: numberMap[oneth].toCharArray()) {
			for (Character b: numberMap[twoth].toCharArray()) {
				for (Character c: numberMap[threeth].toCharArray()) {
					for (Character d: numberMap[fourth].toCharArray()) {
						for (Character e: numberMap[fiveth].toCharArray()) {
							for (Character f: numberMap[sixth].toCharArray()) {
								for (Character g: numberMap[seventh].toCharArray()) {
									char[] word = {a,b,c,d,e,f,g};
									words.add(new String(word));
								}
							}
						}
					}
				}
			}
		}
		
		for(String word:words){
			System.out.println(word);
		}
	}
	
	
	//[1PA100T, 1PA100U, 1PA100V, 1PB100T, 1PB100U, 1PB100V, 1PC100T, 1PC100U, 1PC100V, 1QA100T, 1QA100U, 1QA100V, 1QB100T, 1QB100U, 1QB100V, 1QC100T, 1QC100U, 1QC100V, 1RA100T, 1RA100U, 1RA100V, 1RB100T, 1RB100U, 1RB100V, 1RC100T, 1RC100U, 1RC100V, 1SA100T, 1SA100U, 1SA100V, 1SB100T, 1SB100U, 1SB100V, 1SC100T, 1SC100U, 1SC100V]

	@Test
	public void printWords(){
		String number = "1721008";
		char[] temp = new char[number.length()];
		int index = 0;
		List<String> words = new ArrayList<>();
		
		findHelper(number,temp,index,words);
		
		for(String word:words){
			System.out.println(word);
		}
	}


	private void findHelper(String number, char[] temp, int index, List<String> words) {
		if(index==number.length()){
			words.add(new String(temp));
		}else{
			int n = number.charAt(index)-'0';
			for(Character c: numberMap[n].toCharArray()){
				temp[index]=c;
				
				findHelper(number,temp,index+1,words);
			}
		}
		
	}
}