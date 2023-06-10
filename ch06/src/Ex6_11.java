// 생성자 (constructor) = iv 초기화 메서드
/* 이름이 클래스 이름과 같아야 한다.
 * 리턴값이 없다. (void 안붙임)
 * 모든 클래스는 하나 이상의 생성자를 갖는다. */

// 기본 생성자 ( 매개변수가 없는 생성자, 생성자가 하나도 없을 떄만, 컴파일러가 자동 추가해 줌. )
/* 클래스이름(){}	기본 생성자 
 * Ex) Point() {} Point 클래스의 기본 생성자 
 * */



class Data_1 {
	int value;
	public Data_1() {
		// TODO Auto-generated constructor stub
	}// 기본 생성자를 추가해주어야 건강한 메서드 즉 코딩이 됨.
	
}	// 생성자가 없으므로 컴파일러가 기본 생성자를 자동으로 넣어줌.

class Data_2 {
	int value;
	
	public Data_2() {
		// TODO Auto-generated constructor stub
	}	// 기본 생성자를 넣어주면 오류가 생기지 않음.

	Data_2(int x) {   // 매개변수가 있는 생성자.
		value = x;
	}
}	// 생성자가 1개라도 있다면 기본생성자를 안 넣어줌.

class Ex6_11 {
	public static void main(String[] args) {
		Data_1 d1 = new Data_1();
		Data_2 d2 = new Data_2(); // compile error발생, 매개변수가 없는 기본생성자 호출
	}
}