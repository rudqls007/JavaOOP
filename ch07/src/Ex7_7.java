class Ex7_7 {
	public static void main(String args[]) {
		Car c = new Car();
		FireEngine fe = (FireEngine)c;
		fe.drive();						
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