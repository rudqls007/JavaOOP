package algorithm_;

import java.util.Arrays;
import java.util.Scanner;


// Java - 자바 알고리즘 문제풀이 (32) 아나그램 (해쉬)


public class Test_40 {

//	아나그램(해쉬)
//	Anagram이란 두 문자열이 알파벳의 나열 순서를 다르지만 그 구성이 일치하면 두 단어는 아
//	나그램이라고 합니다. 
//	예를 들면 AbaAeCe 와 baeeACA 는 알파벳을 나열 순서는 다르지만 그 구성을 살펴보면 
//	A(2), a(1), b(1), C(1), e(2)로 알파벳과 그 개수가 모두 일치합니다. 즉 어느 한 단어를 재 
//	배열하면 상대편 단어가 될 수 있는 것을 아나그램이라 합니다.
//	길이가 같은 두 개의 단어가 주어지면 두 단어가 아나그램인지 판별하는 프로그램을 작성하세
//	요. 아나그램 판별시 대소문자가 구분됩니다.
//	▣ 입력설명
//	첫 줄에 첫 번째 단어가 입력되고, 두 번째 줄에 두 번째 단어가 입력됩니다. 
//	단어의 길이는 100을 넘지 않습니다. 
//	▣ 출력설명
//	두 단어가 아나그램이면 “YES"를 출력하고, 아니면 ”NO"를 출력합니다.
//	▣ 입력예제 1 
//	AbaAeCe
//	baeeACA
//	▣ 출력예제 1
//	YES
//	▣ 입력예제 2 
//	abaCC
//	Caaab
//	▣ 출력예제 2
//	NO
	
	public static String sol(String[] firstArr, String[] secondArr) {
		Arrays.sort(firstArr);
		Arrays.sort(secondArr);

		for (int i = 0; i < firstArr.length; i++) {
			if (firstArr[i].equals(secondArr[i])) {
			} else {
				return "NO";
			}
		}
		return "YES";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String first = sc.nextLine();
		String second = sc.nextLine();

		String[] firstArr = new String[first.length()];
		String[] secondArr = new String[second.length()];

		firstArr = first.split("");
		secondArr = second.split("");

		if (first.length() == second.length()) {
			System.out.println(sol(firstArr, secondArr));
		} else {
			System.out.println("NO");
		}

	}



	
}
