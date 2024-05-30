package polymorphism;

public class Buyer {
	int money = 1000;
	int bounsPoint = 0;
	
	void buy(Product p) {
		
		if (money < p.price) {
			System.out.println("잔액부족");
			return;
		}
		
		money -= p.price;
		bounsPoint += p.bonusPoint;
		System.out.println(p.toString() + "구매완료");
	}
	
	

	
}


