
public class Tv {
	   public String color; // 색상
	   public boolean power; // 전원버튼
	   public int channel;

	   void power() {
	      power = !power;
	   }

	   void channelup() {
	      channel++;
	   }

	   void channelDown() {
	      channel--;
	   }
	}
	
	
