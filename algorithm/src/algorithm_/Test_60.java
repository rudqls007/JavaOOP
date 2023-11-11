package algorithm_;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


// [코테/JAVA] 2023 KAKAO BLIND RECRUITMENT : 개인정보 수집 유효기간


public class Test_60 {

	
	class Solution {
	    public int[] solution(String today, String[] terms, String[] privacies) {
	        return personalInfoCollectionExpireDate(today, terms, privacies);
	    }
	 
	    /**
	     * 개인정보수집유효기간
	     * @param today 온르 날짜
	     * @param terms 약관 정보
	     * @privacies 개인정보 수집
	     * @return 파기해야 할 개인정보의 번호
	     */
	    public  int[] personalInfoCollectionExpireDate(String today, String[] terms, String[] privacies) {
	        /*
	         * @Desc
	         * 1.약관정보를 Map으로 관리한다.
	         * 2.privacies의 일자에 약관 정보 Map에 담긴 유효 개월 수를 더한다.
	         * 3.Calendar, Date 객체를 사용해 유효 기간이 지났는지 체크한다.
	         * 4.만료된 개인정보 수집 배열의 인덱스에 +1을 한 뒤, 고정배열에 담아 리턴한다.
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
