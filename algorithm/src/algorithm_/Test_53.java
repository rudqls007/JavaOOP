package algorithm_;



/* 
 * 뒤에 있는 큰 수
 * 
 * 잡근 방법 
 * 
 * 1) 2중 반복문
 * 2) Stack 
 * 
 * */
public class Test_53 {

	
	class Solution {
	    public int[] solution(int[] numbers) {
	        int[] answer = {};
	        return findBigNumberThanBack(numbers);
	    }

	    public int[] findBigNumberThanBack(int[] numbers) {
	        int[] output = new int[numbers.length];
	        for (int i=0; i<numbers.length; i++) {
	            if (i+1 == numbers.length) {
	                output[i] = -1;
	                break;
	            }
	            for (int j=i+1; j<numbers.length; j++) {
	                output[i] = -1;
	                if (numbers[j] > numbers[i]) {
	                    output[i] = numbers[j];
	                    break;
	                }
	            }
	        }
	        return output;
	    }
	}
	
}
