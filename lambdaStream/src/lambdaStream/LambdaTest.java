package lambdaStream;

public class LambdaTest {

	//  람다식( Lambda expression )
	//  메소드 하나의 식으로 표현한 것 
	// 이름 없는 메소드 
	// 람다는 하나의 객체이다.
		
//	int max(int x, int y ) {
//		return x > y ? x : y;
//		
//	}
//	
//	max (10,20)
//	(int x, int y) -> { return x > y ? x : y }
//	
//	(int x, int y) -> x > y ? x : y
//			
//	(x,y) -> x > y ? x : y
//			
//	(x) -> x * x;
//	
//	x -> x * x  // 매개 변수가 하나인 경우 괄호 생략 가능 
//	
	
	
	
//	// 함수형 인터페이스
	// 오버라이딩이 목적이 아니다.
	//반드시 한개의 추상 메소드만 갖는다.
//	// 람다식에 이름을 부여하는 역활 
//	(x,y) -> x > y ? x : y
	
	
//	@FunctionalInterface
//	interface MyFunction { 
//		// 추상 메소드 ( 람다식의 형식에 맞게 구성한다 )
//		public abstract int max(int x, int y );
//		
//	}
//	MyFunction f = (x,y) -> x > y ? x : y ; // => 객체이다 /  인터페이스로 선언된 양식  
//	
//	f.max(10,20)		// 람다식 호출 방식 


}

