package algorithm_;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;


// Java - 자바 알고리즘 문제풀이 (31) 학급 회장(해쉬)

public class Test_41{
	public static String sol(ArrayList<String> al) {
		int maxNum = 0;
		HashMap<String, Integer> hash = new HashMap<>();
		String readAlpha = null;

		for (int i = 0; i < al.size(); i++) {
			hash.put(al.get(i), Collections.frequency(al, al.get(i)));
		}

		int maxValue = Collections.max(hash.values());
		for (Entry<String, Integer> m : hash.entrySet()) {

			String key = m.getKey();
			Integer value = m.getValue();
			System.out.println(String.format("키 : " + key + ", 값 : " + value));

			if (m.getValue() == maxValue) {
				readAlpha = m.getKey();

			}
		}

		return readAlpha;
	}

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		String answer = sc.nextLine();

		int arrNum = 1;
		for (int i = 0; i < answer.length(); i++) {
			al.add(answer.substring(i, arrNum));
			arrNum++;
		}

		Collections.sort(al);

		System.out.print(sol(al));
	}

}
