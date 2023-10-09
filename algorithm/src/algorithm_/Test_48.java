package algorithm_;

import java.util.Scanner;


// Java - 자바 알고리즘 문제풀이 (21) 격자판 최대합

public class Test_48 {

	
//	N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력합
//	니다.
//	▣ 입력설명
//	첫 줄에 자연수 N이 주어진다.(2<=N<=50) 
//	두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는
//	다. 
//	▣ 출력설명
//	최대합을 출력합니다.
//	▣ 입력예제 1 
//	5
//	10 13 10 12 15
//	12 39 30 23 11
//	11 25 50 53 15
//	19 27 29 37 27
//	19 13 30 13 19
	
//	▣ 출력예제 1
//	155

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int result = 0;
		int sizeNum = sc.nextInt();

		int[][] arr = new int[sizeNum][sizeNum];

		for (int i = 0; i < sizeNum; i++) {
			for (int j = 0; j < sizeNum; j++) {

				arr[i][j] = sc.nextInt();

			}
		}
		
	
	
		
		for (int i = 0; i < sizeNum; i++) {
			int garo = 0;
			int sero = 0;
			for (int j = 0; j < sizeNum; j++) {
				garo += arr[i][j]; // 가로 값들 누적
				sero += arr[j][i]; // 세로 값들 누적
			}

			result = Math.max(result, garo); // 가로 값 누적한것과 result 비교하여 더 큰것 result에 할당
			result = Math.max(result, sero); // 세로 값 누적한것과 result 비교하여 더 큰것 result에 할당
		}
		
		int left_daeGak = 0;
		int right_daeGak = 0;
		
		for (int i = 0; i < sizeNum; i++) {
			left_daeGak += arr[i][i]; //왼쪽 위 모서리에서 오른쪽 아래 모서리까지 누적(대각선)
			right_daeGak += arr[ i ][sizeNum - i - 1]; //오른쪽 위 모서리에서 왼쪽 아래 모서리까지 누적(대각선)
		}
		
		result = Math.max(result, left_daeGak); // 가로 값 누적한것과 result 비교하여 더 큰것 result에 할당
		result = Math.max(result, right_daeGak); // 세로 값 누적한것과 result 비교하여 더 큰것 result에 할당
		
		System.out.println(result);
	}

}


	
