package com.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// set은 중복된 값을 허용하지 않는다.
		// 해당 데이터 타입의 클래스에는 equals( ) , hashCode( ) 두개의 메소드가 오버라이딩 되어 있어야 한다.
		
		Object [ ] objArr = { "1", new Integer(1), "2", "2", "3", "3", "4", "4", "4" };
		
		Set set = new HashSet();
	
		for (int i = 0; i<objArr.length;i++) {
			set.add(objArr[i]);
			
		}
			System.out.println(set); // 알아서 중복을 제거 해줌 
		}

}
