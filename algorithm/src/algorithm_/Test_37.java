package algorithm_;

import java.util.ArrayList;
import java.util.NavigableSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Test_37 {

	
//	K번째 큰 수
//	현수는 1부터 100사이의 자연수가 적힌 N장의 카드를 가지고 있습니다. 같은 숫자의 카드가 
//	여러장 있을 수 있습니다. 현수는 이 중 3장을 뽑아 각 카드에 적힌 수를 합한 값을 기록하려
//	고 합니다. 3장을 뽑을 수 있는 모든 경우를 기록합니다. 기록한 값 중 K번째로 큰 수를 출력
//	하는 프로그램을 작성하세요.
//	만약 큰 수부터 만들어진 수가 25 25 23 23 22 20 19......이고 K값이 3이라면 K번째 큰 값
//	은 22입니다.
//	▣ 입력설명
//	첫 줄에 자연수 N(3<=N<=100)과 K(1<=K<=50) 입력되고, 그 다음 줄에 N개의 카드값이 입력
//	된다.
//	▣ 출력설명
//	첫 줄에 K번째 수를 출력합니다. K번째 수가 존재하지 않으면 -1를 출력합니다.
//	▣ 입력예제 1 
//	10 3
//	13 15 34 23 45 65 33 11 26 42
//	▣ 출력예제 1
//	143	

		
	static int sol(int ranCount, int numberCont) {
		
		ArrayList<Integer> al = new ArrayList<Integer>(); // 랜덤수열 & 더한 값 담아주는 ArrayList
		TreeSet<Integer> treeSet = new TreeSet<>(); // 더한 값 중복 제거용 

		try {
			for (int i = 0; i < ranCount; i++) {
				al.add((int)(Math.random() * 100) + 1); // 입력한 수열만큼 1~100까지의 랜덤한 숫자 자동배치
			}

			System.out.println(al);

			for (int i = 0; i < al.size(); i++) {
				for (int j = 0; j < al.size(); j++) {
					for (int k = 0; k < al.size(); k++) {
						treeSet.add(al.get(i) + al.get(j) + al.get(k)); // 3중 for문으로 3개의 모든 경우의 수 구하고 다 더해줌

					}
				}
			}

			al.clear(); // ArrayList 재활용 
			NavigableSet<Integer> decendingSet = treeSet.descendingSet(); // 내림차순으로 Set 정렬
			al.addAll(decendingSet); // ArrayList에 담아 주기 

			System.out.println(al);

		} catch (Exception e) { // 해당되는 수가 없으면 예외처리 진행 , -1 반환 
			return -1;
		}

		return al.get(numberCont - 1); // 사용자가 3을 입력하면 인덱스 번호로는 2에 해당 , 따라서 -1 

	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int ranCount = sc.nextInt();
		int numberCont = sc.nextInt();

		System.out.println(sol(ranCount, numberCont));
	}

}



