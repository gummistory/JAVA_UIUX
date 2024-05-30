package com.map;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap map = new HashMap();
		map.put("myId","1234");
		map.put("asdf" , "1111");
		map.put("asdf" , "1234") ; // 중복시 마지막 값을 사용한다.

		//System.out.println(map);
	  // System.out.println(map.get("myId"));// key를 이용해서 value를 반환한다.
		
	Scanner sc = new Scanner(System.in);
	
	while(true) {
		System.out.println("Id와 password를 입력하세요");
		System.out.println("id>>");
		String id = sc.nextLine();
		
		System.out.println("password>>");
		String password = sc.nextLine();
		
		System.out.println();
		
		if(map.containsKey(id)) {
			System.out.println("임력하신 id는 존재하지 않습니다.");
			continue;
			
		}else {
			if(!(map.get(id)).equals(password)) {
				System.out.println("비밀번호가 불일치 합니.");
			}else {
				System.out.println("아이디와 비밀번호가 일치합니다.");
				break;
			}
		
		}
		
		
	}
	}

}
