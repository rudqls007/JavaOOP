package algorithm_;

import java.util.ArrayList;
import java.util.List;

public class Test_55 {

	
// �ڹ� ���� ���� ( ���� ��å )

class Solution {
	    public int[] solution(String[] park, String[] routes) {
	        return walkInThePark(park, routes);
	    }

	    public int[] walkInThePark(String[] park, String[] routes) {
	        /*
	         * @Desc
	         * 1.2�����迭(map)�� ����� ������ �� �ִ��� ���θ� ����
	         * 2.���� ��ġ�� �ε����� ������ ����(wIdx, hIdx)
	         * 3.����� �Ÿ���ŭ �ε����� �̵����� �� �������� ���θ� üũ
	         * 4.�ε��� �̵��� �����ϴٸ� ���� ��ġ�� ������ ����
	         * �����迭�� ����
	         */
	        int wIdx = 0, hIdx = 0;
	        int[][] map = new int[park.length][park[0].length()];
	        for (int i=0; i<park.length; i++) {
	            String[] parkSplit = park[i].split("");
	            for (int j=0; j<parkSplit.length; j++) {
	                String section = parkSplit[j];
	                wIdx = "S".equals(section) ? i : wIdx;
	                hIdx = "S".equals(section) ? j : hIdx;
	                map[i][j] = "X".equals(section) ? 1 : 0;
	            }
	        }

	        for (String route: routes) {
	            String[] routeSplit = route.split(" ");
	            String vector = routeSplit[0];
	            int distance = Integer.parseInt(routeSplit[1]);

	            for (int i=1; i<=distance; i++) {
	                int tmpWidx = wIdx;
	                int tmpHidx = hIdx;
	                switch(vector) {
	                    case "E": tmpHidx+=i; break;
	                    case "W": tmpHidx-=i; break;
	                    case "S": tmpWidx+=i; break;
	                    case "N": tmpWidx-=i; break;
	                }
	                if (tmpWidx<0 || tmpWidx>=park.length)
	                    break;
	                else if (tmpHidx<0 || tmpHidx>=park[0].length())
	                    break;
	                else if (map[tmpWidx][tmpHidx] == 1)
	                    break;
	            
	                if (Math.sqrt(Math.pow(wIdx-tmpWidx, 2) + Math.pow(hIdx-tmpHidx, 2)) == distance) {
	                    wIdx = tmpWidx;
	                    hIdx = tmpHidx;
	                }
	            }
	        }
	        List<Integer> list = new ArrayList<>();
	        list.add(wIdx);
	        list.add(hIdx);
	        return list.stream().mapToInt(i->i).toArray();
	    }
	}
	
	
}
