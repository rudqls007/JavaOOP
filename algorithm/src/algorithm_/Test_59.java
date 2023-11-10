package algorithm_;

import java.util.HashMap;
import java.util.Map;



// [����/JAVA] 2022 KAKAO TECH INTERNSHIP : ���� ���� �˻��ϱ�


public class Test_59 {
	
	
	class Solution {
	    public String solution(String[] survey, int[] choices) {
	        return chckPersonalityType(survey, choices);
	    }
	 
	    /**
	     * ���������˻��ϱ�
	     * @param survey ���� ����
	     * @param choices �˻���
	     * return StringŸ���� ���� ����
	     */
	    public String chckPersonalityType(String[] survey, int[] choices) {
	        /*
	         * @Desc
	         * 1.�˻����� ���ذ��� ���Ѵ�. (choice�� 4�϶� 0��)
	         * 2.choice�� ���ذ��� ���Ѵ�.
	         * 3.0���� ������ ���� ������ ���������� ������. 0���� ũ�� ���� ������ ������������ ������ �б�ó���Ѵ�.
	         * 4.map�� ���� ������ ������ ��´�.
	         * 5.������ ���� ��� ���������� �����Ѵ�.
	         * 6.���� ������ STringŸ������ �����Ѵ�.
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
