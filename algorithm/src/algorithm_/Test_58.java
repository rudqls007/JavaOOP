package algorithm_;


//  [코테/JAVA] 프로그래머스 : 덧칠하기

public class Test_58 {

	
	class Solution {
	    public int solution(int n, int m, int[] section) {
	        return this.doOver(n, m, section);
	    }

	    public int doOver(int n, int m, int[] section) {
	        /*
	         * @Desc
	         * 1.덧칠이 필요한 구역(section.element)이 마지막으로 덧칠된 구역(doOver)보다 크면 덧칠이 되지 않은 것으로 간주
	         * 2.sIdx+롤러의 길이(m)보다 작은 구역은 한 번에 칠해지는 것으로 간주
	         * 3.덧칠이 필요한 구역을 덧칠할때마다 doOver의 값을 초기화
	         * 4.마지막으로 덧칠된 구역 = 롤러의길이-1 
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
