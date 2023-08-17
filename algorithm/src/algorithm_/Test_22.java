package algorithm_;

import java.util.Arrays;
import java.util.Scanner;

//자바 알고리즘 문제풀이 (20) 등수구하기

public class Test_22 {

//	등수구하기
//	N명의 학생의 국어점수가 입력되면 각 학생의 등수를 입력된 순서대로 출력하는 프로그램을 
//	작성하세요.
//	같은 점수가 입력될 경우 높은 등수로 동일 처리한다. 즉 가장 높은 점수가 92점인데 92점이 
//	3명 존재하면 1등이 3명이고 그 다음 학생은 4등이 된다.
//	▣ 입력설명
//	첫 줄에 N(3<=N<=100)이 입력되고, 두 번째 줄에 국어점수를 의미하는 N개의 정수가 입력
//	된다. 
//	▣ 출력설명
//	입력된 순서대로 등수를 출력한다.
//	▣ 입력예제 1 
//	5
//	87 89 92 100 76
//	▣ 출력예제 1
//	4 3 2 1 5

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // 스캐너 선언
		int num = sc.nextInt(); // 입력할 명수

		int stPoint[] = new int[num]; // 명수에 맞춰서 배열의 사이즈 설정
		int stRank[] = new int[num]; // 명수에 맞춰서 배열의 사이즈 설정

		int count; // 등수를 위한 변수

		for (int i = 0; i < stPoint.length; i++) { // 학생성적 배열 크기만큼 반복
			stPoint[i] = sc.nextInt(); // 학생성적을 배열에 입력
		}

		for (int i = 0; i < stPoint.length; i++) { // 학생성적 배열 크기만큼 반복 (외부 for문)

			count = 1; // 반복문이 한번 돌면 변수를 1로 초기화

			for (int j = 0; j < stPoint.length; j++) { // 학생성적 배열 크기만큼 반복 (내부 for문)

				if (stPoint[i] < stPoint[j]) { // 이중 for문으로인해 모든 숫자가 비교
					count++;

					// 점수배열의 i(내부for변수)번째 값과 j(외부for변수)번째 값들을 ( 학생수가 5명이라면 0 , 1 , 2 , 3 , 4) 비교
					// 값이 가장 큰 값은 j번째 값들이 자기보다(i번째 값) 큰 값이 없기 때문에 1을 유지
					// 값이 가장 작은 값은 j번째 값들이 모두 자기보다(i번째 값) 크기 때문에 5가 됨
					// .
					// .
					// .
					// i 번째를 본인 , j를 친구들의 점수라고 했을 때 본인이 89점이라면 ?
					// 처음에는 count가 1이 되겠지만 비교를 한번씩 거치고 본인보다 높은 친구가 2명 있기 때문에 숫자 3을 가지게됨

				}
			}

			stRank[i] = count; // 등수 배열에 count 값 넣기
			// 내부 for문이 전부다 돌면 등수 배열에 count를 넣어준다.
		}

		System.out.println(Arrays.toString(stRank));
	}

}
