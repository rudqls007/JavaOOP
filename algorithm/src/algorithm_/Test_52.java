package algorithm_;

public class Test_52 {

	
	class Solution {
	    /*
	    * 시작시간 : 21:32
	    * 종료시간 : 10:21
	    */
	    public String solution(int n) {
	        String answer = chck124(n);
	        return answer;
	    }
	    
	    public String chck124(int n) {
	        String answer = "";
	        
	        // 1. 1자릿수가 될때까지 반복
	        while (n > 0) {
	            String parsingNum = "";
	            int divideNum = n % 3;
	            n /= 3;
	            
	            // 2. 자릿수마다 3진법으로 변환 (0은 4로 변환)
	            switch (divideNum) {
	                case 0: 
	                        // 3. 3으로 나누어 떨어지는 경우, 자릿수 1개 감소
	                        n--;
	                        parsingNum = "4";
	                        break;
	                case 1:
	                        parsingNum = "1";
	                        break;
	                case 2:
	                        parsingNum = "2";
	                        break;
	            }
	            
	            // 4. 만들어지는 수는 앞자리에 붙여야 함
	            answer = parsingNum + answer;
	        }
	        return answer;
	    }
	}
	
}
