package algorithm_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


// Java - �ڹ� �˰��� ����Ǯ�� (28) ���� �κм���


public class Test_44 {

	
//	���� �κм���
//	N���� ���� �̷���� ������ �־����ϴ�.
//	�� �������� ���Ӻκм����� ���� Ư������ M�� �Ǵ� ��찡 �� �� �ִ��� ���ϴ� ���α׷��� 
//	�ۼ��ϼ���.
//	���� N=8, M=6�̰� ������ ������ ���ٸ�
//	1 2 1 3 1 1 1 2 
//	���� 6�� �Ǵ� ���Ӻκм����� {2, 1, 3}, {1, 3, 1, 1}, {3, 1, 1, 1}�� �� 3�����Դϴ�.
//	�� �Է¼���
//	ù° �ٿ� N(1��N��100,000), M(1��M��100,000,000)�� �־�����. 
//	������ ���Ұ��� 1,000�� ���� �ʴ� �ڿ����̴�.
//	�� ��¼���
//	ù° �ٿ� ����� ���� ����Ѵ�.
//	�� �Է¿��� 1 
//	8 6
//	1 2 1 3 1 1 1 2
//	�� ��¿��� 1
//	3
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arrSize = sc.nextInt();
		int rightNum = sc.nextInt();
		
		int arr[] = new int[arrSize];
		ArrayList<Integer> al = new ArrayList<>();
		
		int sum = 0;

		for (int i = 0; i < arrSize; i++) {
			int userNum = sc.nextInt();
			arr[i] = userNum;
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				sum += arr[j];
				al.add(sum);
			}
			sum = 0;
		}

		System.out.println(al);

		int count = Collections.frequency(al, rightNum);
		System.out.println(count);
		al.clear();

	}



	
}
