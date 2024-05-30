
package workspace;

import java.util.Scanner;

public class test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("나이를 입력 :");
//		int age = scan.nextInt();		
//		if(age > 19) {
//			System.out.println("성인입니다");
//			
//		}else {
//			System.out.println("미성년자 입니다. ");
//		}
//		// 스캐너 사용 후 닫아야함 
//		scan.close();
		
	Scanner scan = new Scanner(System.in);
	System.out.println("점수를 입력하세요 :");
	int score = scan.nextInt();
	
	if(score >= 99) {
		System.out.println("점수 :" + score + ", 학점 : A ");
	} else if(score >=80 && score <90) {
		System.out.println("점수 :" + score + ", 학점 : B ");
	}else if(score >=70)  {
		System.out.println("점수 :" + score + ", 학점 : C");
	} else {
		System.out.println("점수 : " + score + ",학점: F");
	}
	}

}
