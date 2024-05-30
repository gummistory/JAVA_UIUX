
public class Student {

	String name = "Lucy";
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	Student(String name){
		this.name = name;

	}
	
	Student(String name, int ban){
		this.name = name;
		this.ban = ban;

	}
	Student(String name, int ban,int no ){
		this.name = name;
		this.ban = ban;
		this.no = no;
		

	}


	public Student(String name, int ban, int no, int kor, int eng, int math) {
		super();
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}


//	int sum;
//	
	
	int getTotal() {
//		 sum = kor + eng + math;
//	        return sum;	
		
		return kor + eng + math;
		
	}
	
	
	   float getAverage() {
	        return (int)(getTotal() /3.0f * 10 + 0.5f)/10f; // 100단위
	    }
	
//	Student(String name, int ban, int no){
//		this.name = "Lucy";
//		this.ban = 1;
//		this.no = 3;
//		
//		
//	}
}
