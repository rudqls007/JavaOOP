package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class B3003 {

	public static void main(String[] args) throws IOException {

		// Scanner
		
		Scanner in = new Scanner(System.in);
		
		int king = 1;
		int queen = 1;
		int rook = 2;
		int bishop = 2;
		int knight = 2;
		int pawn = 8;
 
		king = king - in.nextInt();
		queen = queen - in.nextInt();
		rook = rook - in.nextInt();
		bishop = bishop - in.nextInt();
		knight = knight - in.nextInt();
		pawn = pawn - in.nextInt();
 
		// 참고로 출력형식을 보면 각 변수들사이에 공백으로 구분 된한 줄로 출력해야한다.
		// 즉, 개행(줄바꿈)이 발생하는 println을 쓰면 안된다.
		System.out.print(king + " ");
		System.out.print(queen + " ");
		System.out.print(rook + " ");
		System.out.print(bishop + " ");
		System.out.print(knight + " ");
		System.out.print(pawn);		
		
		
		
		// BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int king1 = 1;

		int queen1 = 1;

		int rook1 = 2;

		int bishop1 = 2;

		int knight1 = 2;

		int pawn1 = 8;

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		king1 = king1 - Integer.parseInt(st.nextToken());
		queen1 = queen1 - Integer.parseInt(st.nextToken());
		rook1 = rook1 - Integer.parseInt(st.nextToken());
		bishop1 = bishop1 - Integer.parseInt(st.nextToken());
		knight1 = knight1 - Integer.parseInt(st.nextToken());
		pawn1 = pawn1 - Integer.parseInt(st.nextToken());
		
		System.out.print(king1 + " ");
		System.out.print(queen1 + " ");
		System.out.print(rook1 + " ");
		System.out.print(bishop1 + " ");
		System.out.print(knight1 + " ");
		System.out.print(pawn1 + " ");	

	}

}
