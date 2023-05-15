class MyPoint {
	int x;
	int y;
}


/*
 * class Circle extends MyPoint{ //»ó¼Ó int r;
 * 
 * }
 */

class Circle {
	MyPoint c = new MyPoint();
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
