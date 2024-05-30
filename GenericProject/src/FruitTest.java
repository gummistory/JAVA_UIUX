
public class FruitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 생성시 앞에 선언된 제너릭 타입과 뒤에 선언된 제너릭 타입은 일치해야함 
		Box<Fruit> fruitBox = new Box<Fruit>(); // fruit 을 담을 수 있는 박스 
		Box<Apple> appleBox = new Box<Apple>(); // apple만 담을 수 있는 박스
		Box<Toy> toyBox = new Box<Toy>(); // toy 만 담을 수 있는 박스 
		//Box<Grape> grapeBox = new Box<Apple>(); -> 불가 타입 불일치!
		
		fruitBox.add(new Fruit()); // fruit box 에fruit 을 담는 다는 이야기 
		
		fruitBox.add(new Apple()); // 상속 관계에 의한 다형성 제공, 원래는 애플이 들어갈 수 없음
		
		appleBox.add(new Apple()); // apple box에 애플 넣기
		
		//appleBox.add(new Toy()); // 타입 불일치! 애플은 애플 토이는 토이
		
		toyBox.add(new Toy()); // toy box 에 toy 넣기 
		
		//toyBox.add(new Apple()); // 타입 불일치로불가능 
		
		System.out.println(fruitBox.toStirng());
		System.out.println(appleBox.toStirng());
		System.out.println(toyBox.toStirng());

	}

}