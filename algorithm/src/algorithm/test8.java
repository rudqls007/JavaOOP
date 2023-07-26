package algorithm;

import java.util.Scanner;

public class test8 {
	
	public static void main(String[] args) {
		// 유효한 팰린드롬
		// found7, time: study; Yduts; emit, 7Dnuof
	
		Scanner sc = new Scanner(System.in); 
		String str = sc.nextLine(); // 문자열 입력
		
		str=str.toUpperCase().replaceAll("[^A-Z]", ""); // 입력받은 문자를 대문자로 일치
													    // replaceAll과 정규식을 통해 통해 입력받은 모든문자 대문자 변경
														// ^A-Z , 대문자 영어 제외한 숫자, 특수기호 제거 
	
		System.out.println(str); // 입력값 확인
		
		String answer=new StringBuilder(str).reverse().toString();
		// 입력받은 str을 StringBuilder로 선언 , 그리고 reverse로 뒤집어 주기
		
		System.out.println(answer); // StringBuilder 선언 값 확인 
		
		if(str.equals(answer)) { // 입력값과 StringBuilder 선언한 값이 맞을 경우 참
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		
		
	}

}

