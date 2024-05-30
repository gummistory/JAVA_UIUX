
public class Car {
  // 속성	
  // 생성자 : 멤버변서의 초기화 (대상 : 인스턴스변수)
  //      : 클래스명과 대소문자 동일하게 작성된다. 
  //      : 메소드처럼 생겼지만 리턴타입이 없다. 
  //	  : 직접 호출해서 사용할 수 없다. 
  //	  : 객체를 생성할때 1번만 호출 가능
  //      : 생성자 오버로딩 	
  //      : 생성자간 상호 호출
  //      : 초기화 순선
  //      : 자동 초괴화 - 명시적 초기화 - 초기화 블럭 - 생성자 - 직접 초기화 
  // 상수는 생성자에 한번 초기화 할 수 있다.  MAX 참고 	
  // 기능 
	
	//차 속성 정의 
	String color = "red"; // 기본값 null
	String gearType; // 기본값 null
	int door; // 기본값 0 
	final int MAX = 100; // 최댓값 // final int MAX; -> 이렇게 하면 오류남 
	
	Car(){ // 단독으로 기본생성자 생략가능 
//		
//		// 비어있는 경우 = 아무역활을 안함 
//		// 기본 생성자는 생략이 가능하다. 생성자 오버로딩시 생략은 판단해야한다. 
//		// 생성자가 호출 : this() : 생성자의 가장 위쪽에 작성 
		//this.color = "pink";
		
		this("pink", "auto", 3);

	}
	
	Car(String color){
		this("color", "auto", 5);
		//this.color = color; // this = car		
	}
	Car(String color, String gearType){
		this.color = color;
		this.gearType = gearType;
	}
	Car(String color, String gearType,int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
 }
