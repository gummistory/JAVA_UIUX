package com.list;

import java.util.ArrayList;

public class ArrayListTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList list = new ArrayList(); //배열
		
		//"" 금지 !!!!!!!! 
		
		list.add(new Integer(1));
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		
		int sum = 0;
		
		//55
		for (int i = 0; i < list.size(); i++) {
	         int num = (Integer) list.get(i);
	         sum += num;
	      }
		//55
//		for (Object obj : list) {
//	         int i = (Integer) obj;
//	         sum += i;
//	      }
		 System.out.println(sum);
	}

}
