package exceptions;

public class ExceptionTest {

	public static void main(String[] args) {
		// 예외처리 try - catch문 
		// 작성된 코드가 실행될때 생기는 문제 
		// 원하는 형태로 처리하는 방법
		
//		
//		try {
//			//문제를 발생시킬 수 있는 실행문 (예외타입)
//			//문제를 발생시킬 수 있는 실행문 (예외타입)
//			//문제를 발생시킬 수 있는 실행문 (예외타입)
//			}catch() {
//			//문제를 해결 하기 위한 실행문 
//			}catch() {
//			//문제를 해결 하기 위한 실행문 
//			}catch() {
//			//문제를 해결 하기 위한 실행문 
//			}finally {
//			//예외 발생 유무와 상관없이 무조건 실행하는 문장
//			}
//	}
		//어떤 정수를 0으로 나눌 수 없다. (예외) 
		
		int number = 100;
		int result = 0;
		int[] arr = {1,2,3,4,5};
		
		for(int i = 0; i<10;i++) { //i가 10번 도는 동안 
			try {
				
			System.out.println(arr[i]);
		
			result = number / (int)(Math.random()*10);
			System.out.println(result);
		
		}catch(ArithmeticException e) { //매개변수있어야함
			System.out.println("0으로 정수를 나누기 연산 불가");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스 범위를 초과 했습니다.");
		}catch (Exception e) {
			System.out.println("예외타입 처리 완료");
		}finally {
			System.out.println("예외처리 유무와 상관 없이 무조건 실행");
		}
	}
		}
}
