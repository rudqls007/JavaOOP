package algorithm_;

import java.util.Scanner;


//Java - �ڹ� �˰��� ����Ǯ�� (3) ����� �ܾ� 

public class Test_06 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;	
		int length = 0;
	
		
		System.out.print("���� �Է�>>");
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
