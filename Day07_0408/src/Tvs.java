
public class Tvs { // 부모 클래스 
	
	public String color; //색상
	public boolean power; //전원
	public int channel; // 채널 
	
	public void power() {
		power = !power;
	}
	public void channelUp() {
		channel++;
	}
	
	public void channelDown() {
		channel--;
	}

}

// extend가 안된 class이니 무좆건 object를 받는다. 