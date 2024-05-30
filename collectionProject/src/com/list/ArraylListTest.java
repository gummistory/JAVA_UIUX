package com.list;

import java.util.ArrayList;

public class ArraylListTest {

	public static void main(String[] args) {
		// 05/21
		
		//읽고 , 쓰고, 수정, 삭제 
		
		
	ArrayList list = new ArrayList(); // 배열
	
	//기본형->참조형 : auto boxing
	//1,2,3,4,5
	// Integer(1)
	// Integer i = 3;
	// Object obj = 3 // Object obj = new Integer(3)
	
	
	
	list.add(new String("5"));
	list.add("1");
	list.add("4");
	list.add("2");
	list.add("3");
	list.add("3");
	
	//자체가 배열이 아니라서 length는 사용 못함 
	// list.size =값이 있는 만큼만 반복 하는 방법 
	
	for(int i =0; i<list.size(); i++) {
		String s= (String)list.get(i);
		System.out.println(s);
	}
	
//	String s1 = (String)list.get(0);
//	String s2 = (String)list.get(4);
//	String s3 = (String)list.get(5);
//	
//	System.out.println(s1.toString()); //toString() 오버라이딩
//	System.out.println(s2);
//	System.out.println(s3);
	
	list.set(3, "AA");
	String s4 = (String) list.get(3);
	System.out.println(s4);	
	
	// array 가 가지고 있는크
	System.out.println(list.size());
	
	// 배열 지우기 
	list.remove(5);
	System.out.println(list.size());
	
	
	list.remove(2);
	
	System.out.println(list.get(2));
	
	}

}
