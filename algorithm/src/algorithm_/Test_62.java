package algorithm_;


// [����/JAVA] ���� �ڵ� ç���� ����2 : 2�� ���Ϸ� �ٸ� ��Ʈ


public class Test_62 {

	
	
	// Ǯ�� 1
	
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

	
	
	
	
	// Ǯ�� 2
	
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
