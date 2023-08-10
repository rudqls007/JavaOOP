package algorithm_;

import java.util.Scanner;


// Java - 자바 알고리즘 문제풀이 (29) 연속된 자연수의 합
// https://blog.naver.com/hansoo0724/222659207337 - 풀이
public class Test_29 {
	
//	연속된 자연수의 합
//	N입력으로 양의 정수 N이 입력되면 2개 이상의 연속된 자연수의 합으로 정수 N을 표현하는 
//	방법의 가짓수를 출력하는 프로그램을 작성하세요.
//	만약 N=15이면 
//	7+8=15
//	4+5+6=15
//	1+2+3+4+5=15
//	와 같이 총 3가지의 경우가 존재한다.
//	▣ 입력설명
//	첫 번째 줄에 양의 정수 N(7<=N<1000)이 주어집니다.
//	▣ 출력설명
//	첫 줄에 총 경우수를 출력합니다.
//	▣ 입력예제 1 
//	15
//	▣ 출력예제 1
//	3

	public static String numPlus(int num) {
		int cnt = 0;
		int sum = 0;

		for (int i = 1; i <= num; i++) {
			System.out.println("==============");
			for (int j = i; j < num; j++) { // 내부 for문의 j를 num과 동일한 만큼 반복하면 자기 자신을 합산에 더함
											// 그럴 경우 연속해서 더해진게 아니더라도 카운트를 하게됨
											// 따라서 내부 for문은 num의 이전까지 범위를 설정 , 반복하게 한다
				sum = sum + j;
				
				// 확인용 if문
				if(sum!=num) {
				System.out.println("해당없는 숫자:"+sum);
				}
				
				if (sum == num) {
					System.out.println("*연속해서 더한값이 조건문에 해당*:" + sum);
					cnt++;
				}

			}
			sum = 0;
		}

		return "연속해서 더한값 카운트:" + cnt;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.print(numPlus(num));

	}

}

