
public class Customer implements Runnable {
	
	private Table table;
	private String food;
	
	public Customer(Table table, String food) {
		this.table = table;
		this.food = food;
	}

	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(100);   // 0.01 => 0.1
			}catch(InterruptedException e) {
				
			}
			
			String name = Thread.currentThread().getName();
			
			table.remove(food);
			
			System.out.println(name + " ate a " + food);
			
//			if(eatFood()) {
//				System.out.println(name + " ate a " + food);
//			}else {
//				System.out.println(name + " failed to " + food);
//			}
		}
	}
	
//	boolean eatFood() {
//		return table.remove(food);
//	}

}










