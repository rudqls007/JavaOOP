package Fibonacci;

public class Main1 {

	public static void main(String[] args) {
	
		//An = An-1 + An-2 n = 3
		
		// 첫번쨰 방법 - 배열
		int[] arr =  new int[100];
		
		arr[1] = 1;
		arr[2] = 1;
		
		for(int i=3; i<100; i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		
		for(int i=1; i<=10; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		// 두번째 방법 - 배열 없이
		
		int prev_prev_num = 1;
		int prev_num = 1;
		System.out.print(prev_prev_num + " ");
		System.out.print
		(prev_num + " ");
		
		for(int i=1; i<=10; i++) {
			int nNum = prev_prev_num + prev_num;
			System.out.print(nNum + " ");

			prev_prev_num = prev_num;
			prev_num = nNum;
		}
		
		
	
	
	
	}
	
	
	

}
