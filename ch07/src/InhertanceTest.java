class MyPoint{
	
	int x;
	int y;
}


//class Circle extends MyPoint {  // 상속
//	
//	int r;
//	
//}


class Circle {
	MyPoint p; // MyPoint p = new MyPoint(); 이게 맞음.
	
	int r;
	
	public Circle() {
		p = new MyPoint();
	}
}



public class InhertanceTest {

	
	public static void main(String[] args) {
		
		Circle circle = new Circle();
		circle.p.x = 1;
		circle.p.y = 2;
		circle.r = 3;
		
		System.out.println(circle.p.x);
		System.out.println(circle.p.y);
		System.out.println(circle.r);
		
	}
}
