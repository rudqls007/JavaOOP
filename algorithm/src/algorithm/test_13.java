package algorithm;

import java.util.Scanner;

public class test_13 {

	
public static void main(String[] args) {
	// Ư������ ���� ������

	  Scanner sc=new Scanner(System.in);
	    
	    String answer = sc.next();
	    
	    // �ܾ �߶� �迭�� �ֱ�
	    char[] arr = answer.toCharArray();
	    
	    int up = 0;
	    int dw = arr.length-1;
	    
		while (up < dw) {
			char upper = arr[up];
			char downer = arr[dw];
			
			// ���ڰ� �ҹ�������
			if (!Character.isAlphabetic(upper)) {
				up++;
				
				// ���ڰ� �빮������
			} else if (!Character.isAlphabetic(downer)) {
				dw--;
				
			} else {
				// ���ĺ��϶� ��ȯ
				char tmp = arr[up];
				arr[up] = arr[dw];
				arr[dw] = tmp;
				up++;
				dw--;
			}
		}

		// char[]�� String ����
		String change = String.valueOf(arr);
		System.out.println(change);

	}

}

