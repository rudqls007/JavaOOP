package algorithm;

import java.util.Scanner;

public class test55 {
	public static void main(String[] args) {
//		������ �Ҽ�
//		N���� �ڿ����� �ԷµǸ� �� �ڿ����� ������ �� �� ������ ���� �Ҽ��̸� �� �Ҽ��� �����
//		�� ���α׷��� �ۼ��ϼ���. ���� ��� 32�� �������� 23�̰�, 23�� �Ҽ��̴�. �׷��� 23�� ��
//		���Ѵ�. �� 910�� �������� 19�� ����ȭ �ؾ� �Ѵ�. ù �ڸ������� ���ӵ� 0�� �����Ѵ�.
//		�� �Է¼���
//		ù �ٿ� �ڿ����� ���� N(3<=N<=100)�� �־�����, �� ���� �ٿ� N���� �ڿ����� �־�����.
//		�� �ڿ����� ũ��� 100,000�� ���� �ʴ´�.
//		�� ��¼���
//		ù �ٿ� ������ �Ҽ��� ����մϴ�. ��¼����� �Էµ� ������� ����մϴ�.
//		�� �Է¿��� 1 
//		9
//		32 55 62 20 250 370 200 30 100
//		�� ��¿��� 1
//		23 2 73 2 3

		Scanner sc = new Scanner(System.in);
		System.out.println("�Ҽ�������");
		int n = sc.nextInt();
		String s;
		String result = "";
		StringBuilder build = new StringBuilder();

		for (int i = 0; i < n; i++) {
			
			s = build.append(sc.next()).reverse().toString();
			int num = Integer.parseInt(s);
			
			int count = 0;
			
			for (int j = 1; j <= num; j++) {
				if (num % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				result += num + " ";
			}
			build.setLength(0); //�ʱ�ȭ } System.out.println(result);
		}
		System.out.println(result);
		
	}
}
