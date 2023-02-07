class Data { int x; }

class Ex6_6 {
	public static void main(String[] args) {
		Data d = new Data();						// 객체 생성
		d.x = 10;
		System.out.println("main() : x = " + d.x);

		change(d.x);	// change 메서드 안에 있는 지역변수인 x = 1000을 호출
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x);
	}

	static void change(int x) {  // 기본형 매개변수
		x = 1000;
		System.out.println("change() : x = " + x);
	}
}