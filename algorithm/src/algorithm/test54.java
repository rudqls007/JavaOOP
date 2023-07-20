package algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
//
//최대 매출
//현수의 아빠는 제과점을 운영합니다. 현수아빠는 현수에게 N일 동안의 매출기록을 주고 연속
//된 K일 동안의 최대 매출액이 얼마인지 구하라고 했습니다.
//만약 N=10이고 10일 간의 매출기록이 아래와 같습니다. 이때 K=3이면 
//12 15 11 20 25 10 20 19 13 15
//연속된 3일간의 최대 매출액은 11+20+25=56만원입니다.
//여러분이 현수를 도와주세요.
//▣ 입력설명
//첫 줄에 N(5<=N<=100,000)과 K(2<=K<=N)가 주어집니다.
//두 번째 줄에 N개의 숫자열이 주어집니다. 각 숫자는 500이하의 음이 아닌 정수입니다.
//▣ 출력설명
//첫 줄에 최대 매출액을 출력합니다.
//▣ 입력예제 1 
//10 3
//12 15 11 20 25 10 20 19 13 15
//▣ 출력예제 1
//56
public class test54 {	
    public static int sel(int arrSize, int selNum, int[] arr){	
    	
    	ArrayList<Integer>al =  new ArrayList<>();
    	int sum=0;
    	
		for (int i = 0; i<arrSize; i++) { // 선언한 날짜만큼 반복을 진행
			
			for (int j = i; j < selNum+i; j++) { // 연속되는 날짜의 반복문 변수 j는 i에 맞춰서 움직임
												 // 그에 따라서 반목문의 범위도 selNum+i 만큼 증가
				// 0(반복시작점 j) 1 2(범위: selNum+i) / 1(반복시작점 j) 2 3(범위: selNum+i) / 2(반복시작점 j) 3 4(범위: selNum+i) 
				
				if(j<arr.length) { // j가 매출액 배열의 크기보다 낮을 경우에만 
				sum += arr[j]; // 내부 반복문 변수 j만큼 arr 배열의 인덱스 번호도 증가 , sum 이라는 변수에 더해짐
				
				}else {
					System.out.println("j변수의 값:"+j);
				}
				
			}
			
			al.add(sum); // 내부 반복문이 종료하면  해당 값을 al 이라는 어레이리스트에 더하고
			sum=0; // sum 변수 초기화
			
		}
		
		System.out.println(al);
		return Collections.max(al);	// 모든 반복이 종료되면 어레이리스트의 가장 큰 값을 반환 
    }
    
    
    
    
	public static void main(String[] args) {
		// 01 12 23 45
		// 012 234 456 678 89...
		
		Scanner sc = new Scanner(System.in);
		
		int arrSize = sc.nextInt();
		int selNum = sc.nextInt();
		int arr[] = new int[arrSize];
		
		for(int i=0; i<arrSize; i++) {
			int userNum = sc.nextInt();
			arr[i]=userNum;
		}
		
		 System.out.println(sel(arrSize, selNum, arr));
		 	
	}
}

