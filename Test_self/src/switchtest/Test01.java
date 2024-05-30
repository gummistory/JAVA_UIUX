package switchtest;
import java.util.Scanner;
public class Test01 {

	public static void main(String[] args) {
		// Switch 예제
		//문제 1) 아래의 메뉴를 보여주고, 선택한 메뉴를 알려주는 프로그램 작성
//   출력예) 1. 삽입
//         2. 수정
//	       3. 삭제
//		   입력예) 숫자를 선택하세요. : 2
//		   출력예) 수정을 선택하셨습니다.
		Scanner sc = new Scanner(System.in); 
		while(true){
			System.out.println("숫자를 선택하세요.");
			System.out.println("1. 삽입");
			System.out.println("2. 수정");	
			System.out.println("3. 삭제");
			
			
			int select = sc.nextInt();
			switch(select) {
			case 1 : System.out.println("삽입을 선택하셨습니다.");
			break;
			case 2 : System.out.println("수정을 선택하셨습니다.");
			break;
			case 3 : System.out.println("삭제를 선택하셨습니다. ");
			break;
			default : System.out.println("잘못 입력 하였습니다.");
			}
			
		}
	
		


	}

}
