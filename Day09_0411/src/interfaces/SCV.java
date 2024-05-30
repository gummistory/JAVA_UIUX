package interfaces;

public class SCV extends GroundUnit implements Repairable {

	SCV(){
		super(60);
		hitPoint = MAX_HP;
	}
	
	void repair(Repairable r) {
		Unit u = (Unit)r;
		
	while(u.hitPoint != u.MAX_HP) {
		u.hitPoint++;
	}
		
		System.out.println(u.toString() + "의 수리가 완료");
		
	}
}
