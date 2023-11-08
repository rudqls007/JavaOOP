package algorithm_;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;



// [����/JAVA] ���α׷��ӽ� : ��������


public class Test_57 {

	
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
	     * ����Ž��
	     * ����Ž���� ����� ��� ������ ����� ���� ã�� HashSet�� �����Ѵ�.
	     * @param word ���յ� ����
	     * @param Ž��Ƚ��
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
