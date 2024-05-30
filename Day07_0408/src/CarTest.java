
public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
		
//		c.color = "white"; // 필요에 의해 직접 값을 주는 방식 
//		c.gearType = "auto";
//		c.door = 3;
//		
		System.out.println(c.color); // 값이 입력 되어 있는 경우 red
	 	System.out.println(c.gearType); // 값이 입력 되어 있는 경우 auto
		System.out.println(c.door); // 값이 입력 되어 있는 경우 4
		
		Car c2 = new Car("red");
		System.out.println(c2.color); 
		System.out.println(c2.gearType); 
		System.out.println(c2.door);

		Car c3 = new Car("blue", "auto");
		System.out.println(c3.color); 
		System.out.println(c3.gearType); 
		System.out.println(c3.door);
		
		Car c4 = new Car("black", "auto", 4);
		System.out.println(c4.color); 
		System.out.println(c4.gearType); 
		System.out.println(c4.door);
		
		
		
	}

	
	
	
}
