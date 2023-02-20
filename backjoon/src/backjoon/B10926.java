package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class B10926 {

	public static void main(String[] args) throws IOException {
		
		// Scanner
		Scanner sc = new Scanner(System.in);
		
		String lastString1 = "??!";
		
		String a = sc.next();
		
		System.out.println( a + lastString1);
		
		
		
		sc.close();
		
		
		
		// BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String lastString = "??!";
		
		String s = br.readLine();
		
		System.out.println( s + lastString);
	}
}