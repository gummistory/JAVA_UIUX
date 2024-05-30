package polymorphism;

public class BuyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tv t = new Tv();
		Audio a = new Audio();
		Computer c = new Computer();
		
		Buyer buyer = new Buyer();
		buyer.buy(t);
		buyer.buy(a);
		buyer.buy(c);
	}

}
