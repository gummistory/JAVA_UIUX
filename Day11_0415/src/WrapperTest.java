
public class WrapperTest {

	public static void main(String[] args) {
		// WrapperTest
		// 기본형과 참조형간 형변환을 위한 클래스 
		// 오토박싱 (박싱, 언박싱)
		// 기본형을 참조형으로 형변환 한다. 
		// Boolean,Byte,Short,Character,Integer,Long, Float, Double
		
		
		
//		int i = 10;
//		Integer it = new Integer(20);
//		
//		int i2 = it;// = int i2 = it.intValue();
//		System.out.println(i2);
//		
//		Integer it2 = i; // 주소값 it2 
//		
//		int x = 100;
//		Integer it3 = 200;
//		System.out.println(x+it3);
//		
//		
//		int y = (int) new Integer(30);
//		System.out.println(y);
//		
//		String s = "3000";
//		int z = Integer.parseInt(s);
//		
//		System.out.println(z);
//
//		
		// 
		int i = 10;
		Object obj;
		obj = i; // new Integer(i);
		
		int result = (Integer)obj; // Object 캐스팅 없이 언박싱 불가 
		System.out.println(result);
		
		
		
		
		
		
		
		
	}

}
