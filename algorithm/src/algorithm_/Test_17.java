package algorithm_;

import java.util.ArrayList;
import java.util.Scanner;


// Java - �ڹ� �˰��� ����Ǯ�� (15) ���� ���� ��

public class Test_17 {
		public static void main(String[] args) {
//	  	1:����, 2:����, 3:��
//			5
//			2 3 3 1 3
//			1 1 2 2 3
			
//			�� ��¿��� 
//			A
//			B
//			A
//			B
//			D
			
			Scanner sc = new Scanner(System.in);
			ArrayList<Integer> userA = new ArrayList<>();
			ArrayList<Integer> userB = new ArrayList<>();
			ArrayList<String> print = new ArrayList<>();

			int i = 0;

			System.out.print("�ݺ�Ƚ��>>");
			int forNum = sc.nextInt();

			System.out.println("A");
			for (i = 0; i < forNum; i++) {
				int userPlus = sc.nextInt();
				userA.add(userPlus);
			}

			System.out.println("B");
			for (i = 0; i < forNum; i++) {
				int userPlus = sc.nextInt();
				userB.add(userPlus);
			}

			for (i = 0; i < forNum; i++) {
				if (userA.get(i) > userB.get(i)) {

					if (userA.get(i) == 3 && userB.get(i) == 1) {
						print.add("B");
					} else {
						print.add("A");
					}

				} else if (userA.get(i) < userB.get(i)) {

					if (userB.get(i) == 3 && userA.get(i) == 1) {
						print.add("A");
					} else {
						print.add("B");
					}

				} else {
					print.add("D");
				}
			}


			for (String list : print) {
				System.out.println(list);
			}


		}
	}


