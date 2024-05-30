package interfaces;

public class Medic extends GroundUnit implements Repair{

	Medic() {
		super(30);
		hitPoint = MAX_HP;
	}
	
	// 수리기능 
	void repair(Repair rp) {
		Unit u = (Unit)rp;
		
		while(u.hitPoint != u.MAX_HP) {
			u.hitPoint++;
		}
	System.out.println(u.toString() + "의 수리가 완료 ");
	}

}
