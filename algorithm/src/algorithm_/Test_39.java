package algorithm_;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Test_39 {

	
//	������� ����
//	������ �ƺ��� �������� ��մϴ�. �����ƺ��� �������� N�� ������ �������� �ְ� ����
//	�� K�� ������ ������� ������ �� �������� ���϶�� �߽��ϴ�.
//	���� N=7�̰� 7�� ���� �������� �Ʒ��� ����, �̶� K=4�̸� 
//	20 12 20 10 23 17 10
//	�� ���� 4�ϰ��� ������ ���������� 
//	ù ��° ������ [20, 12, 20, 10]�� ������� ������ 20, 12, 10���� 3�̴�.
//	�� ��° ������ [12, 20, 10, 23]�� ������� ������ 4�̴�.
//	�� ��° ������ [20, 10, 23, 17]�� ������� ������ 4�̴�.
//	�� ��° ������ [10, 23, 17, 10]�� ������� ������ 3�̴�.
//	N�ϰ��� �����ϰ� ���ӱ����� ���� K�� �־����� ù ��° �������� �� ������ ������� ��
//	���� ����ϴ� ���α׷��� �ۼ��ϼ���.
//	�� �Է¼���
//	ù �ٿ� N(5<=N<=100,000)�� K(2<=K<=N)�� �־����ϴ�.
//	�� ��° �ٿ� N���� ���ڿ��� �־����ϴ�. �� ���ڴ� 500������ ���� �ƴ� �����Դϴ�.
//	�� ��¼���
//	ù �ٿ� �� ������ ����� ������ ������� ����մϴ�.
//	�� �Է¿��� 1 
//	7 4
//	20 12 20 10 23 17 10
//	�� ��¿��� 1
//	3 4 4 3
	public static ArrayList<Integer> sol(int day, int plusDay, ArrayList<Integer> al) {
		ArrayList<Integer> count = new ArrayList<>();
		Set<Integer> set = new HashSet<Integer>();
		

		for (int i = 0; i < day; i++) {

			for (int j = i; j < plusDay + i; j++) {

				if (j < al.size()) {
					set.add(al.get(j));
					System.out.println(set);
				}

			}

			count.add(set.size());
			set.clear();
			System.out.println("------------");

			if (i == plusDay - 1) {
			// 4�� ������ ī��Ʈ�� ������ �ݺ��� ����
				break;
			}
		}

		
		return count;
	}


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int day = sc.nextInt();
		int plusDay = sc.nextInt();
		ArrayList<Integer> al = new ArrayList<Integer>();

		for (int i = 0; i < day; i++) {
			int sel = sc.nextInt();
			al.add(sel);
		}

		System.out.println(sol(day, plusDay, al));

	}
	

}


