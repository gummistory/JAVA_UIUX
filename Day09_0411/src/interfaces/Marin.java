package interfaces;

public class Marin extends GroundUnit implements Repair{
	
	Marin(){
		super(40);
		hitPoint = MAX_HP;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Marin";
	}
	

}
