package polymorphism;

public interface Interfaceable {
//	1. 변수 : public  static  final (상수)  int MAX;
//	2. 추상 메소드 : public  abtract  void  add( );
//	3. 객체 생성이 불가함 
//	4. ‘상속’ 만 가능 
//	5. 자식 클래스는 반드시 추상 메소드 오버라이딩 해야함 
//	6. public  static  final, public  abtract 생략 가능
//	7. 인터페이스간 상속이 가능하다. 
//	8. 자식클래스에게 다중 상속 가능하다.
	
	public static final int MAX = 0; // 초기화 하고 사용해야함
	public abstract void add();
	
	default void defualtMethod() {
		
	}
	
	static int getHour() {
		return 0;
	}

}
