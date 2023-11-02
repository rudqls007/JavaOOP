package algorithm_;

/* 

문제설명

124 나라가 있습니다. 124 나라에서는 10진법이 아닌 다음과 같은 자신들만의 규칙으로 수를 표현합니다.
124 나라에는 자연수만 존재합니다.
124 나라에는 모든 수를 표현할 때 1, 2, 4만 사용합니다.
예를 들어서 124 나라에서 사용하는 숫자는 다음과 같이 변환됩니다.
제한사항
n은 500,000,000이하의 자연수 입니다.
자연수 n이 매개변수로 주어질 때, n을 124 나라에서 사용하는 숫자로 바꾼 값을 return 하도록 solution 함수를 완성해 주세요.

*/


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
