
public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Student s = new Student();
		
//		s.name = "구경민";
//		s.ban = 1;
//		s.no = 3;
//		s.kor = 50;
//		s.eng = 100;
//		s.math = 60;
		
	     Student s2 = new Student("Lucy", 1, 3, 52, 100, 60);

	        int total = s2.getTotal();
	        float avg = s2.getAverage();

	        System.out.printf("총점 : %d\n평균 : %.1f", total, avg);
	    }
	
		
//		System.out.println("이름:" + s.name);
//		System.out.println("반 : " + s.ban);
//		System.out.println("번호 : " + s.no);
//		System.out.println(s.getTotal());
//		System.out.println(s.getAverage());
//		
//		
//		System.out.println(s.name);
//		System.out.println(s.ban);
//		System.out.println(s.no);
		
		
		

	

	}


