package pag2;

import pag1.MyParent;

class MyChild extends MyParent{
	public void printMembers() {
//		System.out.println(prv);	// 에러
//		System.out.println(dft);	// 에러
		System.out.println(prt);	// OK.		protected  같은 패키지 or 자손( 다른 패키지 )만 가능
		System.out.println(pub);	// OK.
	}
}
public class MyParentTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyParent p = new MyParent();
//		System.out.println(p.prv);	// 에러
//		System.out.println(p.dft);	// 에러
//		System.out.println(p.prt);	// 에러		 자손이 아니기 떄문에 에러.
		System.out.println(p.pub);	// OK.
		
	}

}
