package algorithm_;

import java.util.Scanner;


// Java - 자바 알고리즘 문제풀이 (42) - 교육과정 설계

public class Test_03 {

	public static String sol(String str, String string) {
		String YES = "YES";
		String NO = "NO";
		String answer = "";

		String[] strArr = str.split("");
		String[] stringArr = string.split("");

		for (int i = 0; i < stringArr.length; i++) {
			for (int j = 0; j < strArr.length; j++) {
				if (stringArr[i].equals(strArr[j])) {
					answer += stringArr[i];
				}
			}
		}
		 
		System.out.println(answer);

		if (str.equals(answer)) {
			return YES;

		} else {

			return NO;
		}

	}

	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String string = sc.nextLine();

		System.out.println(sol(str, string));

	}
	

	
}
