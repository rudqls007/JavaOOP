package _5;

public class Main {
	public static void main(String[] args) {
		
		String input = "helloworlD";
		char []arr;
		arr= input.toCharArray();
		
		System.out.println(arr);
		System.out.println();
		
		for(int i=0; i<arr.length; i++ ) {
			if(arr[i] >= 'a' && arr[i] <= 'z') {
				arr[i] = (char)(arr[i] + ('A'-'a'));	// 'a' 'b' ~ 'z' 'A' 'B' ~ 'Z'
				
				
			}else if(arr[i] >= 'A' && arr[i] <= 'Z') {
					arr[i] = (char)(arr[i] - ('A' - 'a'));
			}
		}
		
		System.out.println(arr);
		
	}
	
}
