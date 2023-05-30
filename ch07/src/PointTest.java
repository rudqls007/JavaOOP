public class PointTest {
	public static void main(String[] args) {
		Point3D12 p = new Point3D12(1, 2, 3);
		System.out.println("x=" + p.x + ",y=" + p.y + ",z=" + p.z);
	}
}

class Point11 {
	int x, y;
	
	public Point11() {
		// TODO Auto-generated constructor stub
	}

	Point11(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Point3D12 extends Point11 {
	int z;

	Point3D12(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
}