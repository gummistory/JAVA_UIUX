package workspace;

import java.util.Scanner;

public class project02 {

	public static void main(String[] args) {
		//switch - case 문 
		
		// 출력 예 1. 삽입 , 2.수정 3. 삭제 
		// 입력 예 : 숫자를 선택하세요 
		// 출력예 선택하셨습니다. 
//		
//		Scanner src = new Scanner(System.in);
//		System.out.println( " 1.  삽입 ");
//		System.out.println(" 2.  수정 ");
//		System.out.println(" 3.  삭제  ");
//		
//	   System.out.println(" 숫자를 선택하세요 : ");
//	   int a = src.nextInt();
//	   String b = "";
//	   String c = "%s 선택하셨습니다";
//	   
//	  switch(a) {
//	  			case 1 : 
//	  					b = "삽입을";
//	  					break;
//	  			case 2 :
//	  				   b = "수정을 ";
//	  				   break;
//	  			case 3 :
//	  					b = " 삭제를 ";
//	  				break;
//	  				default :
//	  					c = "입력값이 잘못되었습니다. ";
//	  }
//	  System.out.printf(c, b);
//	}

		System.out.println("점수를 입력하세요 :");
	 Scanner src = new Scanner(System.in);
	 	int score = src.nextInt();
	 	
	 	String grade = "가";
	 	
	 	
	 	if (score >= 0 && score<=100) {
	 		switch(score/10) {
	 		case 10 :
	 		case 9 :
	 			grade = " 수 ";
	 		break;
	 		case 8 :
	 			grade = " 우 ";
	 			break;
	 		case 7 : 
	 			grade = " 미 ";
	 			break;
	 		case 6 :
	 			grade = " 양 ";
	 		
	 		}
	 	} else {
	 		grade =" 점수값이 잘못되었습니다. ";
	 	}
	  System.out.println(grade);
	 	
		
	}
		}
