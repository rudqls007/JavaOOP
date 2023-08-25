package algorithm_;

import java.util.ArrayList;
import java.util.Scanner;


// Java - 자바 알고리즘 문제풀이 (13) 큰 수 출력하기

public class Test_15 {

	public static void main(String[] args) {

		// 6 7 3 9 5 6 12 / 7 9 6 12 
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>(); // 비교용 ArrayList
		ArrayList<Integer> print = new ArrayList<>(); // 입력용 ArrayList

		int i = 0; // ArrayList의 get(변수)

		while (true) {

			int arrNum = sc.nextInt();
			al.add(arrNum); // ArrayList al 에 입력한 숫자를 넣음

			if (arrNum > al.get(i)) { // 입력한 숫자와 al 배열의 숫자를 비교  
				print.add(arrNum); // 입력한 숫가자 더 클 경우 출력전용 ArrayList에 입력값을 넣음 
				System.out.println(print);
				i++; // 배열의 순번을 올려서 다음 순번의 배열과 비교하기 위한 준비
				
			} else if (arrNum < al.get(i)) {
				al.remove(i); // 만약 입력된 숫자가 배열의 숫자보다 작다면 배열의 숫자를 삭제
				
			}
		}
	}


}
