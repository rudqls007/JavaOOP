package algorithm_;

import java.util.Scanner;


// Java - �ڹ� �˰��� ����Ǯ�� (29) ���ӵ� �ڿ����� ��
// https://blog.naver.com/hansoo0724/222659207337 - Ǯ��
public class Test_29 {
	
//	���ӵ� �ڿ����� ��
//	N�Է����� ���� ���� N�� �ԷµǸ� 2�� �̻��� ���ӵ� �ڿ����� ������ ���� N�� ǥ���ϴ� 
//	����� �������� ����ϴ� ���α׷��� �ۼ��ϼ���.
//	���� N=15�̸� 
//	7+8=15
//	4+5+6=15
//	1+2+3+4+5=15
//	�� ���� �� 3������ ��찡 �����Ѵ�.
//	�� �Է¼���
//	ù ��° �ٿ� ���� ���� N(7<=N<1000)�� �־����ϴ�.
//	�� ��¼���
//	ù �ٿ� �� ������ ����մϴ�.
//	�� �Է¿��� 1 
//	15
//	�� ��¿��� 1
//	3

	public static String numPlus(int num) {
		int cnt = 0;
		int sum = 0;

		for (int i = 1; i <= num; i++) {
			System.out.println("==============");
			for (int j = i; j < num; j++) { // ���� for���� j�� num�� ������ ��ŭ �ݺ��ϸ� �ڱ� �ڽ��� �ջ꿡 ����
											// �׷� ��� �����ؼ� �������� �ƴϴ��� ī��Ʈ�� �ϰԵ�
											// ���� ���� for���� num�� �������� ������ ���� , �ݺ��ϰ� �Ѵ�
				sum = sum + j;
				
				// Ȯ�ο� if��
				if(sum!=num) {
				System.out.println("�ش���� ����:"+sum);
				}
				
				if (sum == num) {
					System.out.println("*�����ؼ� ���Ѱ��� ���ǹ��� �ش�*:" + sum);
					cnt++;
				}

			}
			sum = 0;
		}

		return "�����ؼ� ���Ѱ� ī��Ʈ:" + cnt;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.print(numPlus(num));

	}

}

