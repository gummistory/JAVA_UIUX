
public class RunnableEx_1 implements Runnable {
//돈 빼는 사람
	
	Account acc = new Account();  //  멤버 변수 -> 멤버변수는 공유 되어진다. 
	
	@Override
	public void run() {
		while(acc.getBalance()>0) {
			// 100,200,300  3개의 금액중 랜덤하게 출금되게 
			
			int money = (int)(Math.random()*3+1)*100;
			acc.withdraw(money);
			System.out.println("balance : "+ acc.getBalance());
		}
		
	}
}
