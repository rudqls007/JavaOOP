package algorithm_;

import java.util.ArrayList;
import java.util.Collections;

import java.util.List;
import java.util.Scanner;


//  �ڹ� �˰��� ����Ǯ�� (25)  �ι迭 ��ġ�� 2
public class Test_25 {
	
//	�� �迭 ��ġ��
//	������������ ������ �� �� �迭�� �־����� �� �迭�� ������������ ���� ����ϴ� ���α׷�
//	�� �ۼ��ϼ���.
//	�� �Է¼���
//	ù ��° �ٿ� ù ��° �迭�� ũ�� N(1<=N<=100)�� �־����ϴ�.
//	�� ��° �ٿ� N���� �迭 ���Ұ� ������������ �־����ϴ�. 
//	�� ��° �ٿ� �� ��° �迭�� ũ�� M(1<=M<=100)�� �־����ϴ�.
//	�� ��° �ٿ� M���� �迭 ���Ұ� ������������ �־����ϴ�. 
//	�� ����Ʈ�� ���Ҵ� int�� ������ ũ�⸦ ���� �ʽ��ϴ�.
//	�� ��¼���
//	������������ ���ĵ� �迭�� ����մϴ�.
//	�� �Է¿��� 1 
//	3
//	1 3 5
//	5
//	2 3 6 7 9
//	�� ��¿��� 1
//	1 2 3 3 5 6 7 9
	
	public static void main(String[] args) {
		List<Integer> al_a = new ArrayList<>();
		List<Integer> al_b = new ArrayList<>();

		while (true) {
			Scanner sc = new Scanner(System.in);
			int count = sc.nextInt();

			for (int i = 0; i < count; i++) {
				int plusAl = sc.nextInt();
				al_a.add(plusAl);
			}

			int count2 = sc.nextInt();

			for (int i = 0; i < count2; i++) {
				int plusAl = sc.nextInt();
				al_b.add(plusAl);
			}

			al_a.addAll(al_b);

			Collections.sort(al_a); // �������� ����

			System.out.println(al_a);
			
		}

	}

}

