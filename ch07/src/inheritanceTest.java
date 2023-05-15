class MyPoint extends Object { // 컴파일러의 의한 기본 값으로 오브젝트 메서드를 상속 받음.
	int x;
	int y;
}


/*
 * class Circle extends MyPoint{ //상속 int r;
 * 
 * }
 */

class Circle extends Object { // 컴파일러의 의한 기본 값으로 오브젝트 메서드를 상속 받음.
	MyPoint c = new MyPoint();	// 참조변수의 초기화
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
		
		
		// Object 메서드
		System.out.println(c.toString());
		System.out.println(c2.toString());
	}

}
