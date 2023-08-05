package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class test_07 {

//	모든 아나그램 찾기(해쉬, 투포인터, 슬라이딩 윈도우)
//	S문자열에서 T문자열과 아나그램이 되는 S의 부분문자열의 개수를 구하는 프로그램을 작성하
//	세요. 아나그램 판별시 대소문자가 구분됩니다. 부분문자열은 연속된 문자열이어야 합니다.
//	▣ 입력설명
//	첫 줄에 첫 번째 S문자열이 입력되고, 두 번째 줄에 T문자열이 입력됩니다. 
//	S문자열의 길이는 10,000을 넘지 않으며, T문자열은 S문자열보다 길이가 작거나 같습니다.
//	▣ 출력설명
//	S단어에 T문자열과 아나그램이 되는 부분문자열의 개수를 출력합니다.
//	▣ 입력예제 1 
//	bacaAacba
//	abc
//	▣ 출력예제 1
//	3
//	출력설명: {bac}, {acb}, {cba} 3개의 부분문자열이 "abc"문자열과 아나그램입니다.
//	▣ 입력예제 2 
//	bacaAacbaa
//	abca
//	▣ 출력예제 2
//	3

	public static int sol(String[] sStringArr, String[] tStringArr) {
		Set<String> set = new HashSet<>();
		int count = 0;
		ArrayList<String> sStringCount = new ArrayList<>();
		ArrayList<String> tStringCount = new ArrayList<>();

		for (int i = 0; i < sStringArr.length; i++) {
			set.add(sStringArr[i]);
		}
		sStringCount.addAll(set);
		set.clear();

		
		for (int i = 0; i < tStringArr.length; i++) {
			set.add(tStringArr[i]);
		}
		tStringCount.addAll(set);
		set.clear();

		System.out.println(sStringCount);
		System.out.println(tStringCount);

		for (int i = 0; i < sStringCount.size(); i++) {
			for (int j = 0; j < tStringCount.size(); j++) {
				if (sStringCount.get(i).equals(tStringCount.get(j))) {
					count++;
				}
			}
		}

		
		sStringCount.clear();
		tStringCount.clear();
		return count;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String sString = sc.nextLine();
		String tString = sc.nextLine();

		String[] sStringArr = new String[sString.length()];
		String[] tStringArr = new String[tString.length()];

		sStringArr = sString.split("");
		tStringArr = tString.split("");

		System.out.println(sol(sStringArr, tStringArr));
	}

}

