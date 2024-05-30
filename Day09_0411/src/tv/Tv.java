package tv;

public class Tv {
	
//	//lg speak
//	LgSpeak lgSpeak;
//
//	public Tv(LgSpeak lgSpeak) {
//		//super(); 기본생성자 생성 써도 되고 안써도됨
//		this.lgSpeak = lgSpeak;
//	}
//	
//	void speakSound() {
//		lgSpeak.sound();
//		
//	}

	// sm speak
//	SmSpeak smSpeak;
//	public Tv(SmSpeak smSpeak) {
//		//super(); 기본생성자 생성 써도 되고 안써도됨
//		this.smSpeak = smSpeak;
//	}
//	void speakSound() {
//		smSpeak.sound();
//	
//	}
	
	Speak speak;
	public Tv(Speak speak) {
		this.speak = speak;
		
	}
	
	void speaksound() {
		speak.sound();
	}
}
