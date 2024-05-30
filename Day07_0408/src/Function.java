
public class Function {
// 메소드
//  리턴타입, 메소명([매개변수]) {  
//  실행문;
//     [return]   
//  }

  // 리턴타입(Return) : 기본형, 참조형, void

//  void add() {
//     System.out.println(2 + 3);
//  }
//
//  void add2(int x, int y) { // 매개변수는 지역변수
//     System.out.println(x + y);
//  }
//
//  void add3(int x, int y) {
//     int sum = x + y;
//  }
//
//  int add4(int x, int y) {
//     int sum = x + y;
//     return sum; // 돌려주는 값의 타입 sum = int 
//  }
//
//  void add5(int x) {
//     if (x >= 10) { //이 조건문은 특별한 경우에만 사용
//        System.out.println("return              ");
//        return; // 메소드 강제종료
//     }
//     System.out.println(x);
//  }
//
//  int add6(int x, int y) {
////     if (x > y) {
////        return x;
////     } else {
////        return y;
////     }
//
//     if (x > y) {
//        return x;
//     }
//     return y;

  // 매개변수의 타입에 따른 분류
  // call by value (기본형) : 값의 복사
  // call by reference (참조형(주소값)) : 클래스명, 배열

//  void add(int x, int y) {
//
//     System.out.println(x); // 10
//     System.out.println(y); // 20
//
//     x = 100;
//     y = 200;
//
//     System.out.println(x + y); // 300
//
	
//  }
//
//

// call by value

//	void change1(int x) {
//		x = 1000;
//	}
//	
//	// call by reference *참조형 
//	void change2(Data d) { //앞에서 만든 클래스 이름이여야함 
//		d.x = 1000;
//	}
//	//메소드 만들기 // reference방식
//	void arrChange(int[] arr) {
//		
//		arr[0] = 10;
//	}

	//메소드의 정의 방식 2가지
	//인스턴스 메소드
	//클래스 메소드 
	
	void instanceMethod() {
		System.out.println("인스턴스 메소드 호출");
		
	}
	
	static void staticMethod() {
		System.out.println("클래스 메소드 호출");
	}
	
}



















	

