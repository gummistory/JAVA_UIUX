package com.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class StudentTest {

   public static void main(String[] args) {

      ArrayList list = new ArrayList();

      list.add(new Student("홍길동", 1, 1, 100, 100, 100));
      list.add(new Student("남궁성", 1, 2, 90, 80, 70));
      list.add(new Student("김자바", 1, 3, 80, 80, 60));
      list.add(new Student("이자바", 1, 4, 70, 90, 70));
      list.add(new Student("안자바", 1, 5, 60, 50, 100));

      // System.out.println(list);

      Collections.sort(list);
      // System.out.println(list);

      Iterator it = list.iterator();

      while (it.hasNext()) {
         Student s = (Student) it.next();
         System.out.println(s.toString());
      }

   }

}

class Ascending implements Comparator {

	   @Override
	   public int compare(Object o1, Object o2) {

	      if (o1 instanceof Student && o2 instanceof Student) {

	         Student s1 = (Student) o1;
	         Student s2 = (Student) o2;

//	         return s1.no - s2.no; // 오름차순
	         return s2.no - s1.no; // 내림차순
	      }

	      return -1;
	   }
	
}