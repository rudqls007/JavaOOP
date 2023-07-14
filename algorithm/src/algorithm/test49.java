package algorithm;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class test49 {

	// 괄호가 입력되면 올바른 괄호이면 “YES", 올바르지 않으면 ”NO"를 출력합니다.
	// (())() 이것은 괄호의 쌍이 올바르게 위치하는 거지만, (()()))은 올바른 괄호가 아니다.
	// ▣ 입력설명
	// 첫 번째 줄에 괄호 문자열이 입력됩니다. 문자열의 최대 길이는 30이다.
	// ▣ 출력설명
	// 첫 번째 줄에 YES, NO를 출력한다.
	// ▣ 입력예제 1
	// (()(()))(()
	// ▣ 출력예제 1
	// NO

	//stack.push(10);		//stack에 10 추가
	//stack.pop();		//stack의 마지막 push값 제거
	//stack.clear();		//stack의 전체 삭제
	//stack.peek();		//stack의 마지막 push값 확인
	//stack.size();		//stack의 배열 길이 수
	//stack.empty();		//stack이 비어있으면 true (있으면 false)
	//stack.contains(1);
	
	
	static boolean sol(String str) {
		
		boolean answer = false; // 기본값은 false로 설정 
		Stack<Character> stack = new Stack<>(); // '()'는 문자 , 따라서 Character

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '(') {
				stack.push(str.charAt(i)); // '('이면 스택에 넣기
			} else { // ')' 이면

				if (stack.isEmpty()) { // ')' 인데 스택이 비어있으면 애초에 잘못된 문자열
					return false; // 따라서 false 반환
				}

				stack.pop(); 
				// 스택이 비어있지않으면 스택에 '('가 존재한다는 뜻 
				// 들어온 '('를 빼줌으로서 ')'에 대한 쌍을 맞춰줌

				
			}
		}

		if (stack.isEmpty()) { // 위의 쌍맞추기가 다 끝나고 스택이 비어져 있을경우
			System.out.println(stack);
			answer = true; // 쌍이 잘 맞춰졌기 때문에 true를 반환
		}

		System.out.println(stack);
		return answer; // 스택이 비어있지않다면 쌍이 안맞기 때문 , 따라서 false 반환
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		if (str.charAt(0) == ')') {
			System.out.println("메인메소드 : No");
			
		} else {
			boolean answer = sol(str); // 메소드 호출 
			
			if (answer == true) {
				System.out.println("Yes"); // 반환값이 true일 경우
			} else {
				System.out.println("No"); // 아닐 경우 
			}
		}

	}

}

