package algorithm_;

import java.util.Scanner;

// Java - �ڹ� �˰��� ����Ǯ�� (2) ��ҹ��� ��ȯ 

public class Test_05 {

	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input = sc.next();

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			
			if (Character.isLowerCase(ch)) {
				ch = Character.toUpperCase(ch);
			} else {
				ch = Character.toLowerCase(ch);
			}
			System.out.print(ch);
		}

	}
}
