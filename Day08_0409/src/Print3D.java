 
public class Print3D extends Print {
	int z;
	
	//메소드 오버라이딩 
	// 부모의 메소드랑 똑같은 메소드를 다시 만든다. 
	// 구현부는 재정의 한다. 
	String getLocation() {
//		return "x : " + x + ", y : " + y + ", z : " + z ;
//				super = 부모 

	
	 return super.getLocation() + ", z : " + z;
	}
}