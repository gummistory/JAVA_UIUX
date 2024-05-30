
public class TreadTest6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RunnableEx_1 r = new RunnableEx_1();
		
		new Thread(r).start();
		new Thread(r).start();

	}

}
