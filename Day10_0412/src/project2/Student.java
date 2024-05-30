package project2;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor //생성자
@ToString(exclude = "name")
public class Student {
	String name;
	int age;
	int grade;
	int ban;
	int no;
	
	
	
	
	
}
