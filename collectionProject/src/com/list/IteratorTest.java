package com.list;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList list = new ArrayList();
		
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
//		list.get(0);
//		
//		for(Object obj : list ) {
//			String s = (String)list.get(0)
//		}
		
		// 이터레이터 메소드 사용으로 데이터를 읽어주고 해즈넥스트를 이용해서 값의 유무를 체크하고 next로 리스트에서 값을 읽어온다 
		// 1.  Iterator 한 방식으로 컬렉션의 값 읽어오기 
		 Iterator it = list.iterator();
		 
		 while(it.hasNext()) {  // hasNext : 리스트의 첫번째 위치로 부터 시작해서 마지막 데이터가 있는 위치까지 이동하면서 값의 유무를 체크 
			String s = (String)it.next(); // 리스트에서 값을 읽어 온다. (next의 리턴타입 메소드 : object )
			System.out.println(s);
		 }
	}

}
