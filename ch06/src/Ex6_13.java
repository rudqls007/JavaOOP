// 생성자 this()
/* 생성자에서 다른 생성자 호출할 떄 사용
 * 다른 생성자 호출 시 첫 줄에서만 사용 가능  */

// 참조변수 this ( this() != this )
/* 인스턴스 자신을 가리키는 참조변수 
 * 인스턴스 메서드 ( 생성자 포함)에서 사용가능
 * 지역변수와 인스턴스 변수를 구별할 떄 사용*/




/* this는 참조 변수, this() 생성자 */

class Car2 {
	String color;		// 색상
	String gearType;	// 변속기 종류 - auto(자동), manual(수동)
	int door;			// 문의 개수

	Car2() {
		this("white", "auto", 4);
	}

	Car2(String color) {
		this(color, "auto", 4);
	}
	
	Car2(String color ,String gearType){
		this(color, gearType, 2);
	}

	Car2(String color, String gearType, int door) {								
		this.color = color;			// iv this가 없으면 lv
		this.gearType = gearType;
		this.door = door;
	}
	
	
}
class Ex6_13 {
	public static void main(String[] args) {
		Car2 c1 = new Car2();	
		Car2 c2 = new Car2("blue");
		Car2 c3 = new Car2("green", "auto");
		System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType+ ", door="+c1.door);
		System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType+ ", door="+c2.door);
		System.out.println("c3의 color=" + c3.color + ", gearType=" + c3.gearType+ ", door="+c3.door);
	}
}