package algorithm;

import java.util.Scanner;

public class test_13 {

	
public static void main(String[] args) {
	// 특정문자 빼고 뒤집기

	  Scanner sc=new Scanner(System.in);
	    
	    String answer = sc.next();
	    
	    // 단어를 잘라서 배열에 넣기
	    char[] arr = answer.toCharArray();
	    
	    int up = 0;
	    int dw = arr.length-1;
	    
		while (up < dw) {
			char upper = arr[up];
			char downer = arr[dw];
			
			// 문자가 소문자인지
			if (!Character.isAlphabetic(upper)) {
				up++;
				
				// 문자가 대문자인지
			} else if (!Character.isAlphabetic(downer)) {
				dw--;
				
			} else {
				// 알파벳일때 교환
				char tmp = arr[up];
				arr[up] = arr[dw];
				arr[dw] = tmp;
				up++;
				dw--;
			}
		}

		// char[]을 String 으로
		String change = String.valueOf(arr);
		System.out.println(change);

	}

}

