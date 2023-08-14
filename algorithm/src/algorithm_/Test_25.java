package algorithm_;

import java.util.ArrayList;
import java.util.Collections;

import java.util.List;
import java.util.Scanner;


//  자바 알고리즘 문제풀이 (25)  두배열 합치기 2
public class Test_25 {
	
//	두 배열 합치기
//	오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램
//	을 작성하세요.
//	▣ 입력설명
//	첫 번째 줄에 첫 번째 배열의 크기 N(1<=N<=100)이 주어집니다.
//	두 번째 줄에 N개의 배열 원소가 오름차순으로 주어집니다. 
//	세 번째 줄에 두 번째 배열의 크기 M(1<=M<=100)이 주어집니다.
//	네 번째 줄에 M개의 배열 원소가 오름차순으로 주어집니다. 
//	각 리스트의 원소는 int형 변수의 크기를 넘지 않습니다.
//	▣ 출력설명
//	오름차순으로 정렬된 배열을 출력합니다.
//	▣ 입력예제 1 
//	3
//	1 3 5
//	5
//	2 3 6 7 9
//	▣ 출력예제 1
//	1 2 3 3 5 6 7 9
	
	public static void main(String[] args) {
		List<Integer> al_a = new ArrayList<>();
		List<Integer> al_b = new ArrayList<>();

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

			al_a.addAll(al_b);

			Collections.sort(al_a); // 오름차순 정렬

			System.out.println(al_a);
			
		}

	}

}

