import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor



//@NoArgsConstructor
//@AllArgsConstructor
public class Student2 {

	
	

	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	
	int getTotal() {
		return kor + eng + math;
	}
	
	float getAverage() {
		return (int) (getTotal()/3.0f*10+0.5f)/10f;
	}
	
//SOURCE 이용하여 생성 	
	

}
