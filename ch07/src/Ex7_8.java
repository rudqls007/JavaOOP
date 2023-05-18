class Product {
	int price;			// 제품의 가격
	int bonusPoint;	// 제품구매 시 제공하는 보너스점수

	Product(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);	// 보너스점수는 제품가격의 10%
	}
}

class Tv1 extends Product {
	Tv1() {
		// 조상클래스의 생성자 Product(int price)를 호출한다.
		super(100);		// Tv의 가격을 100만원으로 한다. ( 조상의 생성자 ( Product 메서드 ) 호출 ) 
	}

	// Object클래스의 toString()을 오버라이딩한다.
	public String toString() { return "Tv"; }
}

class Computer extends Product {
	Computer() { super(200); }

	public String toString() { return "Computer"; }
}

class Buyer {	// 고객, 물건을 사는 사람
	int money = 1000;	  // 소유금액
	int bonusPoint = 0; // 보너스점수

	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}

		money -= p.price;            // 가진 돈에서 구입한 제품의 가격을 뺀다.
		bonusPoint += p.bonusPoint;  // 제품의 보너스 점수를 추가한다.
		System.out.println(p + "을/를 구입하셨습니다.");
	}
}

class Ex7_8 {
	public static void main(String args[]) {
		Buyer b = new Buyer();

		// product p = new Tv1(); 
		// b.buy(p) 와 같음 buy 메서드의 매개변수에 리모콘인 Product p 가 있기 때문에 buy 메서드 안에서는 객체를 만들지 않고 멤버를 바로 넣어도 가능,
		// 그렇지만 메인 메서드 안에서는 Tv 객체를 사용할 수 없음 왜? Tv 객체를 다룰 수 있는 리모콘이 없기 때문에.
		b.buy(new Tv1());
		b.buy(new Computer());

		System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
		System.out.println("현재 보너스점수는 " + b.bonusPoint + "점입니다.");
	}
}