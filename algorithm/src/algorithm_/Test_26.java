package algorithm_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


// Java - �ڹ� �˰��� ����Ǯ�� (26)  �� �迭 ��ġ��
// https://blog.naver.com/hansoo0724/222654064881
public class Test_26 {

//	������� ���ϱ�
//	A, B �� ���� ������ �־����� �� ������ ���� ���Ҹ� �����Ͽ� ������������ ����ϴ� ����
//	�׷��� �ۼ��ϼ���.
//	�� �Է¼���
//	ù ��° �ٿ� ���� A�� ũ�� N(1<=N<=30,000)�� �־����ϴ�.
//	�� ��° �ٿ� N���� ���Ұ� �־����ϴ�. ���Ұ� �ߺ��Ǿ� �־����� �ʽ��ϴ�.
//	�� ��° �ٿ� ���� B�� ũ�� M(1<=M<=30,000)�� �־����ϴ�.
//	�� ��° �ٿ� M���� ���Ұ� �־����ϴ�. ���Ұ� �ߺ��Ǿ� �־����� �ʽ��ϴ�.
//	�� ������ ���Ҵ� 1,000,000,000������ �ڿ����Դϴ�.
//	�� ��¼���
//	�� ������ ������Ҹ� �������� �����Ͽ� ����մϴ�.
//	�� �Է¿��� 1 
//	5
//	1 3 9 5 2
//	5
//	3 2 5 7 8	
//	�� ��¿��� 1
//	2 3 5
	
	public static void main(String[] args) {
		List<Integer> al_a = new ArrayList<>();
		List<Integer> al_b = new ArrayList<>();
		List<Integer> al_c = new ArrayList<>();

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

			for (int i = 0; i < al_a.size(); i++) {
				for (int j = 0; j < al_b.size(); j++) {
					if (al_a.get(i) == al_b.get(j)) {
						al_c.add(al_a.get(i));

					}

				}
			}
			
			Collections.sort(al_c);
			System.out.println(al_c);
		}
	}

}

