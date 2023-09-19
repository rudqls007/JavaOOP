package algorithm_;

import java.util.ArrayList;
import java.util.NavigableSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Test_37 {

	
//	K��° ū ��
//	������ 1���� 100������ �ڿ����� ���� N���� ī�带 ������ �ֽ��ϴ�. ���� ������ ī�尡 
//	������ ���� �� �ֽ��ϴ�. ������ �� �� 3���� �̾� �� ī�忡 ���� ���� ���� ���� ����Ϸ�
//	�� �մϴ�. 3���� ���� �� �ִ� ��� ��츦 ����մϴ�. ����� �� �� K��°�� ū ���� ���
//	�ϴ� ���α׷��� �ۼ��ϼ���.
//	���� ū ������ ������� ���� 25 25 23 23 22 20 19......�̰� K���� 3�̶�� K��° ū ��
//	�� 22�Դϴ�.
//	�� �Է¼���
//	ù �ٿ� �ڿ��� N(3<=N<=100)�� K(1<=K<=50) �Էµǰ�, �� ���� �ٿ� N���� ī�尪�� �Է�
//	�ȴ�.
//	�� ��¼���
//	ù �ٿ� K��° ���� ����մϴ�. K��° ���� �������� ������ -1�� ����մϴ�.
//	�� �Է¿��� 1 
//	10 3
//	13 15 34 23 45 65 33 11 26 42
//	�� ��¿��� 1
//	143	

		
	static int sol(int ranCount, int numberCont) {
		
		ArrayList<Integer> al = new ArrayList<Integer>(); // �������� & ���� �� ����ִ� ArrayList
		TreeSet<Integer> treeSet = new TreeSet<>(); // ���� �� �ߺ� ���ſ� 

		try {
			for (int i = 0; i < ranCount; i++) {
				al.add((int)(Math.random() * 100) + 1); // �Է��� ������ŭ 1~100������ ������ ���� �ڵ���ġ
			}

			System.out.println(al);

			for (int i = 0; i < al.size(); i++) {
				for (int j = 0; j < al.size(); j++) {
					for (int k = 0; k < al.size(); k++) {
						treeSet.add(al.get(i) + al.get(j) + al.get(k)); // 3�� for������ 3���� ��� ����� �� ���ϰ� �� ������

					}
				}
			}

			al.clear(); // ArrayList ��Ȱ�� 
			NavigableSet<Integer> decendingSet = treeSet.descendingSet(); // ������������ Set ����
			al.addAll(decendingSet); // ArrayList�� ��� �ֱ� 

			System.out.println(al);

		} catch (Exception e) { // �ش�Ǵ� ���� ������ ����ó�� ���� , -1 ��ȯ 
			return -1;
		}

		return al.get(numberCont - 1); // ����ڰ� 3�� �Է��ϸ� �ε��� ��ȣ�δ� 2�� �ش� , ���� -1 

	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int ranCount = sc.nextInt();
		int numberCont = sc.nextInt();

		System.out.println(sol(ranCount, numberCont));
	}

}



