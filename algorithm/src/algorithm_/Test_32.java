package algorithm_;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

// Java - �ڹ� �˰��� ����Ǯ�� (32) �Ƴ��׷� (�ؽ�)
// https://blog.naver.com/hansoo0724/222664567928 = Ǯ��
public class Test_32 {
//	�Ƴ��׷�(�ؽ�)
//	Anagram�̶� �� ���ڿ��� ���ĺ��� ���� ������ �ٸ����� �� ������ ��ġ�ϸ� �� �ܾ�� ��
//	���׷��̶�� �մϴ�. 
//	���� ��� AbaAeCe �� baeeACA �� ���ĺ��� ���� ������ �ٸ����� �� ������ ���캸�� 
//	A(2), a(1), b(1), C(1), e(2)�� ���ĺ��� �� ������ ��� ��ġ�մϴ�. �� ��� �� �ܾ �� 
//	�迭�ϸ� ����� �ܾ �� �� �ִ� ���� �Ƴ��׷��̶� �մϴ�.
//	���̰� ���� �� ���� �ܾ �־����� �� �ܾ �Ƴ��׷����� �Ǻ��ϴ� ���α׷��� �ۼ��ϼ�
//	��. �Ƴ��׷� �Ǻ��� ��ҹ��ڰ� ���е˴ϴ�.
//	�� �Է¼���
//	ù �ٿ� ù ��° �ܾ �Էµǰ�, �� ��° �ٿ� �� ��° �ܾ �Էµ˴ϴ�. 
//	�ܾ��� ���̴� 100�� ���� �ʽ��ϴ�. 
//	�� ��¼���
//	�� �ܾ �Ƴ��׷��̸� ��YES"�� ����ϰ�, �ƴϸ� ��NO"�� ����մϴ�.
//	�� �Է¿��� 1 
//	AbaAeCe
//	baeeACA
//	�� ��¿��� 1
//	YES
//	�� �Է¿��� 2 
//	abaCC
//	Caaab
//	�� ��¿��� 2
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

