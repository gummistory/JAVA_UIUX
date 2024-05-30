package com.list;

import java.util.Arrays;
import java.util.Comparator;

public class IntegerTest {
	public static void main(String[] args) {

		Integer [ ] intg = { new Integer(1), 5, 3, 4, 3};
		System.out.println(Arrays.toString(intg)); //배열선언 

		Arrays.sort(intg);
		System.out.println(Arrays.toString(intg)); //오름차순 

		Arrays.sort(intg, new Descending2()); //  내림차순 정렬을 위해 Comparator를 사용하여 배열 정렬

		System.out.println(Arrays.toString(intg)); // // 내림차순으로 정렬된 배열 출력
		}

	
}

class Descending2 implements Comparator {

	   @Override
	   public int compare(Object o1, Object o2) {

	      if (o1 instanceof Integer && o2 instanceof Integer) {
	         Integer i1 = (Integer) o1;
	         Integer i2 = (Integer) o2;

	         return i1.compareTo(i2) * -1; // 내림차
	      }

	      return 0;
	   }

}