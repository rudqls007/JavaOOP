package algorithm_;


// [코테/JAVA] 월간 코드 챌린지 시즌2 : 2개 이하로 다른 비트


public class Test_62 {

	
	
	// 풀이 1
	
	class Solution {
	    public long[] solution(long[] numbers) {
	        return findNumberByBit(numbers);
	    }
	 
	    public long[] findNumberByBit(long[] numbers) {
	        // Output Instance
	        long[] output = new long[numbers.length];
	        
	        for (int i = 0; i < numbers.length; i++) {
	            long number = numbers[i];
	            long tmp = number;
	            int cnt = 0;
	            
	            while (tmp > 0) {
	                if(tmp%2 == 0)
	                    break;
	                tmp /= 2;
	                cnt++;
	            }
	 
	            if (cnt == 0)
	                number++;
	            else 
	                number = number + (long)Math.pow(2, cnt) - (long)Math.pow(2, cnt-1);
	            
	            output[i] = number;
	        }
	        return output;
	    }
	}

	
	
	
	
	// 풀이 2
	
	class Solution2 {
	    public long[] solution(long[] numbers) {
	        return findNumberByBit(numbers);
	    }
	 
	    public long[] findNumberByBit(long[] numbers) {
	        // Output Instance
	        long[] output = new long[numbers.length];
	        
	        for (int i = 0; i < numbers.length; i++) {
	            long number = numbers[i];
	            long tmp = number;
	            int cnt = 0;
	            
	            while (tmp > 0) {
	                if(tmp%2 == 0)
	                    break;
	                tmp /= 2;
	                cnt++;
	            }
	 
	            if (cnt == 0)
	                number++;
	            else 
	                number = number + (long)Math.pow(2, cnt) - (long)Math.pow(2, cnt-1);
	            
	            output[i] = number;
	        }
	        return output;
	    }
	}


	/* https://limreus.tistory.com/153  */
	
	
}
