package algorithm_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


// Java - �ڹ� �˰��� ����Ǯ�� (4) �ܾ������


public class Test_07 {

	
	public static void main(String[] args) {
		// ���ڿ� ������

		// �Է¹��� Scanner
		Scanner sc = new Scanner(System.in);
		while (true) {

			// �Է�Ƚ��
			System.out.println("Ƚ���Է�>>");
			int num = sc.nextInt();

			sc.nextLine();
			// �Է�Ƚ����ŭ �ݺ�
			for (int j = 0; j <= num; j++) {
				System.out.println("�����Է�>>");
				String str = sc.nextLine();

				// ArrayList ����
				ArrayList<String> al = new ArrayList<>();

				// ArrayList�� �� ����
				int arrNum = 1;
				for (int i = 0; i < str.length(); i++) {
					al.add(str.substring(i, arrNum));
					arrNum++;
				}

				// Collections.reverse() �޼ҵ带 ����� ArrayList ������
				Collections.reverse(al);
				// ���� for��
				for (String list : al) {
					System.out.print("������ ����:" + list);

				}
			}

		}
	}


}
