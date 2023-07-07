package Fibonacci;

public class Main {

	public static void main(String[] args) {
		
		
		int[] arr = new int[100];
		
		//An = An-1 + An-2; n>=3
		//a1 = 1, a2 = 1
		
		arr[1] = 1;
		arr[2] = 1;
		
		for(int i=3; i<100; i++) {
			arr[i] = arr[i-1] + arr[i-2];
			// 3 = 2 + 1
			// arr[3] = 2
			// arr[4] = 2 + 1 = 3
			// arr[5] = 3 + 2 = 5
			// arr[6] = 5 + 3 = 8
		}
		
		for(int i=1; i<=10; i++) {
			System.out.print(arr[i]+ " ");
		}

		
		//2번쨰 방법.

		//An
		//An = An-1 + An-2; n>=3
		//a1 = 1, a2 = 1
		System.out.println();
		
		int prevPrevNum = 1; //An-2
		int preNum = 1;		//An-1
		System.out.print(prevPrevNum + " ");
		System.out.print(preNum + " ");
		
		for(int i=3; i<=10; i++) {
			int nNum = prevPrevNum + preNum;
			// 2 = 1 + 1
			// 3 = 1 + 2
			// 5 = 2 + 3
			System.out.print(nNum + " ");
			// 2
			// 3
			// 1 = 1
			// 2  = 2
			// 3  =  3
			prevPrevNum = preNum;
			preNum = nNum;
			// 3  = 3
			// 5 = 5
		}
		
	}
	
	

	

}
