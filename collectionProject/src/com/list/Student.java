package com.list;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Student implements Comparable {
   String name;
   int ban;
   int no;
   int kor, eng, math;

   int getTotal() {
      return kor + eng + math;
   }

   float getAverage() {
      return (int) ((getTotal() / 3f) * 10 + 0.5) / 10f;
   }

   @Override
   public int compareTo(Object o) { // Object o => Student

      if (o instanceof Student) {
         Student other = (Student) o;

         return this.name.compareTo(other.name); // 오름 차순
      }

      return -1;
   }

}