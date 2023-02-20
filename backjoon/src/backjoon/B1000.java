package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class B1000 {

	public static void main(String[] args) throws IOException {
		
		
		
		/*
		 * ���ڿ� �и� ������� �� ������ �ִ�.
		 * 
		 * StringTokenizer Ŭ������ �̿��Ͽ� �и����ִ� ��� split() �� �̿��ϴ� ��� �� �κ��� ���߿� �ڼ��� ������ �ϰڴٸ�
		 * 
		 * ��к��� �����ڸ� StringTokenizer �� ���ɸ鿡�� ����. �׷��� �ܼ� ��Ģ���� ���ڿ��� �и����� �� ���ڴ�
		 * StringTokenizer�� �ֿ��Ѵ�.
		 * 
		 * 
		 * 
		 * StringTokenizer ���� java.util ��Ű���� �����Ƿ� import ���� ���� ��ü ������ ���ش�.
		 * 
		 * 
		 * 
		 * ��ü ���� �� �� StringTokenizer( "���ڿ�" , ������ ); �� ���ָ� �ȴ�.
		 * 
		 * ���е� ������ ���� ���� ���ʴ�� nextToken(); �� ���ָ� ���ڿ��� ��ȯ���ش�.
		 * 
		 * �̶� ��ȯ��Ų ���ڿ��� ��ȯ�ʰ� ���ÿ� �ش� ��ü���� ������� �ȴ�.
		 * 
		 * 
		 * 
		 * �׸��� ���ڿ��� ��ȯ������ Integer.parseInt()�� int ������ ��ȯ�����ش�.
		 * 
		 * 
		 */

		// BufferedReader�� Ȱ���� ���

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// split(" ")���� �迭�� ���� ������ ������ �� String �迭�� �����ϴ� ���.
		String[] str = br.readLine().split(" ");

		// ���ڿ��� ��ȯ�߱� ������ Integer.parseInt�� int������ ����ȯ.
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);

		System.out.println(a + b);

		// StringTokenizer�� Ȱ���� ���

		String str1 = br.readLine();
		StringTokenizer st = new StringTokenizer(str1, " ");
		int a1 = Integer.parseInt(st.nextToken());
		int b1 = Integer.parseInt(st.nextToken());

		System.out.println(a1 + b1);
		
		
		// Scanner�� Ȱ���� ���

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
