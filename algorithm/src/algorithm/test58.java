package algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class test58 {

	public static void main(String[] args) {
		// 130 135 148 140 145 150 150 153 
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>();
		ArrayList<Integer> print = new ArrayList<>();
		int i = 0;
		int j = 0;
		
		System.out.print("ÇÐ»ý ¼ö>>");
		int  forNum = sc.nextInt();
		
		for (j=0 ; j<forNum ; j++) {

			int arrNum = sc.nextInt();
			al.add(arrNum);

			if (arrNum > al.get(i)) {
				print.add(arrNum);
				
				if(j==forNum-1) {
				System.out.println(print.size());
				}
				
				i++;
			} else if (arrNum < al.get(i)) {
				al.remove(i);
			}
			
		}
	}
	
}

