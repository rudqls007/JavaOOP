package algorithm_;

import java.util.ArrayList;
import java.util.Scanner;


// Java - 자바 알고리즘 문제풀이 (7) 회문문자열

public class Test_11 {

	
	public static void main(String[] args) {
		// 회문문자열 ( 앞단어와 끝단어가 같을 경우 Yes , 아닐경우 No)
		
		// ArrayList의 담긴 값의 순서를 나타내는 변수 , 반복문 사용
		int i = 0;
		
		
		while (true) {
			// 단어입력
			Scanner sc = new Scanner(System.in);
			String str = sc.nextLine();
			
			// 대소문자 영향을 받지 않기 위한 메소드 작성
			String s = str.toUpperCase();
			
			//ArrayList 선언
			ArrayList<String> al = new ArrayList<>();
			
			//문자열 잘라서 ArrayList안에 넣기
			int arrNum = 1;
			for (i = 0; i < s.length(); i++) {
				al.add(s.substring(i, arrNum));
				arrNum++;
			}
			
				// 잘라서 담긴 갚의 시작과 끝을 비교 , 같을 경우 Yes
				if ((al.get(0).equals(al.get(i-1)))) {
					System.out.println("Yes");
					break;
					
				// 다를 경우 No
				} else {
					System.out.println("NO");
					break;
				

			}
							
		}
		
	}


}
