package interfaces;

public class UnitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marin mr = new Marin();
		Tank t = new Tank();
		SCV scv = new SCV();
		Medic md = new Medic();
		
		md.repair(mr);
		scv.repair(t); //Tank의 수리가 완료 (오버라이딩하여 해당처럼 출력)
		//scv.repair(mr); -> 사용 못함 
		
 
	}

}
