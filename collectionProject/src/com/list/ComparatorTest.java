package com.list;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorTest {

	public static void main(String[] args) {
		
		// 문자열 대소비교 ( 사전의 알파벳 순서 ) 
		
		String[ ] strArr = { "cat", "Dog", "lion", "tiger" }; 
		System.out.println(Arrays.toString(strArr)); // 정렬 전 상태
		
		// Arrays 클래스
		// sort : 오름차순 정렬 
	
		Arrays.sort(strArr); // String -> 기본 정렬 방식이 정의가 되어있
		System.out.println(Arrays.toString(strArr));
		
		// sort(값, Comparator방)
		
		Arrays.sort(strArr, new Descending());
	     System.out.println(Arrays.toString(strArr));

		
		//오름 차순 내림차순 
		// Comparable  : 기본정렬을 구현할때 사용하는 인터페이스 
		//						  :  int compareTo(Object o ) 
		//						 : 오버라이딩시 양수 or 0 or 음수를 리턴하도록 구현한다. (두수의 값의 차를 구한다.)
		
		// Comparator : 정렬의 기준과 방식을 변경하고 싶을 때 사용하는 인터페이스
		//						:  int compare(Object o1, Object o2 )
		//		 				: 오버라이딩시 양수 or 0 or 음수를 리턴하도록 구현한다. (두수의 값의 차를 구한다.)
		
		
		
		
	}

}



	class Descending implements Comparator{

		@Override
		public int compare(Object o1, Object o2) {
			if (o1 instanceof String && o2 instanceof String) {
		         String s1 = (String) o1;
		         String s2 = (String) o2;
		         
//		        return o1 - o2 // 오름차순
//		        return 02 - o1 //내림차순
//		        		
		       //  return s1.compareTo(s2); // 오름차
		       //  return s2.compareTo(s1); // 양수 , 0 , 음수 ( 내림차순 ), 
		         return s1.compareTo(s2)  *  - 1; // 오름차순 방식 * -1 = 내림차순으로 바뀜 
		      }

		      return -1;

		  
		}
		
	}


