package tv;

public class TvTest {

	public static void main(String[] args) {
		//lg speak
		LgSpeak lgs = new LgSpeak();		
		// sm speak
		SmSpeak sms = new SmSpeak();
		AppleSpeak aps = new AppleSpeak();
		
		Tv t = new Tv(aps);
		
		t.speaksound();
		

	}

}
