package algorithm_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


// Java - �ڹ� �˰��� ����Ǯ�� (4) �ܾ������

public class Test_08 {

	
	public static void main(String[] args) {
		// ���ڿ� ������
		
		// �Է¹��� Scanner
		Scanner sc = new Scanner(System.in);
		ArrayList<String> al = new ArrayList<>();
		ArrayList<String> al2 = new ArrayList<>();
		
		// �Է�Ƚ�� �ݺ���
		int j = 0;
		
		while (true) {

			// �Է�Ƚ��
			System.out.println("Ƚ���Է�>>");
			int num = sc.nextInt();
			sc.nextLine();
			
			// �Է�Ƚ����ŭ �ݺ�
			for (j = 0; j <=num-1; j++) {
				System.out.println("�����Է�>>");
				String str = sc.nextLine();
				
				// ��µ� ������ ���⸦ ���� �� ����
				al.add(" ");
				
				// ArrayList�� �� ����
				int arrNum = 1;
				for (int i = 0; i < str.length(); i++) {
					al.add(str.substring(i, arrNum));
					arrNum++;
				}
				
				// Collections.reverse() �޼ҵ带 ����� ArrayList ������
				Collections.reverse(al);
				
				// ���� for������
				for (String list : al) {
					// �߶��� ���ڸ� ������ ���·� ���ֱ�
					al2.add(list);
					
					// �Է��� ����Ǹ� �������� ���� ���
					if (j == num-1) {
					System.out.print(list);
					System.out.println();
					}
				}
				
				
				
			}

		}
	}

}


