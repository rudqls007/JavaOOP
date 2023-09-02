package algorithm_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


// Java - 자바 알고리즘 문제풀이 (4) 단어뒤집기


public class Test_07 {

	
	public static void main(String[] args) {
		// 문자열 뒤집기

		// 입력받을 Scanner
		Scanner sc = new Scanner(System.in);
		while (true) {

			// 입력횟수
			System.out.println("횟수입력>>");
			int num = sc.nextInt();

			sc.nextLine();
			// 입력횟수만큼 반복
			for (int j = 0; j <= num; j++) {
				System.out.println("문장입력>>");
				String str = sc.nextLine();

				// ArrayList 선언
				ArrayList<String> al = new ArrayList<>();

				// ArrayList에 값 대입
				int arrNum = 1;
				for (int i = 0; i < str.length(); i++) {
					al.add(str.substring(i, arrNum));
					arrNum++;
				}

				// Collections.reverse() 메소드를 사용해 ArrayList 뒤집기
				Collections.reverse(al);
				// 향상된 for문
				for (String list : al) {
					System.out.print("뒤집힌 문장:" + list);

				}
			}

		}
	}


}
