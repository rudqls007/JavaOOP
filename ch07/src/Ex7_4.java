public class Ex7_4 {
	public static void main(String[] args) {
		Point3D p = new Point3D(1, 2, 3);
		System.out.println("x=" + p.x + ",y=" + p.y + ",z=" + p.z);
	}
}

class Point {
	int x, y;
	
	public Point() {
		// TODO Auto-generated constructor stub
	}

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Point3D extends Point {
	int z;

	Point3D(int x, int y, int z) {
		// super() 가 자동으로 컴파일 되고 있음,
		// 조상의 기본 생성자가 없을 떄 super(x,y)로 초기화가 맞음.
		this.x = x;
		this.y = y;
		this.z = z;
	}
}