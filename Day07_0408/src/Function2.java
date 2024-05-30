
public class Function2 {
	
	//멤번변수와 메소드간의 관계 
	
	int iv;
	static int cv;
	
	void instanceMethod1() {
		iv =10;
		cv = 20;
	}
	
	void instanceMethod2() {
		instanceMethod1();
		staticMethod1();
	}
	
	static void staticMethod1() { //객체를 생성하는 시점에 만들어짐 
		//iv = 20;
		cv = 30;
	}
	
	static void staticMethod2() {
		//instanceMethod1(); // instance끼리 할당시점이 같아야함 
		staticMethod1();
	}

	
	
}
