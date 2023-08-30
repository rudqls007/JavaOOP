package algorithm_;

import java.util.HashSet;
import java.util.Scanner;


// Java - 자바 알고리즘 문제풀이 (6) 중복문자 제거

public class Test_10 {

	// 문자열 중복제거
	// a부터 정렬이 되는 문제 발생

	public static void main(String[] args) {
		// 스캐너 준비 , 입력
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		// 중복문자 제거위한 Set 선언
		HashSet<String> al = new HashSet<>();

		// 문자열을 문자로 자르기
		int arrNum = 1;
		for (int i = 0; i < str.length(); i++) {
			al.add(str.substring(i, arrNum));
			arrNum++;
		}

		// 중복된 문자 향상된 for문으로 출력
		for (String list : al) {
			System.out.print(list);
		}
	}
}
