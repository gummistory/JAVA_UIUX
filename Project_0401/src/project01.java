package day02_0401;

public class project01 {

	public static void main(String[] args) {
	
		// 변수
		// 데이터를 저장하는 공간 
		// 숫자, 문자, 바이트
		// 숫자 : 정수, 실수 
		// 문자 : 한문자(문자), 여러문자(문자열)
		// 논리형 : 참, 거짓 ( true , false )
		// 객체형(참조형) : 주소값
		
		// 자료형
		// 기본형 : boolean=논리형, byte, short, char, int, long, float, double 
		// -> 숫자 ( 정수 / byte, short, char, int, long ) (실수 /float, double )
		// 참조형 : class 
		
		// 자료형 ( Data Type ) 변수명 
		
//		int x; //변수의 선언
//		x = 10; // 변수의 초기화 
//		
//		System.out.println(x);
//		
//		x = 20;
//		
//		System.out.println(x);
//		
//		int y = 30 ; //  선언과 초기화 
//		
		
//		int x;
//		int y;
//		int z;
//		
//		x = 10;
//		y = 20;
//		z = 30;
		
		//int x,y,z; //동일한 타입일 때 같이 선언하기 
		

		//int x=10,y=20,z=30;
		
		
		//클래스명 : HelloWorld (단어 두개 합치는 거면 단어시작 점을 대문자로 두기)
		//변수명 : helloWold (소문자로 시작)
		//메소드명 : helloWorld() -> 소문자로 시작, 그러나 가로가 꼭 붙음
		
//		boolean bn = false; //true or false
//		byte b = 10; //-128~128
//		short s = 20;
//		int i = 30;
//		long l = 40L; // 접미사(L,l)가 붙음 -> 생략 가능 
//		
//		float f = 3.14f;  //접미사 (f,F) 생략 불가능 
//		double d = 3.14d; //접미사 (d,D) 생략 가능
//		
//		
//		// 문자열(한글자 이상)
//		String str = "A";
//		System.out.println(str);
//		
//		// 문자 
//		char c =  'A';    // 유니코드 표기법 // 정수 0~65535; 문자를 사용해야함. (양의 범위만 사용 가능)
//		
//		System.out.println(c);
		
		//지역변수 : 반드시 초기화 해야한다. 
		//지역변수가 아닌 경우 : 자동 초기화 
		
		//특수문자 
		// \n 줄바꿈 
//		System.out.println("hello\nworld");
//		String str = "\"hello world\"";
//		System.out.println(str);
//		
//		System.out.println("c\\adc\\123\\1.jpg");
		
		//형변환 (boolean 제외)
		//자동형변화, 강제형 변화 
		//크기 
		// () byte , long=8byte < float 4byte ? float 소수점까지 표시 가능하여 더 크게 취급
		// ----------------------------------------------------------> 자동형 변화 
	    // byte(1) < short(2) < int(4) < long(8) < float(4) < double(8) 
		//       char(2)  <
		// 강제형 변환 <------------------------------------------------------------
		
//		byte b = 10; 
//		int i;
//		
//		i = b; // byte -> int (자동형변환)
//		
//		int i2 = 300;
//		byte b2 = (byte)i2; // int -> byte (강제형변환), 값의 손실 발생 
//		
//		System.out.println(i2); // 300
//		
//		System.out.println(b2); // 44
//		
//		float f = 3.14f;
//		double d;
//		
//		d = f;
		
		// 연산에서의 형변화 
		byte b1 = 10;
		byte b2 = 20;
		
		byte result = (byte)(b1 + b2); // byte + byte -> int + int = int
		System.out.println(result);
		
		// byte short char -> int형으로 형변환 된다. 
		// int + long = long -> int 형보다 크면 큰 타입을 형 변환 된다. 
		
		// 문자열 + anytype  (연결 연산자)
		
		String str = "java";
		int ver = 11;
		
		System.out.println(str + ver); //"java" + "10" => "java11"
		
	}

}
