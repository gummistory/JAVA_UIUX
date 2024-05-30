
public class ThreadEx3_1 extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i<300; i++) {
			System.out.println("-");
		}
		
		System.out.println("<<th1종료>>");
	}



	
	
}
