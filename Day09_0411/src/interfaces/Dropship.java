package interfaces;

public class Dropship extends AirUnit implements Repairable{
	
	Dropship(){
		super(125);
		hitPoint = MAX_HP;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Dropship";
	}
	

}

