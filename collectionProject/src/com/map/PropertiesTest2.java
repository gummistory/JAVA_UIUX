package com.map;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Properties;

public class PropertiesTest2 {

	public static void main(String[] args) {
		// input.txt 이용
		
		Properties prop = new Properties();
		
		String inputFile = "src/input.txt";
		
		
		try {
			prop.load(new FileInputStream(inputFile));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		System.out.println(prop);
		
		String name = prop.getProperty("name");
		//String data = prop.getProperty("data");
		
		
		String[ ] data = prop.getProperty("data").split(","); // 배열로 출력 
		
		//prop.getProperty("data") 반환 타입 -> string // split ->string 클래스의 기능 
		
		
		
		int max = 0;
		int min = 0;
		int sum = 0;
		double avg = 0.0;
		
		// 문자열에서 숫자로 변경  string -> int 로 
		int [ ] nums = new int[data.length];
		for ( int i = 0; i< nums.length; i++) {
			nums[i] = Integer.parseInt(data[i]);
			
		}
		
		for ( int i = 0; i <nums.length; i++) {
			int sValue = nums[i];
			if(i==0) max=min=sValue;
			
			if(max < sValue) {
				max = sValue;
				
			}else if (min > sValue) {
				min = sValue;
				
			}
				sum += sValue;
		}
		
		avg = (sum * 100.0)/ nums.length / 100;
		 
		System.out.println(Arrays.toString(data)); // 배열 출력 
		
		System.out.println("이름 : " + name);
		System.out.println("최댓값 : " + max);
		System.out.println("최소값 : " + min);
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		
	}

}