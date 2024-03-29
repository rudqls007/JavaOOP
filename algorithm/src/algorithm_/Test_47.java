package algorithm_;

import java.util.Scanner;


// Java - 자바 알고리즘 문제풀이 (22) 봉우리


public class Test_47 {

	
//	봉우리
//	지도 정보가 N*N 격자판에 주어집니다. 각 격자에는 그 지역의 높이가 쓰여있습니다. 각 격자
//	판의 숫자 중 자신의 상하좌우 숫자보다 큰 숫자는 봉우리 지역입니다. 봉우리 지역이 몇 개 
//	있는 지 알아내는 프로그램을 작성하세요. 
//	격자의 가장자리는 0으로 초기화 되었다고 가정한다.
//	만약 N=5 이고, 격자판의 숫자가 다음과 같다면 봉우리의 개수는 10개입니다.
//	0 0 0 0 0 0 0
//	0 5 3 7 2 3 0
//	0 3 7 1 6 1 0
//	0 7 2 5 3 4 0
//	0 4 3 6 4 1 0
//	0 8 7 3 5 2 0
//	0 0 0 0 0 0 0
//	▣ 입력설명
//	첫 줄에 자연수 N이 주어진다.(2<=N<=50) 
//	두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는
//	다. 
//	▣ 출력설명
//	봉우리의 개수를 출력하세요.
//	▣ 입력예제 1 
//	5
//	5 3 7 2 3
//	3 7 1 6 1
//	7 2 5 3 4
//	4 3 6 4 1
//	8 7 3 5 2
//	▣ 출력예제 1
//	10

	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int arrNum = sc.nextInt(); // 숫자 입력받음
		int[][] arr = new int[arrNum][arrNum];

		for (int i = 0; i < arrNum; i++) { // 반복문이 돌면서 숫자들 배열에 넣는다
			for (int j = 0; j < arrNum; j++) {
				arr[i][j] = sc.nextInt(); // 숫자 입력 
			}
		}

				
		int count = 0;

		for (int i = 0; i < arrNum; i++) {
			for (int j = 0; j < arrNum; j++) {
				boolean flag = true;

				// 상
				if (i != 0 && arr[i][j] < arr[i - 1][j]) { // 가장자리는 0으로 초기화 되고 격자판에서 위에 숫자가 자신보다 큰수인지 확인
					flag = false;
				}

				// 하
				if (i != arrNum - 1 && arr[i][j] < arr[i + 1][j]) { // 가장자리는 0으로 초기화 되고 격자판에서 아래에 숫자가 자신보다 큰수인지 확인
					flag = false;
				}

				// 좌
				if (j != 0 && arr[i][j] < arr[i][j - 1]) { // 가장자리는 0으로 초기화 되고 격자판에서 위에 왼쪽에 숫자가 자신보다 큰수인지 확인
					flag = false;
				}

				// 우
				if (j != arrNum - 1 && arr[i][j] < arr[i][j + 1]) { // 가장자리는 0으로 초기화 되고 격자판에서 오른쪽에 숫자가 자신보다 큰수인지 확인
					flag = false;
				}

				if (flag) {
					count++;
				}
			}
		}
		System.out.println(count);
		
	}
	


}
