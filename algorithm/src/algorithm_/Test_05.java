package algorithm_;

import java.util.Scanner;

// Java - 자바 알고리즘 문제풀이 (2) 대소문자 변환 

public class Test_05 {

	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input = sc.next();

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			
			if (Character.isLowerCase(ch)) {
				ch = Character.toUpperCase(ch);
			} else {
				ch = Character.toLowerCase(ch);
			}
			System.out.print(ch);
		}

	}
}
