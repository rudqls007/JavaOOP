package algorithm_;

import java.util.ArrayList;
import java.util.Scanner;

public class Test_18 {

	public static void main(String[] args) {
		
//		▣ 입력예제 1 
//		10
//		▣ 출력예제 1
//		1 1 2 3 5 8 13 21 34 55
		
	// 1: 1 
	// 2: 1 + 0 = 1    
	// 3: 1 + 1 = 2
	// 4: 1 + 2 = 3
	// 5: 2 + 3 = 5
	// 6: 3 + 5 = 8
	// 7: 5 + 8 = 13
	// 8: 8 + 13 = 21
	// 9: 13 + 21 = 34
	//10: 21 + 34 = 55
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
			int a1 = 1;
	        int a2 = 1;
	        int a3;
	        
	        System.out.println(a1);
	        System.out.println(a2);
		
		  for(int i=1; i<num-1; i++){
	            a3=a1+a2;
	            System.out.println(a3);
	            a1=a2;
	            a2=a3;
	        }        		
	}
		
}

