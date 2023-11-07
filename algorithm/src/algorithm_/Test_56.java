package algorithm_;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


// [코테/JAVA] 연습문제 : 달리기 경주


public class Test_56 {

	
	class Solution {
	    public String[] solution(String[] players, String[] callings) {
	        return runningRace(players, callings);
	    }

	    /**
	     * 달리기 경주
	     * @param players 선수들의 이름이 1등부터 현재 등수 순서대로 담긴 문자열 배열
	     * @param callings 해설진이 부른 이름을 담은 문자열 배열
	     * @return String[] 경주가 끝났을 때 선수들의 이름을 1등부터 등수 순서대로 담은 배열
	     */
	    public String[] runningRace(String[] players, String[] callings) {
	        /*
	         * @Desc
	         * 1.고정배열을 리스트로 변환
	         * 2.<순위,선수이름>, <선수이름,순위> 2개의 LinkedHashMap 선언
	         * 3.해설진이 선수이름을 부를때마다 2개 맵의 값을 변경
	         * 4.value(순위)를 기준으로 Map.sort
	         * 5.리스트에 담은 선수이름을 고정배열로 변환 후 리턴
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
