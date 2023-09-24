package algorithm_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


// Java - 자바 알고리즘 문제풀이 (30) 최대 길이 연속부분수열 ( 예제와 다른 접근 )


public class Test_42 {

	
	
//	최대 길이 연속부분수열
//	0과 1로 구성된 길이가 N인 수열이 주어집니다. 여러분은 이 수열에서 최대 k번을 0을 1로 변
//	경할 수 있습니다. 여러분이 최대 k번의 변경을 통해 이 수열에서 1로만 구성된 최대 길이의 
//	연속부분수열을 찾는 프로그램을 작성하세요.
//	만약 길이가 길이가 14인 다음과 같은 수열이 주어지고 k=2라면
//	1 1 0 0 1 1 0 1 1 0 1 1 0 1
//	여러분이 만들 수 있는 1이 연속된 연속부분수열은 1 1 0 0 1 1 1 1 1 1 1 1 0 1 이며 그 
//	길이는 8입니다.
//	▣ 입력설명
//	첫 번째 줄에 수열의 길이인 자연수 N(5<=N<100,000)이 주어집니다.
//	두 번째 줄에 N길이의 0과 1로 구성된 수열이 주어집니다.
//	▣ 출력설명
//	첫 줄에 최대 길이를 출력하세요.
//	▣ 입력예제 1 
//	14 2
//	1 1 0 0 1 1 0 1 1 0 1 1 0 1
//	▣ 출력예제 1
//	8
	
	public static Integer sol(int num, int change) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		int[] numArr = new int[num];
		int changeNum = change;
		int count = 0;

		for (int i = 0; i < num; i++) {
			// 사용자의 입력을 받는 대신 랜덤으로 숫자를 돌림
			numArr[i] += ((int) (Math.random() * 2));

			// 이중 if 문 : 0일 경우 1로 변경
			if (changeNum != 0) {
				if (numArr[i] == 0) {
					System.out.println("변경");
					numArr[i] = 1;
					changeNum--;
				}
			}

			// if - else 문 : 연속되는 숫자 카운트 , 연속 카운트 끊길경우 변수 초기화
			if (numArr[i] == 1) {
				count++;
			} else {
				al.add(count);
				count = 0;
			}

			System.out.print("변경된 배열:" + numArr[i] + " ");
			System.out.println("변경횟수변동:" + changeNum + " ");
		}

		System.out.println();
		System.out.println(al);

		return Collections.max(al);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int change = sc.nextInt();
		System.out.println(sol(num, change));

	}




}
