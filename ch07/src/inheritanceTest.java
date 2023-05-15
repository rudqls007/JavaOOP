class MyPoint {
	int x;
	int y;
}


/*
 * class Circle extends MyPoint{ //상속 int r;
 * 
 * }
 */

class Circle {
	MyPoint c = new MyPoint();	// 참조변수의 초기화
	int r;
}

public class inheritanceTest {

	public static void main(String[] args) {
		
		Circle c = new Circle();
		c.c.x = 1;
		c.c.y = 2;
		c.r = 3;
		System.out.println("c.c.x = " + c.c.x);
		System.out.println("c.c.y = " + c.c.y);
		System.out.println("c.r = " + c.r);
	}

}
