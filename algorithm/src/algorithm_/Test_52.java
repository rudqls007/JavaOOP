package algorithm_;

public class Test_52 {

	
	class Solution {
	    /*
	    * ���۽ð� : 21:32
	    * ����ð� : 10:21
	    */
	    public String solution(int n) {
	        String answer = chck124(n);
	        return answer;
	    }
	    
	    public String chck124(int n) {
	        String answer = "";
	        
	        // 1. 1�ڸ����� �ɶ����� �ݺ�
	        while (n > 0) {
	            String parsingNum = "";
	            int divideNum = n % 3;
	            n /= 3;
	            
	            // 2. �ڸ������� 3�������� ��ȯ (0�� 4�� ��ȯ)
	            switch (divideNum) {
	                case 0: 
	                        // 3. 3���� ������ �������� ���, �ڸ��� 1�� ����
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
	            
	            // 4. ��������� ���� ���ڸ��� �ٿ��� ��
	            answer = parsingNum + answer;
	        }
	        return answer;
	    }
	}
	
}
