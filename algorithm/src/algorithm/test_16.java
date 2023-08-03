package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;


// Java - �ڹ� �˰��� ����Ǯ�� (39) ������ ����
public class test_16 {
//	����������� �־����� ������ ����� ����ϴ� ���α׷��� �ۼ��ϼ���.
//	���� 3*(5+2)-9 �� ������������� ǥ���ϸ� 352+*9- �� ǥ���Ǹ� �� ����� 12�Դϴ�.
//	�� �Է¼���
//	ù �ٿ� ����������� �־����ϴ�. ������� ���̴� 50�� ���� �ʽ��ϴ�.
//	���� 1~9�� ���ڿ� +, -, *, / �����ڷθ� �̷������.
//	�� ��¼���
//	������ ����� ����մϴ�.
//	�� �Է¿��� 1 
//	352+*9-
//	�� ��¿��� 1
//	12
	public static Stack<Integer> sol(String arr[]) {
		Stack<Integer> stack = new Stack<Integer>();
		
		for (String s : arr) {
			if (s.matches("^[0-9]*$")) {
				int num = 0;
				num = Integer.parseInt(s);
				stack.push(num);
				System.out.println("����:" + stack);
			} else {
				int a = (int) stack.pop();
				int b = (int) stack.pop();

				if (s.equals("+")) stack.push(b + a); 
				if (s.equals("-")) stack.push(b - a); 
				if (s.equals("*")) stack.push(b * a); 				
				if (s.equals('-')) stack.push(b / a); 
			}
			System.out.println("���� �� stack : " + stack);
		}

		return stack;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String answer = sc.nextLine();

		String[] arr = new String[answer.length()];
		arr = answer.split("");
		System.out.println(Arrays.toString(arr));
		System.out.println(sol(arr));
		
		
		
	}

}

