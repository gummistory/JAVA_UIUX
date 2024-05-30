package com.set;

import java.util.HashSet;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	 Set set = new HashSet();
	 // 1~45 사이의 난수중에서 6개의 숫자를 중복없이
	 // set에 저장해서 출력 하세요.
	 
	 for ( int i = 0; set.size() <6; i++ )  {
		 int num = (int)(Math.random()*45) +1 ;
		set.add(new Integer(num));
		 
	 }
	 System.out.println(set);
	}

}
