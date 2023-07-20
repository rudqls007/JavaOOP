package algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
//
//�ִ� ����
//������ �ƺ��� �������� ��մϴ�. �����ƺ��� �������� N�� ������ �������� �ְ� ����
//�� K�� ������ �ִ� ������� ������ ���϶�� �߽��ϴ�.
//���� N=10�̰� 10�� ���� �������� �Ʒ��� �����ϴ�. �̶� K=3�̸� 
//12 15 11 20 25 10 20 19 13 15
//���ӵ� 3�ϰ��� �ִ� ������� 11+20+25=56�����Դϴ�.
//�������� ������ �����ּ���.
//�� �Է¼���
//ù �ٿ� N(5<=N<=100,000)�� K(2<=K<=N)�� �־����ϴ�.
//�� ��° �ٿ� N���� ���ڿ��� �־����ϴ�. �� ���ڴ� 500������ ���� �ƴ� �����Դϴ�.
//�� ��¼���
//ù �ٿ� �ִ� ������� ����մϴ�.
//�� �Է¿��� 1 
//10 3
//12 15 11 20 25 10 20 19 13 15
//�� ��¿��� 1
//56
public class test54 {	
    public static int sel(int arrSize, int selNum, int[] arr){	
    	
    	ArrayList<Integer>al =  new ArrayList<>();
    	int sum=0;
    	
		for (int i = 0; i<arrSize; i++) { // ������ ��¥��ŭ �ݺ��� ����
			
			for (int j = i; j < selNum+i; j++) { // ���ӵǴ� ��¥�� �ݺ��� ���� j�� i�� ���缭 ������
												 // �׿� ���� �ݸ��� ������ selNum+i ��ŭ ����
				// 0(�ݺ������� j) 1 2(����: selNum+i) / 1(�ݺ������� j) 2 3(����: selNum+i) / 2(�ݺ������� j) 3 4(����: selNum+i) 
				
				if(j<arr.length) { // j�� ����� �迭�� ũ�⺸�� ���� ��쿡�� 
				sum += arr[j]; // ���� �ݺ��� ���� j��ŭ arr �迭�� �ε��� ��ȣ�� ���� , sum �̶�� ������ ������
				
				}else {
					System.out.println("j������ ��:"+j);
				}
				
			}
			
			al.add(sum); // ���� �ݺ����� �����ϸ�  �ش� ���� al �̶�� ��̸���Ʈ�� ���ϰ�
			sum=0; // sum ���� �ʱ�ȭ
			
		}
		
		System.out.println(al);
		return Collections.max(al);	// ��� �ݺ��� ����Ǹ� ��̸���Ʈ�� ���� ū ���� ��ȯ 
    }
    
    
    
    
	public static void main(String[] args) {
		// 01 12 23 45
		// 012 234 456 678 89...
		
		Scanner sc = new Scanner(System.in);
		
		int arrSize = sc.nextInt();
		int selNum = sc.nextInt();
		int arr[] = new int[arrSize];
		
		for(int i=0; i<arrSize; i++) {
			int userNum = sc.nextInt();
			arr[i]=userNum;
		}
		
		 System.out.println(sel(arrSize, selNum, arr));
		 	
	}
}

