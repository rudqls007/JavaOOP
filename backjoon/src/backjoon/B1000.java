package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class B1000 {

	public static void main(String[] args) throws IOException {
		
		
		
		/*
		 * 문자열 분리 방법에는 두 가지가 있다.
		 * 
		 * StringTokenizer 클래스를 이용하여 분리해주는 방법 split() 을 이용하는 방법 이 부분은 나중에 자세히 포스팅 하겠다만
		 * 
		 * 결론부터 말하자면 StringTokenizer 가 성능면에서 좋다. 그래서 단순 규칙으로 문자열을 분리해줄 때 필자는
		 * StringTokenizer을 애용한다.
		 * 
		 * 
		 * 
		 * StringTokenizer 또한 java.util 패키지에 있으므로 import 해준 다음 객체 생성을 해준다.
		 * 
		 * 
		 * 
		 * 객체 생성 할 때 StringTokenizer( "문자열" , 구분자 ); 을 해주면 된다.
		 * 
		 * 구분된 변수를 꺼낼 때는 차례대로 nextToken(); 을 해주면 문자열을 반환해준다.
		 * 
		 * 이때 반환시킨 문자열은 반환됨과 동시에 해당 객체에서 사라지게 된다.
		 * 
		 * 
		 * 
		 * 그리고 문자열을 반환했으니 Integer.parseInt()로 int 형으로 변환시켜준다.
		 * 
		 * 
		 */

		// BufferedReader를 활용한 방법

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// split(" ")으로 배열의 공백 단위로 나눠준 뒤 String 배열에 저장하는 방법.
		String[] str = br.readLine().split(" ");

		// 문자열을 반환했기 때문에 Integer.parseInt로 int형으로 형변환.
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);

		System.out.println(a + b);

		// StringTokenizer를 활용한 방법

		String str1 = br.readLine();
		StringTokenizer st = new StringTokenizer(str1, " ");
		int a1 = Integer.parseInt(st.nextToken());
		int b1 = Integer.parseInt(st.nextToken());

		System.out.println(a1 + b1);
		
		
		// Scanner를 활용한 방법

		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * int a = sc.nextInt(); int b = sc.nextInt();
		 * 
		 * System.out.println(a * b);
		 * 
		 * sc.close();
		 * 
		 * }
		 */

	}
}
