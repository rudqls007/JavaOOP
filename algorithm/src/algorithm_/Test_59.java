package algorithm_;

import java.util.HashMap;
import java.util.Map;



// [코테/JAVA] 2022 KAKAO TECH INTERNSHIP : 성격 유형 검사하기


public class Test_59 {
	
	
	class Solution {
	    public String solution(String[] survey, int[] choices) {
	        return chckPersonalityType(survey, choices);
	    }
	 
	    /**
	     * 성격유형검사하기
	     * @param survey 성격 유형
	     * @param choices 검사지
	     * return String타입의 성격 유형
	     */
	    public String chckPersonalityType(String[] survey, int[] choices) {
	        /*
	         * @Desc
	         * 1.검사지의 기준값을 구한다. (choice가 4일때 0점)
	         * 2.choice와 기준값을 비교한다.
	         * 3.0보다 작으면 성격 유형의 왼쪽유형의 점수로. 0보다 크면 성격 유형의 오른쪽유형의 점수로 분기처리한다.
	         * 4.map에 성격 유형별 점수를 담는다.
	         * 5.점수가 같을 경우 사전순으로 선택한다.
	         * 6.성격 유형을 STring타입으로 리턴한다.
	         */
	 
	        // Constants
	        int questionCnt = 7;
	        int base = (int)(questionCnt/2)+1;
	        String personalityType = "RTCFJMAN";
	 
	        // Instance
	        String answer = "";
	        Map<String, Integer> map = new HashMap<>();
	        for (String split: personalityType.split(""))
	            map.put(split, 0);
	 
	        for (int i=0; i<survey.length; i++) {
	            int score = choices[i] - base;
	            String type = "";
	            if (score >= 0)
	                type = survey[i].split("")[1];
	            else {
	                type = survey[i].split("")[0];
	                score *= -1;
	            }
	            map.put(type, map.get(type) + score);
	        }
	 
	        if (map.get("T") > map.get("R"))
	            answer += "T";
	        else
	            answer += "R";
	 
	        if (map.get("F") > map.get("C"))
	            answer += "F";
	        else
	            answer += "C";
	 
	        if (map.get("M") > map.get("J"))
	            answer += "M";
	        else
	            answer += "J";
	 
	        if (map.get("N") > map.get("A"))
	            answer += "N";
	        else
	            answer += "A";
	 
	        return answer;
	    }
	}


}
