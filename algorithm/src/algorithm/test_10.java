package algorithm;

import java.util.Scanner;

public class test_10 {
	public static void main(String[] args) {
//		자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요. 
//		만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.
//		제한시간은 1초입니다. 
//		▣ 입력설명
//		첫 줄에 자연수의 개수 N(2<=N<=200,000)이 주어집니다.
//		▣ 출력설명
//		첫 줄에 소수의 개수를 출력합니다.
//		▣ 입력예제 1 
//		20
//		▣ 출력예제 1
//		8
	Scanner sc = new Scanner(System.in);	
	System.out.println("소수갯수 구하기"+ "");
	int n = sc.nextInt();
	
	int num[] = new int[n+1]; // 배열은 0부터 시작 , 만약 10까지 수를 구한다면 +1로 시작
	int result = 0;
	
	for(int i=2; i<num.length; i++){ // 소수는 0 ,1 보다 큰 자연수부터 시작 , 따라서 2
		if(num[i]==0){ // 배열의 값이 0이면 카운트 
			result++; 
		} 
		 for(int j=i; j<num.length; j+=i){ // 2의배수 , 3의배수 등 배수를 위한 반복문 
			 num[j] = 1; // 배수일 경우 인덱스를 1로
			 } 
		 
	 } 
		System.out.println(result); 
		
		// 0과 1은 따로 카운트하지 않고 2부터 시작 
		// 2는 배열의 값이 0이기 때문에 카운트 , 그리고 자신포함 모든 배수의 값을 1로 만듦(범위내에서)
		// 3도 동일하게 카운트 , 그리고 자신포함 모든 배수의 값을 1로 만듦(범위내에서)
		// ... 이런식으로 각 숫자의 모든 배수가 1로 만들어지기 때문에 소수만 남게됨(각 숫자의 배수는 이미 1로 변경)
		// 이것이 바로 에라토스테네스의 체
	}
}

