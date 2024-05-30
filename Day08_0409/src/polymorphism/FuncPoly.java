package polymorphism;

public class FuncPoly {

	void doWork(Car c) {
	// instanceof
		if (c instanceof FireEngine) { // c가 FireEngine type이 맞는지 확인  
			FireEngine fe = (FireEngine)c;   //상속 구조의 관계 
			fe.water();
		}else if (c instanceof Ambuance) { // 아니면 c가 ambuance type 맞는지 확인
			Ambuance ab = (Ambuance)c;
			ab.siren();
		}
	}
}
