package algorithm_;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


// [����/JAVA] �������� : �޸��� ����


public class Test_56 {

	
	class Solution {
	    public String[] solution(String[] players, String[] callings) {
	        return runningRace(players, callings);
	    }

	    /**
	     * �޸��� ����
	     * @param players �������� �̸��� 1����� ���� ��� ������� ��� ���ڿ� �迭
	     * @param callings �ؼ����� �θ� �̸��� ���� ���ڿ� �迭
	     * @return String[] ���ְ� ������ �� �������� �̸��� 1����� ��� ������� ���� �迭
	     */
	    public String[] runningRace(String[] players, String[] callings) {
	        /*
	         * @Desc
	         * 1.�����迭�� ����Ʈ�� ��ȯ
	         * 2.<����,�����̸�>, <�����̸�,����> 2���� LinkedHashMap ����
	         * 3.�ؼ����� �����̸��� �θ������� 2�� ���� ���� ����
	         * 4.value(����)�� �������� Map.sort
	         * 5.����Ʈ�� ���� �����̸��� �����迭�� ��ȯ �� ����
	         */
	        List<String> playersList = Arrays.asList(players);
	        List<String> callingsList = Arrays.asList(callings);
	        
	        Map<Integer, String> playersMap = new LinkedHashMap<>();
	        Map<String, Integer> resultMap = new LinkedHashMap<>();
	        List<String> answer = new ArrayList<>();

	        for (int i=0; i<playersList.size(); i++) {
	            resultMap.put(playersList.get(i), i);
	            playersMap.put(i, playersList.get(i));
	        }

	        callingsList.forEach(call -> {
	            resultMap.put(playersMap.get(resultMap.get(call)-1), resultMap.get(call));
	            resultMap.put(call, resultMap.get(call)-1);
	            playersMap.put(resultMap.get(call)+1, playersMap.get(resultMap.get(call)));
	            playersMap.put(resultMap.get(call), call);
	        });
	        
	        List<Map.Entry<String, Integer>> entryList = new LinkedList<>(resultMap.entrySet());
	        entryList.sort(Map.Entry.comparingByValue());
	        entryList.forEach(entry -> answer.add(entry.getKey()));

	        return answer.toArray(new String[answer.size()]);
	    }
	}
	
}
