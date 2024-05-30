package workspace;

import java.util.Scanner;

public class project01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//실습 예제
		
		
		int x = 23;
		int y = 7;
		
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y );
		System.out.println(x / y);
		System.out.println(x % y );
		
		// 사각형의 면적과 둘레를 계산하여 출
		double a = 13.5;
		double b = 41.7;
		
		System.out.println("면적 : " + a * b);
		System.out.println("둘레 : " + (a+b)*2 );
		
		
		// 영어 문자열 값을 키보드로 입력받아 각 자리의 문자를 출력
		
		String z;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하세요 : ");
		z = sc.nextLine();
		System.out.println("첫번째 문자 : " + z.charAt(0)); // charAt문자열 
		
				
	}

}
