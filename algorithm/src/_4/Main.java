package _4;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		
		
		// 첫번쟤 방법
		int inputNum = 19;
		int[] bin = new int[100];
		
		
		/**
		 * 
		 * 
		 * 19 / 2 9 .. 1
		 * 9 /  2 4 .. 1
		 * 4 /  2 2 .. 0
		 * 2 /  2 1 .. 0
		 * 1 /  2 0 .. 1
		 * 
		 *  010011 => 19
		 *  
		 * */
		
		
		int i = 0;
		int mok = inputNum;
		
		while (mok > 0)  {
			//bin[0] = 19 / 2 =  1
			//bin[1] = 9 / 2  = 1
			//bin[2] = 4 / 2 = 0
			//bin[3] = 2 / 2 = 0
			//bin[4] = 1 / 2 = 1
			//bin[5] = 0 / 2 = 0
			bin[i] = mok % 2;
			// 9
			// 4
			// 2
			// 1
			// 0
			mok /= 2;
			// +
			i++;
			
		}
		
		// bin[5] - 1 = bin[4]
		i--;
		
		for(; i>=0; i--) {
			//bin[4] = 1
			//bin[3] = 1
			//bin[2] = 0
			//bin[1] = 0
			//bin[0] = 1			
			System.out.print(bin[i]);
		}
		
		
		System.out.println();
		
		
		// Stack 을 이용한 두번째 방법
		Stack<Integer> st = new Stack<Integer>();

		int input = 19;

		int[] arr = new int[10];

		while (input != 0) {
			// 19 % 2 = 1
			// 9 % 2 = 1
			// 4 % 2 = 0
			// 2 % 2 = 0
			// 1 % 2 = 1
			st.push(input % 2);		// stack.push == 데이터 추가하기
			// 9 =  19 / 2
			// 4 =  9 / 2
			// 2 =  4 / 2 
			// 1  =  2 / 2
			// 0   =  1 / 2
			input = input / 2;
		}
		while (!st.isEmpty()) {
			System.out.print(st.pop() + "");	 // stack.pop == 데이터 꺼내기, 가져오기
		}
	}

}
