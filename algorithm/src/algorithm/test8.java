package algorithm;

import java.util.Scanner;

public class test8 {
	
	public static void main(String[] args) {
		// ��ȿ�� �Ӹ����
		// found7, time: study; Yduts; emit, 7Dnuof
	
		Scanner sc = new Scanner(System.in); 
		String str = sc.nextLine(); // ���ڿ� �Է�
		
		str=str.toUpperCase().replaceAll("[^A-Z]", ""); // �Է¹��� ���ڸ� �빮�ڷ� ��ġ
													    // replaceAll�� ���Խ��� ���� ���� �Է¹��� ��繮�� �빮�� ����
														// ^A-Z , �빮�� ���� ������ ����, Ư����ȣ ���� 
	
		System.out.println(str); // �Է°� Ȯ��
		
		String answer=new StringBuilder(str).reverse().toString();
		// �Է¹��� str�� StringBuilder�� ���� , �׸��� reverse�� ������ �ֱ�
		
		System.out.println(answer); // StringBuilder ���� �� Ȯ�� 
		
		if(str.equals(answer)) { // �Է°��� StringBuilder ������ ���� ���� ��� ��
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		
		
	}

}

