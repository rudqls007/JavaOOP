package algorithm_;


//  [����/JAVA] ���α׷��ӽ� : ��ĥ�ϱ�

public class Test_58 {

	
	class Solution {
	    public int solution(int n, int m, int[] section) {
	        return this.doOver(n, m, section);
	    }

	    public int doOver(int n, int m, int[] section) {
	        /*
	         * @Desc
	         * 1.��ĥ�� �ʿ��� ����(section.element)�� ���������� ��ĥ�� ����(doOver)���� ũ�� ��ĥ�� ���� ���� ������ ����
	         * 2.sIdx+�ѷ��� ����(m)���� ���� ������ �� ���� ĥ������ ������ ����
	         * 3.��ĥ�� �ʿ��� ������ ��ĥ�Ҷ����� doOver�� ���� �ʱ�ȭ
	         * 4.���������� ��ĥ�� ���� = �ѷ��Ǳ���-1 
	         */
	        int doOverCnt = 0;
	        int doOver = 0;
	        for (int sec: section) {
	            if (sec > doOver) {
	                doOverCnt++;
	                doOver = sec + m -1;
	            }
	        }
	        return doOverCnt;
	    }
	}
	
}
