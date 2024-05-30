package com.list;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Student_0529 implements Comparable {
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

			// return this.no - other.no; // 오름차순
			// return other.no - this.no; // 내름차순
			return this.name.compareTo(other.name); // 오름 차순
			// return this.name.compareTo(other.name) * -1; // 내림 차순
		}

		return -1;
	}

}


//public class Student implements Comparable<Student> {
//	String name;
//	int ban;
//	int no;
//	int kor, eng, math;
//
//	int getTotal() {
//		return kor + eng + math;
//	}
//
//	float getAverage() {
//		return (int) ((getTotal() / 3f) * 10 + 0.5) / 10f;
//	}
//
//	@Override
//	public int compareTo(Student s) { // Object o => Student
//
//		return this.name.compareTo(s.name); // 오름 차순;
//	}
//
//}
