//1. 명시적 초기화, 간단초기화 (=, 대입연산자)
class C11{
//	int door = 4;						// 기본형 (primitive type) 변수의 초기화
	Engine e = new Engine();			// 참조형 (referencee type) 변수의 초기화
	
	int door;
	String color;
	String gearType;
	
	
	
	//3. 생성자 (iv 초기화 )
	C11(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}

}

//2 . 초기화 블럭, 여러 문장 넣기 ( 복잡한 초기화 )
/* 인스턴스 초기화 블럭 iv : {}
 * 클래스 초기화 븗럭 cv : static{} */



public class 초기화종류 {
	C11 car = new C11(null, null, 0);

}

class Engine {}