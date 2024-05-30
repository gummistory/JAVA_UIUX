import java.util.Scanner; /* Scanner 페키지 선언 */

public class BankApplication {
    private static Account[] accountArray = new Account[10]; /* 배열 생성 */
    private static Scanner scanner = new Scanner(System.in); /* 스캐너 객체 생성 */
    
    public static void main(String[] args) {
        boolean run = true;
        while(run) {
            System.out.println("------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("------------------------------------------");
            System.out.print("선택> ");
            
            int selectNo = sc.nextInt(); /* scanner 입력코드 완성 */
         
            
            if(selectNo == 1) {
            	createAccount();
            } else if(selectNo == 2) {
            	accountList();
            } else if(selectNo == 3) {
            	deposit();
            } else if(selectNo == 4) {
            	withdraw();
            } else if(selectNo == 5) {
            	findAccount();
            }
        }
        System.out.println("프로그램 종료");
    }
    
    //계좌생성하기
    private static void createAccount() {
        
    }
    
    //계좌목록보기
    private static void accountList() {
        
    }
    
    //예금하기
    private static void deposit() {
       
    }
    
    //출금하기
    private static void withdraw() {
        
    }
    
    
    //Account 배열에서 ano와 동일한 Account 객	체 찾기
    private static Account findAccount(String ano) {
        
    }
}
