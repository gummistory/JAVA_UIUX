package day02_0401;

public class Project02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 산술연산자
		// +, -, *, /(몫), %(나머지) 
		
//		int x = 5;
//		int y = 2;
//		
//		System.out.println(x + y);
//		System.out.println(x * y);
//		System.out.println("몫 : " + (x / y)); // 몫 : 2
//		System.out.println("나머지 : " + (x % y)); // 나머지 : 1
//		System.out.println(x / (float)y ); //2.5  
//		
		// 증감 연산자 (변수에만 사용한다)
		// ++, -- 
		// 전치,후치 
		// 변수의 값을 1증가, 1감소 
		
//		int x = 10; 
//		x++;
//		
//		System.out.println(x); // 11
//		
//		x--;
//		System.out.println(x); // 10
//		
//		++x;
//		System.out.println(x); // 11
//		
//		--x;
//		System.out.println(x); // 10
//		
// 
//		int x = 10;
//		int result;
//		
//		result = x++ + 10; // result -> 
//		
//		System.out.println(x); // 11
//		System.out.println(result); // ++x + 10 = 21 , xx+ + 10 = 20
//		
		// 비교 연산자 
		// ==, !=, <(초과) , >(미만) , <=(이상) , >=(이하)
		// 결과 : true false 
		
//		int x = 10;
//		int y = 20;
//		
//		System.out.println(x == y); //false
//		System.out.println(x != y); //true 
		
		// 논리 연산자 
		// &&, ||(or), !(not)
		
		//조건1 && 조건2
		// 결과 : true, false 
		
		// &&(and)
		//true && true -> true
		//true && false -> false
		//false && true -> false
		//false && false -> false
		
		// ||(or)
		//true || true -> true
	    //true || false -> true
		//false || true -> true
		//false || false -> false
		
	    // ! (not)
		//!true == false
		//!false == true
		
//		int x = 10;
//		int y = 20;
//		
//	    System.out.println((x == 10) && (y == 20)); //-> true && true = true 
//	    System.out.println((x == 10) && (y != 20)); //-> true && false = false 
//	    
//	    
//	    System.out.println( x == 10 || y == 20); //-> true || true = true 
//	    System.out.println( x != 10 || y == 20); //-> false || true = true
//	    System.out.println( x != 10 || y != 20); //-> false || false = false
//	    
	    
//		int x = 10;
//		int y = 20;
//		
//		
//		System.out.println(!true); // -> false
//	    System.out.println(!false); //-> true
//	    System.out.println( !(x != 10 || y != 20)); //-> true 
//	    
//	    !(y > 20) // y가 20보다 큰게 "! 아니라면" // true 
		
		// 논리연산자의 범위 연산 
//		int x = 5;
//		System.out.println(x >= 1 && x <= 10); // true -> x = 5
//		System.out.println(x < 1 || x > 10); // false -> x = 5
		
		// 최단 평가 
		//true && true 
		//false && 판단하지 않는다. ( 앞에 까지만 연산하기-> 앞에 false이면 무조건 false )
		
	    //true || 판단하지 않는다. ( 앞에 까지만 연산하기 -> 앞에 true이면 무조건 true )
		
		
		//비트 연산자 ( 1, 0 으로만 계산 )
		// &, |, ^( ?? ), >>, <<, ~(not)
		// 0, 1
		// 0 & 0 
		
		//(조건식) : 우선순위 
		//(자료형) : 캐스팅(형변화)
		
		//조건연산자(삼항연산자)
		//(조건식 -> true/false) ? 값1 : 값2
		// 문자-> String
//		int age = 10;
//		String result = age >= 20 ? "성인":"미성년자";
//		System.out.println(result); // age의 값에 따라 성인 or 미성년자로 출력 
		
		//단항연산자 : ++, --
		//이항연산자 : +, *, / = (산술연산)
		//삼항연산자 : 조건식?값1:값2
		
		//대입연산자 
		// =, +=, -=, *=, /=, |=, >>=, ....
		//int x = 10;
		//int y;
		
		//y += x; // 해석 -> y = y + x
		
		//x += 10; // x = x + 10 -> result : 20
		//System.out.println(x);
		
		
		
		
		
		
		
		
		
		
		
		

		
	}

}
