package algorithm_;

import java.util.HashSet;
import java.util.Scanner;


// Java - �ڹ� �˰��� ����Ǯ�� (6) �ߺ����� ����

public class Test_10 {

	// ���ڿ� �ߺ�����
	// a���� ������ �Ǵ� ���� �߻�

	public static void main(String[] args) {
		// ��ĳ�� �غ� , �Է�
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		// �ߺ����� �������� Set ����
		HashSet<String> al = new HashSet<>();

		// ���ڿ��� ���ڷ� �ڸ���
		int arrNum = 1;
		for (int i = 0; i < str.length(); i++) {
			al.add(str.substring(i, arrNum));
			arrNum++;
		}

		// �ߺ��� ���� ���� for������ ���
		for (String list : al) {
			System.out.print(list);
		}
	}
}
