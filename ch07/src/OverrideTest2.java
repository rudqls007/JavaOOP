class MyPoint0 extends Object{
	int x;
	int y;
	
	public MyPoint0(int x,  int y) {
		this.x = x;
		this.y = y;
	}
	 
	public String toString() {
		return "x:"+ x + ", y :" + y;
	}
}

	
public class OverrideTest2 {

	public static void main(String[] args) {

		MyPoint0 p = new MyPoint0(4,5);
//		p.x = 3;
//		p.y = 5;
		
		System.out.println(p);
	}

}
