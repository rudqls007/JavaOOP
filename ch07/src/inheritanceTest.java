class MyPoint extends Object { // �����Ϸ��� ���� �⺻ ������ ������Ʈ �޼��带 ��� ����.
	int x;
	int y;
}


/*
 * class Circle extends MyPoint{ //��� int r;
 * 
 * }
 */

class Circle extends Object { // �����Ϸ��� ���� �⺻ ������ ������Ʈ �޼��带 ��� ����.
	MyPoint c = new MyPoint();	// ���������� �ʱ�ȭ
	int r;
}

public class inheritanceTest {

	public static void main(String[] args) {
		
		Circle c = new Circle();
		Circle c2 = new Circle();
		c.c.x = 1;
		c.c.y = 2;
		c.r = 3;
		System.out.println("c.c.x = " + c.c.x);
		System.out.println("c.c.y = " + c.c.y);
		System.out.println("c.r = " + c.r);
		
		
		// Object �޼���
		System.out.println(c.toString());
		System.out.println(c2.toString());
	}

}
