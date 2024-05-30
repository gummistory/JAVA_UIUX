
public class Project02_0402 {

	public static void main(String[] args) {
		// 반복문 
		// for, while, do-while
		
//		for(초기값;조건식;증감식) {
//			반복할 실행문
//		}
		//조건이 안변하니 조건이 항상 참이 됨. ->무한반복 
//		for(int i = 1;i<=10;i++) {
//			System.out.println("hello");
//			}
			
		// "hello" 10번 반복 출력 
		
		
//		for(int i = 1;i<=10;i++) {
//			System.out.println(i + ".hello");
//		} //1.hello ~ 10.hello 출력 
//			
//		
			
		//int i;
//		for(i =1; i<=10;i ++)
//		{
//			System.out.println(i + ". hello" );
//		
//		} 
		//System.out.println(i);
		
		//i는 10으로 시작해서 점점 감소 10,9,8,...1/(0)
		for(int i = 10; i>=1 ; i--) {
		System.out.println(i + ".hello");	
		}
		
		// 증감식의 변화에 따라 반복 횟수 변화 발생 
		for(int i = 1;i <= 10; i+=2) { // i = i+2
		    System.out.println(i + ".hello");
		} // 1,3,5,7,9 hello 
		
		//for(int i=1,j=10;i<=10;i++,j--) {
		//	System.out.println("i:" + i + ",  " + "j:" + j);
		//} //i:1,  j:10
		
		// for문 중첩 
		//for(int i=1;i<=5;i++) {
		//	for(int j=1;j<=3;j++) {
		//		System.out.println(".hello" ); //15번 결과가 출력 
		//	
		//	}
		//}
		
		// 반복사용 연산
		// 1~10까지 정수를 모두 더하세요 result = 55
		// 반복문 사용 안한 예제 
		System.out.println(1+2+3+4+5+6+7+8+9+10);
		// 반복문 사용 
		int sum = 0;
		for(int i=1;i<=10;i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		//1~10 합
		
		for(int i=1;i<=100;i++) {
			sum = sum + i;
		}
	    System.out.println(sum);
		//1~100까지의 합 
	    
	    //무한 반복문
//	    for(;true;) {
//	    	System.out.println("hello");
//	    }
	
		
		
		
 	}
}
