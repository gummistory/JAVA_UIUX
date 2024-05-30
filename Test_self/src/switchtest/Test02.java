package switchtest;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		// switch 예제
		//문제 2) 영문 대문자를 입력받아 'A'이면 "훌륭합니다.", 'B'이면 "좋습니다.", 'C'이면 "보통입니다.", 'D'이면 "노력하세요.", 
		//       그이외문자는 "잘못입력하셨습니다."라고 출력하는 프로그램
		
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("A");
		System.out.println("B");
		System.out.println("C");
		System.out.println("D");
		System.out.println("입력 하세요 ");
		
		String select = sc.next(); //문자열은 String 변수 = sc.next();
		switch(select) {
		case "A" : System.out.println("훌륭합니다.");
		break;
		case "B" : System.out.println("좋습니다.");
		break;
		case "C" : System.out.println("보통입니다.");
		break;
		case "D" : System.out.println("노력하세요.");
		default : System.out.println("잘못입력하셨습니다.");
		}
		}
		
		
	

	}

}
