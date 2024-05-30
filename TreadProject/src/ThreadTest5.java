
public class ThreadTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runimpl5_1 r = new Runimpl5_1();
		
		Thread th1 = new Thread(r,"*");
		Thread th2 = new Thread(r,"**");
		Thread th3 = new Thread(r,"***");
		
		th1.start();
		th2.start();
		th3.start();
		
		try {
			Thread.sleep(2000); /// main thread가 2초동안 일시정지 
			th1.suspend();   			/// th1 thread 일시 정지 
			Thread.sleep(2000); // main thread 2초동안 일시 정지 
			th2.suspend();
			Thread.sleep(3000);
			th1.resume(); 				// suspend( ) 를 실행 대기 상태로 만든다.
			Thread.sleep(3000);
			th1.stop();
			th2.stop();
			Thread.sleep(2000);
			th3.stop();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}
