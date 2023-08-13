package algorithm_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


// Java - 자바 알고리즘 문제풀이 (26)  두 배열 합치기
// https://blog.naver.com/hansoo0724/222654064881
public class Test_26 {

//	공통원소 구하기
//	A, B 두 개의 집합이 주어지면 두 집합의 공통 원소를 추출하여 오름차순으로 출력하는 프로
//	그램을 작성하세요.
//	▣ 입력설명
//	첫 번째 줄에 집합 A의 크기 N(1<=N<=30,000)이 주어집니다.
//	두 번째 줄에 N개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.
//	세 번째 줄에 집합 B의 크기 M(1<=M<=30,000)이 주어집니다.
//	네 번째 줄에 M개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.
//	각 집합의 원소는 1,000,000,000이하의 자연수입니다.
//	▣ 출력설명
//	두 집합의 공통원소를 오름차순 정렬하여 출력합니다.
//	▣ 입력예제 1 
//	5
//	1 3 9 5 2
//	5
//	3 2 5 7 8	
//	▣ 출력예제 1
//	2 3 5
	
	public static void main(String[] args) {
		List<Integer> al_a = new ArrayList<>();
		List<Integer> al_b = new ArrayList<>();
		List<Integer> al_c = new ArrayList<>();

		while (true) {
			Scanner sc = new Scanner(System.in);
			int count = sc.nextInt();

			for (int i = 0; i < count; i++) {
				int plusAl = sc.nextInt();
				al_a.add(plusAl);
			}

			int count2 = sc.nextInt();

			for (int i = 0; i < count2; i++) {
				int plusAl = sc.nextInt();
				al_b.add(plusAl);
			}

			for (int i = 0; i < al_a.size(); i++) {
				for (int j = 0; j < al_b.size(); j++) {
					if (al_a.get(i) == al_b.get(j)) {
						al_c.add(al_a.get(i));

					}

				}
			}
			
			Collections.sort(al_c);
			System.out.println(al_c);
		}
	}

}

