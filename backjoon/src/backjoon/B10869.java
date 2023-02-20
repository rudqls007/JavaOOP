package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class B10869 {

	public static void main(String[] args) throws IOException {
		
		
		//BUfferedReader를 활용한 방법
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(" ");
		
		int a1 = Integer.parseInt(str[0]);
		int b1 = Integer.parseInt(str[1]);
		
		
		System.out.println(a1 + b1);
		System.out.println(a1 - b1);
		System.out.println(a1 * b1);
		System.out.println(a1 / b1);
		System.out.println(a1 % b1);
		
		
		// StringTokenizer를 활용한 방법.
		String str1 = br.readLine();
		
		StringTokenizer st = new StringTokenizer(str1, " ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		System.out.println(A+B);
		System.out.println(A-B);
		System.out.println(A*B);
		System.out.println(A/B);
		System.out.println(A%B);
		

	}
}
