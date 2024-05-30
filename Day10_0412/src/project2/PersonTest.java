package project2;

public class PersonTest {
	
	// p1 p2가 같은지 다른지 판별하는 것 

	public static void main(String[] args) {
		Person p1 = new Person(1111111,"smith");
		Person p2 = new Person(1111111,"smith");
		
		
		if(p1.equals(p2)) { //equals 오버라이딩해서 써야함
			System.out.println("같습니다.");
		}else {
			System.out.println("다릅니다.");
		}
		System.out.println(p1.hashCode()); //고유값
		System.out.println(p2.hashCode()); //해시코드는 중복될 수 없음 
	}

}

// equals로 오버라이딩했으면 해시코드도 무조건 써야한다. 