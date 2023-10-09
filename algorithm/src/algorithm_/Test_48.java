package algorithm_;

import java.util.Scanner;


// Java - �ڹ� �˰��� ����Ǯ�� (21) ������ �ִ���

public class Test_48 {

	
//	N*N�� �������� �־����� �� ���� ��, �� ���� ��, �� �밢���� �� �� �� �� ū ���� �����
//	�ϴ�.
//	�� �Է¼���
//	ù �ٿ� �ڿ��� N�� �־�����.(2<=N<=50) 
//	�� ��° �ٺ��� N�ٿ� ���� �� �ٿ� N���� �ڿ����� �־�����. �� �ڿ����� 100�� ���� �ʴ�
//	��. 
//	�� ��¼���
//	�ִ����� ����մϴ�.
//	�� �Է¿��� 1 
//	5
//	10 13 10 12 15
//	12 39 30 23 11
//	11 25 50 53 15
//	19 27 29 37 27
//	19 13 30 13 19
	
//	�� ��¿��� 1
//	155

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int result = 0;
		int sizeNum = sc.nextInt();

		int[][] arr = new int[sizeNum][sizeNum];

		for (int i = 0; i < sizeNum; i++) {
			for (int j = 0; j < sizeNum; j++) {

				arr[i][j] = sc.nextInt();

			}
		}
		
	
	
		
		for (int i = 0; i < sizeNum; i++) {
			int garo = 0;
			int sero = 0;
			for (int j = 0; j < sizeNum; j++) {
				garo += arr[i][j]; // ���� ���� ����
				sero += arr[j][i]; // ���� ���� ����
			}

			result = Math.max(result, garo); // ���� �� �����ѰͰ� result ���Ͽ� �� ū�� result�� �Ҵ�
			result = Math.max(result, sero); // ���� �� �����ѰͰ� result ���Ͽ� �� ū�� result�� �Ҵ�
		}
		
		int left_daeGak = 0;
		int right_daeGak = 0;
		
		for (int i = 0; i < sizeNum; i++) {
			left_daeGak += arr[i][i]; //���� �� �𼭸����� ������ �Ʒ� �𼭸����� ����(�밢��)
			right_daeGak += arr[ i ][sizeNum - i - 1]; //������ �� �𼭸����� ���� �Ʒ� �𼭸����� ����(�밢��)
		}
		
		result = Math.max(result, left_daeGak); // ���� �� �����ѰͰ� result ���Ͽ� �� ū�� result�� �Ҵ�
		result = Math.max(result, right_daeGak); // ���� �� �����ѰͰ� result ���Ͽ� �� ū�� result�� �Ҵ�
		
		System.out.println(result);
	}

}


	
