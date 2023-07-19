package algorithm;

import java.util.*;

class test53 {
//	���� ���ϱ�
//	���� �ձ��� �̿� ���� �ܵ��� ���ְ� ������ �������� ���������ϴ�. 
//	���� �ձ����� ���ڰ� N���� �ִµ� ���� ���ָ� ���Ϸ� ���ڴٰ� �մϴ�. �����ձ��� ���� 
//	������ ���� ������� ���ָ� ���Ϸ� �� ���ڸ� �����ϱ�� �߽��ϴ�.
//	���� ���ڵ��� ���� ������ 1������ N������ ���ʷ� ��ȣ�� �ű��. �׸��� 1�� ���ں��� N
//	�� ���ڱ��� ������� �ð� �������� ���ư��� ���׶��� �ɰ� �Ѵ�. �׸��� 1�� ���ں��� ��
//	��������� ���ư��� 1���� �����Ͽ� ��ȣ�� ��ġ�� �Ѵ�. �� ���ڰ� K(Ư������)�� ��ġ�� �� 
//	���ڴ� ���ָ� ���Ϸ� ���µ��� ���ܵǰ� �� ������ ������ �ȴ�. �׸��� ���� ���ں��� �ٽ� 
//	1���� �����Ͽ� ��ȣ�� ��ģ��.
//	�̷��� �ؼ� ���������� ���� ���ڰ� ���ָ� ���Ϸ� �� �� �ִ�.
//	1
//	8 2
//	7 3
//	6
//	5
//	4
//	���� ��� �� 8���� ���ڰ� �ְ�, 3�� ��ģ ���ڰ� ���ܵȴٰ� ����. ó������ 3�� ���ڰ� 3
//	�� ���� ���ܵȴ�. �̾� 6, 1, 5, 2, 8, 4�� ���ڰ� ���ʴ�� ���ܵǰ� ���������� ���� �� 7
//	�� ���ڿ��� ���ָ� ���Ϸ����ϴ�.
//	N�� K�� �־��� �� ���ָ� ���Ϸ� �� ������ ��ȣ�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//	�� �Է¼���
//	ù �ٿ� �ڿ��� N(5<=N<=1,000)�� K(2<=K<=9)�� �־�����.
//	�� ��¼���
//	ù �ٿ� ������ ���� ������ ��ȣ�� ����մϴ�.
//	�� �Է¿��� 1 
//	8 3
//	�� ��¿��� 1
//	7

	public static int solution(int prince, int n) {

		int answer = 0;
		// [1] ť ����
		Queue<Integer> testqueue = new LinkedList<>();
		Queue<Integer> queue = new LinkedList<>();

		// [2] ť�� ����
		for (int i = 1; i <= prince; i++) {
			queue.add(i);
			testqueue.add(i);

			System.out.println(queue);
		}

		System.out.println("---------------");

		// [3] ������ ���� ����
		for (int j = 1; j < n; j++) {
			testqueue.add(testqueue.poll());
			System.out.println(testqueue);
		}
		testqueue.poll();
		System.out.println(testqueue);

		System.out.println("---------------");

		
		// [4] ���ָ� ���غ���
		while (queue.size() != 1) {

			for (int j = 1; j < n; j++) {
				queue.add(queue.poll());

			}

			queue.poll();
			System.out.println(queue);
		}

		System.out.println("---------------");

		// [5] �� ������
		System.out.println(queue);
		answer = queue.poll();

		return answer;

	}

	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int prince = sc.nextInt();
		int n = sc.nextInt();
		System.out.println(solution(prince, n));

	}
}
