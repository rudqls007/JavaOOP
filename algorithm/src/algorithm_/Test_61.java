package algorithm_;

import java.util.*;


// [����/JAVA] ����/ť : �ùٸ� ��ȣ


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
	     * �ùٸ���ȣã��
	     * @param s ��ȣ�� �̷���� ���ڿ�
	     * @return boolean �ùٸ� ��ȣ ����
	     */
	    public boolean srchProperBracket(String s) {
	        /*
	         * @Desc
	         * 1.String.split() �޼ҵ�� ���ڿ��� �ϳ��� �ڸ���.
	         * 2.���°�ȣ('(')�� ���ÿ� PUSH
	         * 3.�ݴ°�ȣ(')')�� ���°�ȣ�� ���ÿ� TOP�� ����Ű�� ������ ��ȣ�� �ϼ��ϸ鼭 POP
	         * 4.�� ���� ���� ���ÿ� PUSH
	         * 5.������ ���̸� üũ�ؼ� ������ ���������(=��� �ùٸ� ��ȣ) true�� �����Ѵ�.
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
