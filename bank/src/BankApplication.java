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
            
            int selectNo = scanner.nextInt(); /* scanner 입력코드 완성 */
         
            
            if(selectNo == 1) {
            	createAccount();
            } else if(selectNo == 2) {
            	accountList();
            } else if(selectNo == 3) {
            	deposit();
            } else if(selectNo == 4) {
            	withdraw();
            } else if(selectNo == 5) {
            	System.out.println("프로그램 종료");
            	break;
            }
        }
    }
    
    //계좌생성하기
    private static void createAccount() {
    	System.out.println("------------------------------------------");
        System.out.println("계좌생성");
        System.out.println("------------------------------------------");
        System.out.print("계좌번호: ");
        String ano = scanner.next();
        System.out.print("계좌주: ");
        String owner = scanner.next();
        System.out.print("초기입금액: ");
        int balance = scanner.nextInt();
        System.out.print("결과: ");
        for (int i = 0; i <10; i++) {
        	if(accountArray[i] == null) {
        		accountArray[i] = new Account(ano, owner, balance);
        		System.out.println("계좌가 생성되었습니다.");
        		break;
        	}
        }
        
    }
    
    //계좌목록보기
    private static void accountList() {
    	System.out.println("------------------------------------------");
    	System.out.println("계좌목록");
    	System.out.println("------------------------------------------");
    	if(accountArray.length == 0) {
    	   System.out.println("저장된 데이터가 없습니다.");
    	   return;
       }
       for(int i = 0;i<accountArray.length; i++) {
    	   if(accountArray[i] != null) {
    		   System.out.print("");
    		   accountArray[i].show();
    	   }
       }
    }
    
    //예금하기
    
    private static void deposit() {
        System.out.println("------------------------------------------");
        System.out.println("예금");
        System.out.println("------------------------------------------");
        System.out.print("계좌번호:");
        String ano = scanner.next();
        System.out.print("예금액:");
        int balance = scanner.nextInt();
        System.out.print("결과:");

        boolean found = false; // 초기화를 false로 변경
        for (int i = 0; i < 10; i++) {
            if (accountArray[i] != null && accountArray[i].getAno().equals(ano)) {
                
                System.out.println("입금이 성공되었습니다.");
                found = true; // 계좌를 찾았음을 표시
                break;
            }
        }
        if (!found) { // 계좌를 찾지 못한 경우
            System.out.println("계좌가 없습니다.");
        }
    }

    	
    
    
    //출금하기
    private static void withdraw() {
        System.out.println("------------------------------------------");
        System.out.println("출금");
        System.out.println("------------------------------------------");
        System.out.print("계좌번호:");
        String ano = scanner.next();
        System.out.print("출금액:");
        int balance = scanner.nextInt();
        System.out.print("결과:");
        boolean found = false;
        boolean found1 = false; // 초기화를 false로 변경
        for (int i = 0; i < 10; i++) {
            if (accountArray[i] != null && accountArray[i].getAno().equals(ano)) {
                
                System.out.println("출금이 성공되었습니다.");
                found1 = true; // 계좌를 찾았음을 표시
                break;
            }
        }
        if (!found1) { // 계좌를 찾지 못한 경우
            System.out.println("계좌가 없습니다.");
        }
    }

    
    
    
    //Account 배열에서 ano와 동일한 Account 객체 찾기
    private static void findAccount(String ano) {
        boolean found = false;

        for (int i = 0; i < accountArray.length; i++) {
            if (accountArray[i] != null && accountArray[i].getAno().equals(ano)) {
                accountArray[i].show();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("계좌가 없습니다.");
        }
    }

    
	   
}
    
