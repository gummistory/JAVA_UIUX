package com.set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashRandomTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Set set = new HashSet();
		 
		for(int i=0; set.size( ) <6;  i++) {
			int lotto = (int)(Math.random()*45) + 1;
			set.add(lotto); // 오토박싱되어서 인티저 타입으로 들어감 
		}
		System.out.println(set);
		List list = new ArrayList(set);
		Collections.sort(list); // 타입의 기본정렬 방식을 사용해서 처
		System.out.println(list);
		
	}

}
