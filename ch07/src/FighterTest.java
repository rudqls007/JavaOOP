abstract class Unit1{
	int x, y;
	abstract void move(int x, int y);
	void stop() {System.out.println("멈춥니다.");}
	
}

interface Fightable{
	void move(int x, int y);	// public abstract가 생략됨
	void attack(Fightable f);	// public abstract가 생략됨
}


class Fighter extends Unit1 implements Fightable{
	// 오버라이딩 규칙 : 조상(public)보다 접근제어자가 범위가 좁으면 안 된다.
	public void move(int x, int y) {
		System.out.println("["+x+","+y+"]"+ "로 이동");
	}
	public void attack(Fightable f) {
		System.out.println(f+"를 공격");
	}
	
	// 싸울 수 있는 상대를 불러옴
	Fightable getFighterble() {
		Fighter f = new Fighter();		// Fighter를 생성해서 반환
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
