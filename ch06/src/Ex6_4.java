class Ex6_4 {
	public static void main(String args[]) {
		// 1. 객체 생성
		MyMath mm = new MyMath();				
		
		
		//2. 메서드 호출 ( 메서드 구현부가 순서대로 수행된다. )
		long result1 = mm.add(5L, 3L);			// add 메서드 호출
		long result2 = mm.subtract(5L, 3L);		// subtract 메서드 호
		long result3 = mm.multiply(5L, 3L);		// multiply 메서드 호출
		double result4 = mm.divide(5L, 3L);		// divide 메서드 호출
		long result5 = mm.max(2, 5);
		long result6 = mm.min(2, 5);
		mm.printGugudan(9);

		System.out.println("add(5L, 3L) = " + result1);
		System.out.println("subtract(5L, 3L) = " + result2);
		System.out.println("multiply(5L, 3L) = " + result3);
		System.out.println("divide(5L, 3L) = " + result4);
		System.out.println("max(5,2) = " + result5);
		System.out.println("min(5,2) = " + result6);
	}
 }

 // 3. 메서드 모든 문장이 실행되거나 return 문을 만나면 호춯한 메서드로 돌아감

 class MyMath {							// 메서드는 무조건 클래스 영역 안에서만 정의가 가능하다.
	 
	 void printGugudan(int dan) {
		 
		 if(!(2<=dan && dan <= 9))
			 return; // 입력받은 단(dan)이 2~9가 아니면, 메서드를 종료하고 돌아가기
		 
		 for(int i=1; i<=9; i++) {
			 System.out.printf("%d * %d = %d%n ", dan, i, dan * i);
		 }
	 }
	 
	 
	long add(long a, long b) {			// void 타입이 아닌 경우 무조건 return이 필요함.
		long result = a + b;
		return result;	// 타입이 일치해야 함 ( 자동형변환 )
	//	return a + b;	// 위의 두 줄을 이와 같이 한 줄로 간단히 할 수 있다.
	}
	
	// 두 값을 받아서 둘 중에 큰 값을 반환하는 메서드를 작성하시오.
	long max (long a , long b) {
		/*
		 * if(a>b) { return a;} else { return b;}	리턴 문일 때 참이든 거짓이든 두 값 모두 리턴 문이 있어야 코드가 정상적으로 작동함.
		 */
		
		return a > b ? a : b;
	}
	// 두 값중 작은 값 호출
	long min( long a , long b) {
	
		if(a > b) { return b;}
		else { return a;}
	
	}
	
	long subtract(long a, long b) { return a - b; }
	long multiply(long a, long b) { return a * b; }
	double divide(double a, double b) {
		return a / b;		// return 은 작업을 마치면 호출한 곳으로 돌아감. ( result4 인 mm.divde로 돌아가고 a / b 반환 값을 줌. )
	}
 }
