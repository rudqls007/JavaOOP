package algorithm_;

import java.util.Scanner;


//Java - 자바 알고리즘 문제풀이 (3) 문장속 단어 

public class Test_06 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;	
		int length = 0;
	
		
		System.out.print("문장 입력>>");
		String answer = sc.nextLine();

		String[] arr = answer.split(" ");

		for (i = 0; i < arr.length; i++) {
			
			if (length < arr[i].length()) {
				length = arr[i].length();
				i = length;
			}
		}
		System.out.println(arr[i-1]);
	}


}
