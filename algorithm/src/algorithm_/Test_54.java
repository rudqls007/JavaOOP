package algorithm_;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;


// 모음사전 예제

// 1) 완전탐색을 사용해 조합될 수 있는 모든 모음의 경우의 수를 찾은 후 HashSet에 저장한다.
// 2) 저장된 HashSet을 오름차순으로 정렬한 후, word가 몇 번째 순서인지 리턴한다.

public class Test_54 {

	
	class Solution {
	    public Set<String> set = new HashSet<>();
	    public int solution(String word) {
	        dfs("", 0);

	        return set
	            .stream()
	            .sorted()
	            .collect(Collectors.toList())
	            .indexOf(word)+1;
	    }

	    /*
	     * 완전탐색
	     * 완전탐색을 사용해 모든 모음의 경우의 수를 찾아 HashSet에 저장한다.
	     * @param word 조합된 모음
	     * @param 탐색횟수
	     */
	    public void dfs(String word, int loop) {
	        String[] chars = {"A","E","I","O","U"};
	        if (loop == 5) {
	            Stream
	                .of(word)
	                .filter(el->!"".equals(el))
	                .forEach(set::add);
	            return;
	        }

	        Arrays
	            .stream(chars)
	            .forEach(el->{
	                dfs(word+el, loop+1);
	                dfs(word, loop+1);
	            });
	    }
	}
	
}
