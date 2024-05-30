package lambdaStream;

import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.Function;

public class LambdaTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 람다식에 메소드 참조 방식 
		//메소드 참조 방식은 매게변수를 생략 
		// 람다식이 하나의 메소드 만 호출하는 경우에는 메소드 참조라는 방식으로 호출 할 수 있다 
		
		//Function<String,Integer> f = s-> Integer.parseInt(s);
		Function<String,Integer> f =  Integer::parseInt; // 메소드 참조 
		
		int i = f.apply("100");
		System.out.println(i+100);
		
		// true & false 로 출력! boolean 속성 이용 ! 
		//BiFunction<String,String,Boolean> f2 = (s1,s2) -> s1.equals(s2); // s2의 결과를 리턴 한다. 
		// 메소드 참조 방식으로 변경  // equals는 string 클래스 
		BiFunction<String,String,Boolean> f2 = String::equals;
		boolean b = f2.apply("hello", "hello");
		System.out.println(b);
		
		ArrayList<Integer>list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		//list.forEach(n -> System.out.println(n));
		list.forEach(System.out::println); // 동일한결과 // 많이 사용함  (매개변수 생략)
		

	}

}