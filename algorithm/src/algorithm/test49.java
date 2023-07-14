package algorithm;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class test49 {

	// ��ȣ�� �ԷµǸ� �ùٸ� ��ȣ�̸� ��YES", �ùٸ��� ������ ��NO"�� ����մϴ�.
	// (())() �̰��� ��ȣ�� ���� �ùٸ��� ��ġ�ϴ� ������, (()()))�� �ùٸ� ��ȣ�� �ƴϴ�.
	// �� �Է¼���
	// ù ��° �ٿ� ��ȣ ���ڿ��� �Էµ˴ϴ�. ���ڿ��� �ִ� ���̴� 30�̴�.
	// �� ��¼���
	// ù ��° �ٿ� YES, NO�� ����Ѵ�.
	// �� �Է¿��� 1
	// (()(()))(()
	// �� ��¿��� 1
	// NO

	//stack.push(10);		//stack�� 10 �߰�
	//stack.pop();		//stack�� ������ push�� ����
	//stack.clear();		//stack�� ��ü ����
	//stack.peek();		//stack�� ������ push�� Ȯ��
	//stack.size();		//stack�� �迭 ���� ��
	//stack.empty();		//stack�� ��������� true (������ false)
	//stack.contains(1);
	
	
	static boolean sol(String str) {
		
		boolean answer = false; // �⺻���� false�� ���� 
		Stack<Character> stack = new Stack<>(); // '()'�� ���� , ���� Character

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '(') {
				stack.push(str.charAt(i)); // '('�̸� ���ÿ� �ֱ�
			} else { // ')' �̸�

				if (stack.isEmpty()) { // ')' �ε� ������ ��������� ���ʿ� �߸��� ���ڿ�
					return false; // ���� false ��ȯ
				}

				stack.pop(); 
				// ������ ������������� ���ÿ� '('�� �����Ѵٴ� �� 
				// ���� '('�� �������μ� ')'�� ���� ���� ������

				
			}
		}

		if (stack.isEmpty()) { // ���� �ָ��߱Ⱑ �� ������ ������ ����� �������
			System.out.println(stack);
			answer = true; // ���� �� �������� ������ true�� ��ȯ
		}

		System.out.println(stack);
		return answer; // ������ ��������ʴٸ� ���� �ȸ±� ���� , ���� false ��ȯ
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		if (str.charAt(0) == ')') {
			System.out.println("���θ޼ҵ� : No");
			
		} else {
			boolean answer = sol(str); // �޼ҵ� ȣ�� 
			
			if (answer == true) {
				System.out.println("Yes"); // ��ȯ���� true�� ���
			} else {
				System.out.println("No"); // �ƴ� ��� 
			}
		}

	}

}

