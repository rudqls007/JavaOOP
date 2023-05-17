class Ex7_7 {
	public static void main(String args[]) {
		Car c = new Car();
		FireEngine fe = (FireEngine)c;
		fe.drive();						
		// 실제 Car 인스턴스의 멤버는 4개, FireEngine 인스턴스의 멤버는 5개이므로 Car 인스턴스의 멤버 갯수가 형변환하는 FireEngine의 멤버 갯수보다 적기 때문에 형변환 오류가 뜸.
		
		
		// Car car = null;
		// FireEngine fe = null;  형변환을 할 때, 실제 인스턴스가 무엇인지가 중요함.
		
//		Car car = new Car();
//		FireEngine fe = new FireEngine();
//		FireEngine fe2 = null;
//		fe2 = (FireEngine)car;	// 조상  - > 자손으로 형변환
//		Car car2 = (Car)fe;					// 자손  - > 조상으로 형변환 
//		// car2.drive();
//		fe.drive();
//
//		fe.water();
//		car = fe;    // car = (Car)fe;에서 형변환이 생략됨
////		car.water(); 에러. Car 타입의 참조변수인 car로는 water()를 사용 불가함.
//		fe2 = (FireEngine)car; // 자손타입 ← 조상타입. 형변환 생략 불가
//		fe2.water();
	}
}

class Car {
	String color;
	int door;

	void drive() { 	// 운전하는 기능
		System.out.println("drive, Brrrr~");
	}

	void stop() {  	// 멈추는 기능	
		System.out.println("stop!!!");	
	}
}

class FireEngine extends Car {	// 소방차
	void water() {	// 물을 뿌리는 기능
		System.out.println("water!!!");
	}
}