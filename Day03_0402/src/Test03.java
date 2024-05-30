
public class Test03 {

	public static void main(String[] args) {
		// 무한 반복문 예제 
		
	
//		for(int i=1;i<=5;i++) {
//			System.out.println("*****");
//		}
		
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=10;j++) {
//				System.out.println("*");
//			}
//		} // 행이 10개 출력
		
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=10;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		} // 열 & 행 출력 
//		
//		// while 사용하여 출력
//		int i = 1;
//		while(i<=5) {
//			int j=1;
//			while(j<=10) {
//				System.out.print("*");
//				j++;
//		 }
//			System.out.println();
//			i++;
//		}
		// 결과 
//		**********
//		**********
//		**********
//		**********
//		**********
		
		//i<=5;i++ > 반복횟수 , ? > 구하고 싶은 값
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//				
//			} System.out.println();
//		}
//		결과 
//		*
//		**
//		***
//		****
//		*****
		 
		// 반대로 나오는 예제 
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=5;j++) {
//				if(i + j <6) {
//					System.out.print(" ");
//				}else {
//					System.out.print("*");
//				}
//				
//			} System.out.println();
//		}
		
//		결과
//	     *
//	    **
//	   ***
//	  ****
//	 *****

//		for(int i=5;i>=1;i--) {
//			for(int j=5;j>=1;j--) {
//				if(i + j <6) {
//					System.out.print(" ");
//				}else {
//					System.out.print("*");
//				}
//				
//			} System.out.println();
//		}
		
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=5;j++) {
//				if(i > j) {
//					System.out.print(" ");
//				}else {
//					System.out.print("*");
//				}
//				
//			} System.out.println();
//		}
		// 결과 
//		*****
//		 ****
//		  ***
//		   **
//		    *
//		for(int i=5;i>=1;i--) {
//			for(int j=5;j>=1;j--) {
//				if(i < j) {
//					System.out.print(" ");
//				}else {
//					System.out.print("*");
//				}
//				
//			} System.out.println();
//		}
		//
//		for(int i=1;i<=5;i++) {
//			for(int j=1; j<=5 + i -1;j++) {
//				if(i+j<6) { 
//					System.out.print(" ");
//				}else {
//					System.out.print("*");  
//				}
//			} System.out.println();
//		}
//		for(int i=1;i<=6;i++) {
//			for(int j=1; j<=6 + i -1;j++) {
//				if(i+j<7) { 
//					System.out.print(" ");
//				}else {
//					System.out.print("*");  
//				}
//			} System.out.println();
//		}
		
		for(int i=1;i<=3;i++) {
			for(int j=0;j<2+i;j++) {
				if(i+j<3) { 
					System.out.print(" ");
				}else {
					System.out.print("*");  
				}
     		} System.out.println();
     		



	} 

	}
}
