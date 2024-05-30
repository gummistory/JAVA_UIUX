
public class Account {
	
	// 계좌 관리
	// TreadTest 6
	
	 private int balance = 1000; // 잔고 1000원
	 
	 public int getBalance() {
		 return balance;
	 }
	
	 
	 // synchronized 동기화 처리  ->  public synchronized void withdraw(int money)
	 public  void withdraw(int money) {   // 출금 가능하게
		 synchronized(this){
		 if(balance>=money) {
			 try {
				 Thread.sleep(1000);  // 1초에 한번씩 출금이 가능하게 시도 
			 }catch ( InterruptedException e) {
				 e.printStackTrace();
			 }
			
			 balance -= money; 	// 잔고가 0원이 될때 까지 출금 시도 
		 }
	 }
}
}
