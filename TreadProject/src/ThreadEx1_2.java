
public class ThreadEx1_2 implements Runnable {

	
	// run  메소드를 오버라이딩 해야한다. -> 쓰레드 클래스로 사용하려면 꼭 오버라이딩 진행 해야함
	@Override
	public void run() { // 반복문 5번 돌리는 형태로 구성 
		for(int i=0; i<5;i++) {
			System.out.println(Thread.currentThread().getName()); // Thread 고유의 이름을 출력, 스레드 클래스를 상속받은 애들은 바로 get name 호출 가
		}
		
		
	}

}
