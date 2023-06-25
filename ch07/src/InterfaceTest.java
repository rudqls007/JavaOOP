
class A{
	public void method(I i) {
		i.method();
	}
}

// BŬ������ ����� ������ �и�
interface I{
	public void method();
}


class B implements I{
	public void method() {
		System.out.println("B Ŭ������ �޼���");
	}
}


class C implements I{
	public void method() {
		System.out.println("C Ŭ������ �޼���");
	}
}


public class InterfaceTest {

	public static void main(String[] args) {
		
		A a = new A();
		a.method(new B());		// A�� B�� ��� ( ���� )

	}

}
