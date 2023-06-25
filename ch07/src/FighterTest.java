abstract class Unit1{
	int x, y;
	abstract void move(int x, int y);
	void stop() {System.out.println("����ϴ�.");}
	
}

interface Fightable{
	void move(int x, int y);	// public abstract�� ������
	void attack(Fightable f);	// public abstract�� ������
}


class Fighter extends Unit1 implements Fightable{
	// �������̵� ��Ģ : ����(public)���� ���������ڰ� ������ ������ �� �ȴ�.
	public void move(int x, int y) {
		System.out.println("["+x+","+y+"]"+ "�� �̵�");
	}
	public void attack(Fightable f) {
		System.out.println(f+"�� ����");
	}
	
	// �ο� �� �ִ� ��븦 �ҷ���
	Fightable getFighterble() {
		Fighter f = new Fighter();		// Fighter�� �����ؼ� ��ȯ
		return f;
	}
}


public class FighterTest {

	public static void main(String[] args) {

		Fighter f = new Fighter();
		f.getFighterble();
		f.move(200,200);
		f.attack(new Fighter());
		
		
	}

}
