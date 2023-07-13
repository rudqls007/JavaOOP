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
	int main() {
	    int N = 5, S = 12;
	    int A[] = {1,2,3,7,5};

	    int start = 0, end = 0, sum = A[0];
	    while (end < N) {
	        if (sum < S) {
	            end++;
	            sum += A[end];
	        } else if (sum > S) {
	            sum -= A[start];
	            start++;
	        } else {
	            System.out.printf("%d %d\n", start+1, end+1);
	            break;
	        }
	    }
	    return 0;
	}
	
	
	
	
	
	
	
	
}
