
public class ThreadTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// sleep으로 호출한 스레드를 일시 정지 시킨다. 
		
		
		
		ThreadEx3_1 th1 = new ThreadEx3_1();
		ThreadEx3_2 th2 = new ThreadEx3_2();
	
		th1.start();
		th2.start();
		
		try {
			Thread.sleep(2000);  // 현재 sleep method 를 호출한 Thread 를 일시 정지 시킨다. ( 슬립이 호출한 스레드는 메인!)  
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("<<main종료>>");
		
	}

}
