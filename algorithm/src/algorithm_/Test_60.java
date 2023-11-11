package algorithm_;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


// [����/JAVA] 2023 KAKAO BLIND RECRUITMENT : �������� ���� ��ȿ�Ⱓ


public class Test_60 {

	
	class Solution {
	    public int[] solution(String today, String[] terms, String[] privacies) {
	        return personalInfoCollectionExpireDate(today, terms, privacies);
	    }
	 
	    /**
	     * ��������������ȿ�Ⱓ
	     * @param today �¸� ��¥
	     * @param terms ��� ����
	     * @privacies �������� ����
	     * @return �ı��ؾ� �� ���������� ��ȣ
	     */
	    public  int[] personalInfoCollectionExpireDate(String today, String[] terms, String[] privacies) {
	        /*
	         * @Desc
	         * 1.��������� Map���� �����Ѵ�.
	         * 2.privacies�� ���ڿ� ��� ���� Map�� ��� ��ȿ ���� ���� ���Ѵ�.
	         * 3.Calendar, Date ��ü�� ����� ��ȿ �Ⱓ�� �������� üũ�Ѵ�.
	         * 4.����� �������� ���� �迭�� �ε����� +1�� �� ��, �����迭�� ��� �����Ѵ�.
	         */
	 
	        // Instance
	        Map<String, Integer> termMap = new HashMap<>();
	        List<Integer> list = new ArrayList<>();
	 
	        for (String str: terms) {
	            String[] split = str.split(" ");
	            termMap.put(split[0], Integer.parseInt(split[1]));
	        }
	        for (int i=0; i<privacies.length; i++) {
	            String str = privacies[i];
	            String[] split = str.split(" ");
	            int year = Integer.parseInt(split[0].split("[.]")[0]);
	            int month = Integer.parseInt(split[0].split("[.]")[1]);
	            int date = Integer.parseInt(split[0].split("[.]")[2]);
	            Calendar calendar = Calendar.getInstance();
	            calendar.set(year, month-1, date);
	            calendar.add(Calendar.MONTH, termMap.get(split[1]));
	 
	            Calendar toDateCalendar = Calendar.getInstance();
	            String[] todaySplit = today.split("[.]");
	            toDateCalendar.set(Integer.parseInt(todaySplit[0]),Integer.parseInt(todaySplit[1])-1,Integer.parseInt(todaySplit[2]));
	            boolean expireYn = toDateCalendar.getTimeInMillis() - calendar.getTimeInMillis() >= 0 ? true : false;
	 
	            if (expireYn)
	                list.add(i+1);
	        }
	 
	        // Output Instance
	        int[] answer = new int[list.size()];
	        for (int i=0; i<list.size(); i++)
	            answer[i] = list.get(i);
	        return answer;
	    }
	}

	
}
