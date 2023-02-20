package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class B18108 {

	public static void main(String[] args) throws IOException {
		
		
		Scanner sc = new Scanner(System.in);
		
		int year1 = sc.nextInt();
		
		System.out.println(year1 - 543);
		
		
		sc.close();
		
		
		
		// BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 문자열로 반환
		String s = br.readLine();
		
		int year = Integer.parseInt(s);
		
		System.out.println(year - 543 );
		
	}
	
	
}
