package algorithm_;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


// Java - 자바 알고리즘 문제풀이 (33) 매출액의 종류


public class Test_39 {

	
//	매출액의 종류
//	현수의 아빠는 제과점을 운영합니다. 현수아빠는 현수에게 N일 동안의 매출기록을 주고 연속
//	된 K일 동안의 매출액의 종류를 각 구간별로 구하라고 했습니다.
//	만약 N=7이고 7일 간의 매출기록이 아래와 같고, 이때 K=4이면 
//	20 12 20 10 23 17 10
//	각 연속 4일간의 구간의 매출종류는 
//	첫 번째 구간은 [20, 12, 20, 10]는 매출액의 종류가 20, 12, 10으로 3이다.
//	두 번째 구간은 [12, 20, 10, 23]는 매출액의 종류가 4이다.
//	세 번째 구간은 [20, 10, 23, 17]는 매출액의 종류가 4이다.
//	네 번째 구간은 [10, 23, 17, 10]는 매출액의 종류가 3이다.
//	N일간의 매출기록과 연속구간의 길이 K가 주어지면 첫 번째 구간부터 각 구간별 매출액의 종
//	류를 출력하는 프로그램을 작성하세요.
//	▣ 입력설명
//	첫 줄에 N(5<=N<=100,000)과 K(2<=K<=N)가 주어집니다.
//	두 번째 줄에 N개의 숫자열이 주어집니다. 각 숫자는 500이하의 음이 아닌 정수입니다.
//	▣ 출력설명
//	첫 줄에 각 구간의 매출액 종류를 순서대로 출력합니다.
//	▣ 입력예제 1 
//	7 4
//	20 12 20 10 23 17 10
//	▣ 출력예제 1
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
			// 4일 단위로 카운트가 끝나면 반복문 종료
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


