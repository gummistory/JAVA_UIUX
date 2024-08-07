package lambdaStream;

public class LambdaTest2 {
	
	
	
	static void excute(MyFunction f ) {
		f.run();
	}
	
	static MyFunction getMyFunction ( ){
		MyFunction f = ( ) -> System.out.println("f3.run( )");
		return f;
	}
	public static void main(String[ ] args) {
		
		MyFunction f1 = ( ) -> System.out.println("f1.run( )");
		
		// 익명 클래스 :  인터페이스를 이용해서 객체 생성 방식
		MyFunction f2 = new MyFunction( ) {
			
			@Override
			public void run() {
				System.out.println("f2.run( )");
			
		}
};

	MyFunction f3 = getMyFunction();
		
	f1.run();
	f2.run();
	f3.run();
	
	excute(f1);
	excute(() -> System.out.println("run( )"));
	}
	
}


	

	

