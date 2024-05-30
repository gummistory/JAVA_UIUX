import java.util.Scanner;
import java.util.Arrays;
public class Test03_0404 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 빙고게임
		//변수 <->상수
		//10
//		int x;
//		x = 10;
//		x = 20;
//		
//		final double PI = 3.14;
//		System.out.println(PI);
		
//		// 무조건 초기화 시켜야함 
		// 위치값은 난수로 사용하고 행과 열은 인덱스번호로 (0~4까지가 난수)
		
		final int SIZE = 5;
		int x = 0, y =0;
		int num = 0;
		
		int[][] bingo = new int[SIZE][SIZE];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<bingo.length;i++) {
			for(int j=0; j<bingo[i].length;j++) {
				
				bingo[i][j] = i * SIZE + j + 1;
				
				

}
		} 
		
		
		//System.out.println(Arrays.deepToString(bingo));
		
		for(int i=0;i<SIZE;i++) {
			for(int j=0; j<SIZE;j++) {
	         x = (int)(Math.random()*SIZE);
	         y = (int)(Math.random()*SIZE);
	         
	       int  temp = bingo[i][j];
	       bingo[i][j] = bingo[x][y];
	       bingo[x][y] = temp;
	    
	         
			}
		  
				
	}//System.out.println(Arrays.deepToString(bingo));
//		for(int i=0;i<SIZE;i++) {
//			for(int j=0; j<SIZE;j++) {
//				System.out.print(bingo[i][j] + " ");
//			}
//			System.out.println();
//     }
		// arr[] 행의 위치 , arr[][] 열의 위치 / bingo 행 // 위에꺼랑 결과 랜덤 숫자로 똑같이나옴 
		// 2차원 구조는 행과 열을 따로 ! 
		
//		for(int[] a : bingo) {
//			for(int n: a ) {
//				System.out.print(n + " ");
//			}
//			System.out.println();
//		}
		
		//숫자 출력 scanner 이용
		do {
			for(int[] a : bingo) {
				for(int n: a ) {
					System.out.print(n + " ");
				}
				System.out.println();
			}
			System.out.println();
			// 출력문장을 printf로 , 0을 입력하면 종료됨, SIZE*SIZE =25  
			System.out.printf("1 ~ %d의 숫자를 입력하세요. (종료 :0)> ", SIZE*SIZE);
			// 숫자를 입력 받기 
			num = sc.nextInt();
			
			boolean flag = true;
			
			for(int i = 0; i<SIZE;i++) {
				for(int j = 0; j<SIZE;j++) {
				 if(bingo[i][j] == num) { //숫자를 찾아서 차례대로 맞추기 
				    bingo[i][j] = 0;
				     flag = false; // 실행 멈추기 
				     break;
				    }
				 }
				 if(!flag) { //!flag 부정 
					 break;
				 }
				 
			}
			
			int sum; //가로 조건
			flag = true;
			for(int i=0;i<SIZE;i++) {
				sum = 0;
				for(int j=0;j<SIZE;j++) {
					sum += bingo[i][j];
				}
				if( sum == 0) {
					flag = false;
					break;
					
					
				}
			}
			
//		int sum ;
//			
//			 for (int i = 0; i < SIZE; i++) {
//			        sum = 0;
//			        for (int j = 0; j < SIZE; j++) {
//			            sum += bingo[i][j];
//			        }
//			        if (sum == 0) {
//			            flag = false;
//			            break;
//			        }
//			    }
//			    if (!flag) {
//			        return true; // 가로 빙고
//			    }

			
			if(!flag) {
		     return;
		     }
			//세로 조건 만들기
	
			flag = true;
			for (int j = 0; j < SIZE; j++) {
			    sum = 0;
			    for (int i = 0; i < SIZE; i++) {
			        sum += bingo[i][j];
			    }
			    if (sum == 0) {
			        flag = false;
			        break;
			    }
			}

            if (!flag){
               return;
             }
			
	}while(num !=0); // num이 0이 아닐때까지 입력받기 
		
		for(int[] a : bingo) {
			for(int n: a ) { // a = 변수 int[] 열을 가져오는 것 
				System.out.print(n + " ");
			}
			System.out.println();
		}
		
		System.out.println("==============");
		System.out.println("= B I N G O =");
		System.out.println("==============");
//		
		
		// 숫자를 찾은 후에, 해당 줄에 대해{ 모든 열을 확인하여 모두 0으로 바뀌었는지를 확인하고, 그렇다면 빙고를 외칩니다.
	

		
		
 }
}


















