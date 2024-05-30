
public class ThreadTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Thread 클래스 만드는 2가지 방법 
		// Thread 클래스
		// Runnable 인터페이스-> 독립적으로 자기 할일 만 하는 것, 여러개의 쓰레드가 각자 자기 할일을 하는 것 
		
		// Thread 특징 
		// 1. 순서대로 실행되지 않음
		// 2. 끝나는 순서도 정해져 있지 않음 
		// 
		
		TreadEx1_1  t1 = new TreadEx1_1 (); // 
		
		Runnable r = new ThreadEx1_2(); // 인터페이스 자체는 기능이 없음, 
		Thread t2 = new Thread(r); 
		
		// 호출
		//t1.run();  // 런 메소드를 사용한다고 스레드가 되는 건 아니다. 
		//t2.run(); // 런을 직접 호출하면 스레드 클래스가 되지 않는다. 
		
		t1.start(); // 스타트 메소드를 사용하면 스레드가 됨.
		t2.start();
		
		
	}

}
