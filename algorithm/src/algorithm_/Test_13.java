package algorithm_;

import java.util.Scanner;


// Java - 자바 알고리즘 문제풀이 (9) 숫자만 추출

public class Test_13 {

	public static void main(String[] args) {
		// 숫자 문자 제거 g0en2T0s8eSoft
		
		System.out.println("문자열 입력");
		Scanner sc = new Scanner(System.in);
		
		String answer = sc.nextLine();
		
		answer = answer.replaceAll("[^0-9]", "");
		
		int num= Integer.parseInt(answer);
		
		System.out.println(num);
		


		}	
}
