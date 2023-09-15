package algorithm_;

import java.util.Scanner;
import java.util.Stack;


// Java - 자바 알고리즘 문제풀이 (37) 괄호문자제거

public class Test_35 {

	
//	괄호문자제거
//	입력된 문자열에서 소괄호 ( ) 사이에 존재하는 모든 문자를 제거하고 남은 문자만 출력하는 
//	프로그램을 작성하세요.
//	▣ 입력설명
//	첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.
//	▣ 출력설명
//	남은 문자만 출력한다.
//	▣ 입력예제 1 
//	(A(BC)D)EF(G(H)(IJ)K)LM(N)
//	▣ 출력예제 1
//	EFLM
	
	public static String sol(String str) {
		System.out.println("매개변수 : "+str);
		Stack<Character> stack = new Stack<>(); // '()'는 문자 , 따라서 Character
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
