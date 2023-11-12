package algorithm_;

import java.util.*;


// [코테/JAVA] 스택/큐 : 올바른 괄호


public class Test_61 {

	
	
	class Solution {
	    /*
	     * Date: 2023-01-05
	     * Time: 22:13
	     */
	    boolean solution(String s) {
	        return srchProperBracket(s);
	    }
	 
	    /**
	     * 올바른괄호찾기
	     * @param s 괄호로 이루어진 문자열
	     * @return boolean 올바른 괄호 여부
	     */
	    public boolean srchProperBracket(String s) {
	        /*
	         * @Desc
	         * 1.String.split() 메소드로 문자열을 하나씩 자른다.
	         * 2.여는괄호('(')는 스택에 PUSH
	         * 3.닫는괄호(')')는 여는괄호가 스택에 TOP을 가리키고 있으면 괄호를 완성하면서 POP
	         * 4.그 외의 경우는 스택에 PUSH
	         * 5.스택의 길이를 체크해서 스택이 비어있으면(=모두 올바른 괄호) true를 리턴한다.
	         */
	        Stack<String> stack = new Stack<>();
	        for (String str: s.split("")) {
	            if ("(".equals(str))
	                stack.add(str);
	            else {
	                if (!stack.isEmpty() && "(".equals(stack.peek())) {
	                    stack.pop();
	                } else
	                    stack.add(str);
	            }
	        }
	        return stack.size() == 0 ? true: false;
	    }
	}
	
}
