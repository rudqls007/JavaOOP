package algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TEST_11 {
		public static void main(String[] args) {
			
			// ���ڿ� ���� KKHSSSSSSSE
			
			ArrayList<String> al = new ArrayList<>();
			
			Scanner sc = new Scanner(System.in);
			String answer = sc.nextLine();
			
			int arrNum = 1;
			for (int i = 0; i < answer.length(); i++) {
				al.add(answer.substring(i, arrNum));	
				arrNum++;	
			}
			
			Set<String> alSet = new HashSet<String>(al); // set �÷��������� ��ũ
			
			for (String str : alSet) {
				
				int num = Collections.frequency(al, str); // �÷��� �ȿ��� ��ü�� �� �� �����ߴ��� �˷��ִ� �޼ҵ�
														  // ������ ������ ����
				
				if (num == 1) {
					System.out.print(str);
				} else {
					System.out.print(str + num);
				}

				}				
		}	
	}
