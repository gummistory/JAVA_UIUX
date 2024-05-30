package stream;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamTest4 {

	public static void main(String[] args) {
		// w. student
		Stream<Student> studentStream = Stream.of(
				new Student("박스미스", 3, 300),
				new Student("박진우", 5, 200),
				new Student("구경민", 4, 100),
				new Student("구루씨", 2, 240),
				new Student("스미스", 1, 150),
				new Student("루씨", 3, 290),
				new Student("판돌", 5, 180)
				);
		
	
//		studentStream.sorted(Comparator.comparing((Student s)-> s.getBan()))
//										.forEach(System.out::println);  --> 내림 차순
//		studentStream.sorted(Comparator.comparing(Student::getBan))
	//										.forEach(System.out::println);
		
		
		studentStream.sorted(Comparator.comparing(Student::getBan).reversed())
        .forEach(System.out::println);
		
	}

}