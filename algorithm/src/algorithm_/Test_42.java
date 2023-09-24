package algorithm_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


// Java - �ڹ� �˰��� ����Ǯ�� (30) �ִ� ���� ���Ӻκм��� ( ������ �ٸ� ���� )


public class Test_42 {

	
	
//	�ִ� ���� ���Ӻκм���
//	0�� 1�� ������ ���̰� N�� ������ �־����ϴ�. �������� �� �������� �ִ� k���� 0�� 1�� ��
//	���� �� �ֽ��ϴ�. �������� �ִ� k���� ������ ���� �� �������� 1�θ� ������ �ִ� ������ 
//	���Ӻκм����� ã�� ���α׷��� �ۼ��ϼ���.
//	���� ���̰� ���̰� 14�� ������ ���� ������ �־����� k=2���
//	1 1 0 0 1 1 0 1 1 0 1 1 0 1
//	�������� ���� �� �ִ� 1�� ���ӵ� ���Ӻκм����� 1 1 0 0 1 1 1 1 1 1 1 1 0 1 �̸� �� 
//	���̴� 8�Դϴ�.
//	�� �Է¼���
//	ù ��° �ٿ� ������ ������ �ڿ��� N(5<=N<100,000)�� �־����ϴ�.
//	�� ��° �ٿ� N������ 0�� 1�� ������ ������ �־����ϴ�.
//	�� ��¼���
//	ù �ٿ� �ִ� ���̸� ����ϼ���.
//	�� �Է¿��� 1 
//	14 2
//	1 1 0 0 1 1 0 1 1 0 1 1 0 1
//	�� ��¿��� 1
//	8
	
	public static Integer sol(int num, int change) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		int[] numArr = new int[num];
		int changeNum = change;
		int count = 0;

		for (int i = 0; i < num; i++) {
			// ������� �Է��� �޴� ��� �������� ���ڸ� ����
			numArr[i] += ((int) (Math.random() * 2));

			// ���� if �� : 0�� ��� 1�� ����
			if (changeNum != 0) {
				if (numArr[i] == 0) {
					System.out.println("����");
					numArr[i] = 1;
					changeNum--;
				}
			}

			// if - else �� : ���ӵǴ� ���� ī��Ʈ , ���� ī��Ʈ ������ ���� �ʱ�ȭ
			if (numArr[i] == 1) {
				count++;
			} else {
				al.add(count);
				count = 0;
			}

			System.out.print("����� �迭:" + numArr[i] + " ");
			System.out.println("����Ƚ������:" + changeNum + " ");
		}

		System.out.println();
		System.out.println(al);

		return Collections.max(al);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int change = sc.nextInt();
		System.out.println(sol(num, change));

	}




}
