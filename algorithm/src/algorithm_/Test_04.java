package algorithm_;

import java.util.ArrayList;
import java.util.Scanner;


// Java - �ڹ� �˰��� ����Ǯ�� (1) ����ã��

public class Test_04 {

	public static void main(String[] args) {

		while (true) {
			Scanner sc = new Scanner(System.in);
			
			String str = sc.nextLine();
			String ch = sc.next();
			int count = 0;

			String s = str.toUpperCase();
			String c = ch.toUpperCase();

			ArrayList<String> al = new ArrayList<>();
			int arrNum = 1;
			for (int i = 0; i < s.length(); i++) {
				al.add(s.substring(i, arrNum));	
				arrNum++;
			}
//			System.out.println(al); // ���ڿ��� �߶� ArrayList�� ����

			for (int i = 0; i < s.length(); i++) {
				if (al.get(i).equals(c)) {
					count++;
				}
			}
			System.out.println("�´°���:" + count);
		}
  }
	
}
