
public class TreadEx1_1 extends Thread {
		// run () 메소드를 오버라이딩 해야한다. 
		// 프로세스 안에서 독립적으로 돌아 가는 것 
		// 쓰레드클래스를 상속한 스레드를 만든 것 
	
	
	@Override
	public void run() {
		for(int i = 0; i<5; i++) {
			System.out.println(getName()); // 정의 한적 없는데 쓰는 것은 전부 상속 받은 것 
		}
	}
}
