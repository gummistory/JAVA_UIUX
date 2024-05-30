package switchtest;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		// 문제 3) 점수를 입력 받아 "수우미양가"를 평가하는 프로그램 // if 문으로 하기 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		
		
		String score = sc.next();
		switch (score) {
        case "수":
            System.out.println("수");
            break;
        case "우":
            System.out.println("우");
            break;
        case "미":
            System.out.println("미");
            break;
        case "양":
            System.out.println("양");
            break;
        case "가":
            System.out.println("가");
            break;
        default:
            System.out.println("잘못된 입력입니다.");
		
		}

	}

}
