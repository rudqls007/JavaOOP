package algorithm_;

import java.util.ArrayList;
import java.util.Scanner;


// Java - �ڹ� �˰��� ����Ǯ�� (7) ȸ�����ڿ�

public class Test_11 {

	
	public static void main(String[] args) {
		// ȸ�����ڿ� ( �մܾ�� ���ܾ ���� ��� Yes , �ƴҰ�� No)
		
		// ArrayList�� ��� ���� ������ ��Ÿ���� ���� , �ݺ��� ���
		int i = 0;
		
		
		while (true) {
			// �ܾ��Է�
			Scanner sc = new Scanner(System.in);
			String str = sc.nextLine();
			
			// ��ҹ��� ������ ���� �ʱ� ���� �޼ҵ� �ۼ�
			String s = str.toUpperCase();
			
			//ArrayList ����
			ArrayList<String> al = new ArrayList<>();
			
			//���ڿ� �߶� ArrayList�ȿ� �ֱ�
			int arrNum = 1;
			for (i = 0; i < s.length(); i++) {
				al.add(s.substring(i, arrNum));
				arrNum++;
			}
			
				// �߶� ��� ���� ���۰� ���� �� , ���� ��� Yes
				if ((al.get(0).equals(al.get(i-1)))) {
					System.out.println("Yes");
					break;
					
				// �ٸ� ��� No
				} else {
					System.out.println("NO");
					break;
				

			}
							
		}
		
	}


}
