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

		Data3 d2 = copy(d); // tmp ( 0 * 200  )�� d2�� ��ü �ּҸ� ��ȯ��
		System.out.println("d.x ="+d.x);
		System.out.println("d2.x="+d2.x);
	}

	static Data3 copy(Data3 d) {	// ��ü �������� ȣ�Ⱑ����.
		Data3 tmp = new Data3();    // ���ο� ��ü tmp�� �����Ѵ�.

		tmp.x = d.x;  // d.x�� ��(10)�� tmp.x�� �����Ѵ�.

		return tmp;   // ������ ��ü�� �ּҸ� ��ȯ�Ѵ�.
	}
	
	

	
	
	
	
	
	
		
	}
