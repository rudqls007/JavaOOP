package algorithm_;

import java.util.Scanner;


// Java - �ڹ� �˰��� ����Ǯ�� (9) ���ڸ� ����

public class Test_13 {

	public static void main(String[] args) {
		// ���� ���� ���� g0en2T0s8eSoft
		
		System.out.println("���ڿ� �Է�");
		Scanner sc = new Scanner(System.in);
		
		String answer = sc.nextLine();
		
		answer = answer.replaceAll("[^0-9]", "");
		
		int num= Integer.parseInt(answer);
		
		System.out.println(num);
		


		}	
}
