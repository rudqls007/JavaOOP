package algorithm_;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

// Java - 자바 알고리즘 문제풀이 (39) 후위식 연산

public class Test_00 {

	
//	후위연산식이 주어지면 연산한 결과를 출력하는 프로그램을 작성하세요.
//	만약 3*(5+2)-9 을 후위연산식으로 표현하면 352+*9- 로 표현되며 그 결과는 12입니다.
//	▣ 입력설명
//	첫 줄에 후위연산식이 주어집니다. 연산식의 길이는 50을 넘지 않습니다.
//	식은 1~9의 숫자와 +, -, *, / 연산자로만 이루어진다.
//	▣ 출력설명
//	연산한 결과를 출력합니다.
//	▣ 입력예제 1 
//	352+*9-
//	▣ 출력예제 1
//	12
	public static Stack<Integer> sol(String arr[]) {
		Stack<Integer> stack = new Stack<Integer>();
		
		for (String s : arr) {
			if (s.matches("^[0-9]*$")) {
				int num = 0;
				num = Integer.parseInt(s);
				stack.push(num);
				System.out.println("숫자:" + stack);
			} else {
				int a = (int) stack.pop();
				int b = (int) stack.pop();

				if (s.equals("+")) stack.push(b + a); 
				if (s.equals("-")) stack.push(b - a); 
				if (s.equals("*")) stack.push(b * a); 				
				if (s.equals('-')) stack.push(b / a); 
			}
			System.out.println("연산 후 stack : " + stack);
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
