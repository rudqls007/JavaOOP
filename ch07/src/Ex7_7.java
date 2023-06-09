class Ex7_7 {
	
	
	public static void main(String args[]) {

		
		
		
		
		FireEngine fe = new FireEngine();
		Car car = new Car();
		
		if(fe instanceof Car) {
			Car car1 = (Car)fe;
			car1.drive();
		}
		
		System.out.println(fe instanceof Object);
		System.out.println(fe instanceof Car);
		System.out.println(fe instanceof FireEngine);
		System.out.println(car instanceof FireEngine);
		
//		Car c = new Car();
//		FireEngine fe = (FireEngine)c;	// ����ȯ ���� ���� java.lang.ClassCastException 
//										/* ����ȯ Ÿ�Ը� �´ٸ� ����ȯ�� ���������� Car �ν��Ͻ��� ��� ������ 4���̰�,
//										 * FireEngine�� water() �޼���� ������ ���� �ʱ� ������ fe�� car�� ����ȯ�ص�
//										 * ���� �ν��Ͻ��� Car���� water()�� �����Ƿ� ����� �� ����.*/
//		fe.water();
		
		
		
		
		
//		Car car = null;
//		FireEngine fe = null;
//		
//		FireEngine fe2 = (FireEngine) car;
//		Car car2 = (Car)fe2;
//		car2.drive();	// NullPointerException �߻�. ���� Null�̶�
		
		
		
		// ���� Car �ν��Ͻ��� ����� 4��, FireEngine �ν��Ͻ��� ����� 5���̹Ƿ� Car �ν��Ͻ��� ��� ������ ����ȯ�ϴ� FireEngine�� ��� �������� ���� ������ ����ȯ ������ ��.
		
		
		// Car car = null;
		// FireEngine fe = null;  ����ȯ�� �� ��, ���� �ν��Ͻ��� ���������� �߿���.
		
//		Car car = new Car();
//		FireEngine fe = new FireEngine();
//		FireEngine fe2 = null;
//		fe2 = (FireEngine)car;	// ����  - > �ڼ����� ����ȯ
//		Car car2 = (Car)fe;					// �ڼ�  - > �������� ����ȯ 
//		// car2.drive();
//		fe.drive();
//
//		fe.water();
//		car = fe;    // car = (Car)fe;���� ����ȯ�� ������
////		car.water(); ����. Car Ÿ���� ���������� car�δ� water()�� ��� �Ұ���.
//		fe2 = (FireEngine)car; // �ڼ�Ÿ�� �� ����Ÿ��. ����ȯ ���� �Ұ�
//		fe2.water();
	}
}



class Car {
	String color;
	int door;

	void drive() { 	// �����ϴ� ���
		System.out.println("drive, Brrrr~");
	}

	void stop() {  	// ���ߴ� ���	
		System.out.println("stop!!!");	
	}
}

class FireEngine extends Car {	// �ҹ���
	void water() {	// ���� �Ѹ��� ���
		System.out.println("water!!!");
	}
}