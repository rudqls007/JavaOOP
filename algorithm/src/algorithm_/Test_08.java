package algorithm_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


// Java - 자바 알고리즘 문제풀이 (4) 단어뒤집기

public class Test_08 {

	
	public static void main(String[] args) {
		// 문자열 뒤집기
		
		// 입력받을 Scanner
		Scanner sc = new Scanner(System.in);
		ArrayList<String> al = new ArrayList<>();
		ArrayList<String> al2 = new ArrayList<>();
		
		// 입력횟수 반복문
		int j = 0;
		
		while (true) {

			// 입력횟수
			System.out.println("횟수입력>>");
			int num = sc.nextInt();
			sc.nextLine();
			
			// 입력횟수만큼 반복
			for (j = 0; j <=num-1; j++) {
				System.out.println("문장입력>>");
				String str = sc.nextLine();
				
				// 출력될 문자의 띄어쓰기를 위한 값 대입
				al.add(" ");
				
				// ArrayList에 값 대입
				int arrNum = 1;
				for (int i = 0; i < str.length(); i++) {
					al.add(str.substring(i, arrNum));
					arrNum++;
				}
				
				// Collections.reverse() 메소드를 사용해 ArrayList 뒤집기
				Collections.reverse(al);
				
				// 향상된 for문으로
				for (String list : al) {
					// 잘라진 문자를 문장의 형태로 값넣기
					al2.add(list);
					
					// 입력이 종료되면 뒤집어진 문자 출력
					if (j == num-1) {
					System.out.print(list);
					System.out.println();
					}
				}
				
				
				
			}

		}
	}

}


