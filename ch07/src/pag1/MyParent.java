package pag1;

public class MyParent{	// 접근제어자가 default ( 같은 패키지만 사용 가능 ) 
	
	private 	int prv;		// 같은 클래스
				int dft;		// 같은 패키지 
	protected 	int prt;		// 같은 패키지 + 자손 ( 다른 패키지 )
	public 		int pub;		// 접근제한 없음.

	
	public void printMembers(){
		System.out.println(prv);
		System.out.println(dft);
		System.out.println(prt);
		System.out.println(pub);
	}
}

class MyParentTest {

	public static void main(String[] args) {

		MyParent p = new MyParent();
		// System.out.println(p.prv);		// 에러. ( 같은 클래스만 가능)
		System.out.println(p.dft);		// OK
		System.out.println(p.prt);		// OK
		System.out.println(p.pub);		// OK
	}

}
