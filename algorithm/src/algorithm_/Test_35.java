package algorithm_;

import java.util.Scanner;
import java.util.Stack;


// Java - �ڹ� �˰��� ����Ǯ�� (37) ��ȣ��������

public class Test_35 {

	
//	��ȣ��������
//	�Էµ� ���ڿ����� �Ұ�ȣ ( ) ���̿� �����ϴ� ��� ���ڸ� �����ϰ� ���� ���ڸ� ����ϴ� 
//	���α׷��� �ۼ��ϼ���.
//	�� �Է¼���
//	ù �ٿ� ���ڿ��� �־�����. ���ڿ��� ���̴� 100�� ���� �ʴ´�.
//	�� ��¼���
//	���� ���ڸ� ����Ѵ�.
//	�� �Է¿��� 1 
//	(A(BC)D)EF(G(H)(IJ)K)LM(N)
//	�� ��¿��� 1
//	EFLM
	
	public static String sol(String str) {
		System.out.println("�Ű����� : "+str);
		Stack<Character> stack = new Stack<>(); // '()'�� ���� , ���� Character
		String answer = "";
	
		
		System.out.println(str);
		
		 for(char ch : str.toCharArray()){
	            if(ch == '('){
	                stack.push(ch);
	            }else if(ch == ')'){
	                stack.pop();
	            }else{
	                if(stack.isEmpty()){
	                    answer += ch;
	                }
	            }
		 
	            
	}

		return answer;
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
	
		String answer = sol(str);
		System.out.println(answer);
	}

	


}
