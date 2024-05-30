import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Account {
	
	public static boolean Account = false;
	private String ano; //계좌번호
	private String owner;  //계좌주
	private int balance;  //초기입금액



	
	
	
	public Account(String ano, String owner, int balance) { 
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
		/* 생성자 초기화 */ 
	} 
	
	void show() {
		System.out.println(ano + " " + owner + " " + balance);
		
		
	}





	


	
	
	
	
	// Setter와 Getter 메소드 완성
}

