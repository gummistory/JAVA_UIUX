
public class Function3 {
	
	// 메소드 오버 로딩 (메소드를 정의할때 나타나는 형식)
	// 1. 메소드의 이름이 동일하다. 
	// 2. 매개변수의 갯수가 다르거나 또는 타입이 다르거나 
//	
//	void add() {};
//	void add(int x) {};
//	void add(long l) {};
//	void add(int x, int y) {};
//	void add(int x, long l) {};
//	void add(long l, int x) {};
//	//int add(int x) {} return type은 오버로딩 조건이 아님
//	
	
	// System.out.printInt();//
	// System.out.printString();
	// System.out.printdouble();
	
	
	//이름은 같은데 매개변수 타입 및 갯수가 다른 오버로딩 
	
	//더한다 
	
	int add (int x, int y) {
		return x + y;
		
	}
	
	
	// void 값 x sysout + void 금지
//	void add(int[] arr) {
//		int sum = 0;
//		for(int num : arr) {
//			sum += num;
//		}
		
//	}
	
	// 배열을 구한다 
	
	int add(int[] arr) {
		int sum = 0;
		for(int num : arr) {
			sum += num;
		}
		return sum;
	}

}
