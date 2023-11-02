package algorithm_;

/* 

��������

124 ���� �ֽ��ϴ�. 124 ���󿡼��� 10������ �ƴ� ������ ���� �ڽŵ鸸�� ��Ģ���� ���� ǥ���մϴ�.
124 ���󿡴� �ڿ����� �����մϴ�.
124 ���󿡴� ��� ���� ǥ���� �� 1, 2, 4�� ����մϴ�.
���� �� 124 ���󿡼� ����ϴ� ���ڴ� ������ ���� ��ȯ�˴ϴ�.
���ѻ���
n�� 500,000,000������ �ڿ��� �Դϴ�.
�ڿ��� n�� �Ű������� �־��� ��, n�� 124 ���󿡼� ����ϴ� ���ڷ� �ٲ� ���� return �ϵ��� solution �Լ��� �ϼ��� �ּ���.

*/


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
