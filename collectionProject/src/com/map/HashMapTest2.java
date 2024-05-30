package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map =new HashMap();
		
		map.put("김자바" , new Integer(90));
		map.put("김자바" , new Integer(100));
		map.put("이자바" , new Integer(100));
		map.put("강자바" , new Integer(80));
		map.put("안자바" , new Integer(90));
		
		Set set;
		
		
		//key
//		set = map.keySet();
//		System.out.println(set);
		
//		Iterator it = map.keySet().iterator();
//		while(it.hasNext()) {
//			String key = (String)it.next();
//			System.out.println("key : " + key + ",value : "+ map.get(key));
//		}
		
		//value
		
//		int sum = 0;
//		
//		Iterator it = map.values().iterator();
//		while (it.hasNext()) {
//			Integer i = (Integer)it.next();
//			sum += i;
//			System.out.println(i);
//			
//		}
//		System.out.println(sum);
//		
//	}
		
		// key , value 
		
		Iterator it = map.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next(); //반환 타입이 map.entry
			System.out.println("이름 : "+ e.getKey() + ", 점수 : " + e.getValue());
		}
		
		
		
	}

}
