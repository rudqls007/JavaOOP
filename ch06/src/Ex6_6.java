class Data { int x; }

class Ex6_6 {
	public static void main(String[] args) {
		Data d = new Data();						// ��ü ����
		d.x = 10;
		System.out.println("main() : x = " + d.x);

		change(d.x);	// change �޼��� �ȿ� �ִ� ���������� x = 1000�� ȣ��
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x);
	}

	static void change(int x) {  // �⺻�� �Ű�����
		x = 1000;
		System.out.println("change() : x = " + x);
	}
}