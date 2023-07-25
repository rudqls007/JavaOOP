package algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TEST_11 {
		public static void main(String[] args) {
			
			// 문자열 압축 KKHSSSSSSSE
			
			ArrayList<String> al = new ArrayList<>();
			
			Scanner sc = new Scanner(System.in);
			String answer = sc.nextLine();
			
			int arrNum = 1;
			for (int i = 0; i < answer.length(); i++) {
				al.add(answer.substring(i, arrNum));	
				arrNum++;	
			}
			
			Set<String> alSet = new HashSet<String>(al); // set 컬렉션프레임 워크
			
			for (String str : alSet) {
				
				int num = Collections.frequency(al, str); // 컬렉션 안에서 객체가 몇 번 등장했는지 알려주는 메소드
														  // 등장한 갯수를 리턴
				
				if (num == 1) {
					System.out.print(str);
				} else {
					System.out.print(str + num);
				}

				}				
		}	
	}
