package polymorphism;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water(); //water~~
		car = fe; // 업 캐스팅 
		// car.water(); // 불가 
		fe2 = (FireEngine)car; // 다운캐스팅 부모 타입을 -> 자식 타입으로 다운, 형변화가 생김 
		
		fe2.water();
		fe2.drive();
		fe2.stop();

	}
	

}
