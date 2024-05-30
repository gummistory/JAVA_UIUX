package project;

public class ScoreData {
	
	//학생의 이름과 과목별 성적을 저장하도록 변수 구성
	// 4과목 (java, kor, eng, math)
	
	String name;
	int java;
	int kor;
	int eng;
	int math;
	
	//생성자 구성 
	public ScoreData(String name, int java, int kor, int eng, int math) {
		super();
		this.name = name;
		this.java = java;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	// 학생별 메소드 구성 
	void show() {
		System.out.println("이름 : " + name);
		System.out.println("자바 점수 : " + java + ", " + "국어 점수 : " + kor + ", " + "영어 점수 : " + eng + ", " + "수어 점수 : " + math + ", " );
	
		
	}

}
