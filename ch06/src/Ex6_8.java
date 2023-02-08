class Data3 { int x; }
class Mymath2{

	long a , b;
	
	long add()	{return a + b;}
	static  long add(long a, long b) {return a+ b;}	

}


class Ex6_8 {
	public static void main(String[] args) {
		
		Mymath2 m = new Mymath2();
		m.a = 200;
		m.b = 100;
		System.out.println(m.add());
		
		
		Data3 d = new Data3();
		d.x = 10;

		Data3 d2 = copy(d); // tmp ( 0 * 200  )를 d2에 객체 주소를 반환함
		System.out.println("d.x ="+d.x);
		System.out.println("d2.x="+d2.x);
	}

	static Data3 copy(Data3 d) {	// 객체 생성없이 호출가능함.
		Data3 tmp = new Data3();    // 새로운 객체 tmp를 생성한다.

		tmp.x = d.x;  // d.x의 값(10)을 tmp.x에 복사한다.

		return tmp;   // 복사한 객체의 주소를 반환한다.
	}
	
	

	
	
	
	
	
	
		
	}
