package com.map;

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesTest {

	public static void main(String[] args) {
		
		
		// key & value 구조 : 타입은	 String 만 사용 가능 
		
			Properties prop = new Properties();
			
			//prop에 키와 값(key,value)를 저장한다.
			prop.setProperty("timeout", "30");
			prop.setProperty("language", "kr");
			prop.setProperty("size", "10");
			
			//System.out.println(prop.getProperty("timeout")); // 출력 : 30 
			
			
			// Enumeration
			//prop 저장된 요소들을 Enumeration을 이용해 출력
			Enumeration e = prop.propertyNames(); // 키값을 반환한다.
			
			while(e.hasMoreElements()) {
				String element = (String)e.nextElement();
				System.out.println(element + " : " + prop.getProperty(element));
			}

	}

}
