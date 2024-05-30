package exceptions;

public class ExceptionTest01 {

	public static void main(String[] args) {
		// throw new Exception("강제로 발생 시킨 예외");
		
	
//		try {
//			throw new Exception("강제로 발생 시킨 예외");
//		}catch(Exception e) {
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}
	
//	method1();
	
	}// main 함수 끝

	static void method1() throws Exception {
		method2();
	}
	static void method2() throws Exception {
		
		throw new Exception("Exception 예외"); //예외처리해야함
		
		}
		
	
	
	
}//class 의 끝