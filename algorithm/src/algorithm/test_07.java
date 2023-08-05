package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class test_07 {

//	��� �Ƴ��׷� ã��(�ؽ�, ��������, �����̵� ������)
//	S���ڿ����� T���ڿ��� �Ƴ��׷��� �Ǵ� S�� �κй��ڿ��� ������ ���ϴ� ���α׷��� �ۼ���
//	����. �Ƴ��׷� �Ǻ��� ��ҹ��ڰ� ���е˴ϴ�. �κй��ڿ��� ���ӵ� ���ڿ��̾�� �մϴ�.
//	�� �Է¼���
//	ù �ٿ� ù ��° S���ڿ��� �Էµǰ�, �� ��° �ٿ� T���ڿ��� �Էµ˴ϴ�. 
//	S���ڿ��� ���̴� 10,000�� ���� ������, T���ڿ��� S���ڿ����� ���̰� �۰ų� �����ϴ�.
//	�� ��¼���
//	S�ܾ T���ڿ��� �Ƴ��׷��� �Ǵ� �κй��ڿ��� ������ ����մϴ�.
//	�� �Է¿��� 1 
//	bacaAacba
//	abc
//	�� ��¿��� 1
//	3
//	��¼���: {bac}, {acb}, {cba} 3���� �κй��ڿ��� "abc"���ڿ��� �Ƴ��׷��Դϴ�.
//	�� �Է¿��� 2 
//	bacaAacbaa
//	abca
//	�� ��¿��� 2
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

