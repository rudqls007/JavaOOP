package algorithm_;

import java.util.ArrayList;
import java.util.Scanner;


// Java - �ڹ� �˰��� ����Ǯ�� (13) ū �� ����ϱ�

public class Test_15 {

	public static void main(String[] args) {

		// 6 7 3 9 5 6 12 / 7 9 6 12 
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>(); // �񱳿� ArrayList
		ArrayList<Integer> print = new ArrayList<>(); // �Է¿� ArrayList

		int i = 0; // ArrayList�� get(����)

		while (true) {

			int arrNum = sc.nextInt();
			al.add(arrNum); // ArrayList al �� �Է��� ���ڸ� ����

			if (arrNum > al.get(i)) { // �Է��� ���ڿ� al �迭�� ���ڸ� ��  
				print.add(arrNum); // �Է��� ������ �� Ŭ ��� ������� ArrayList�� �Է°��� ���� 
				System.out.println(print);
				i++; // �迭�� ������ �÷��� ���� ������ �迭�� ���ϱ� ���� �غ�
				
			} else if (arrNum < al.get(i)) {
				al.remove(i); // ���� �Էµ� ���ڰ� �迭�� ���ں��� �۴ٸ� �迭�� ���ڸ� ����
				
			}
		}
	}


}
