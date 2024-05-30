import java.util.Arrays;
import java.util.Collections;
public class Project01_0404 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // 중첩 반복문
	    // 2개의 배열을 오름차순, 내림차순으로 출력할 때
		// 새로운 배열로 start 
		
		// temp = 빈공간
		
//		int temp;
//		int x = 10;
//		int y = 20;
//		System.out.println(x + "," + y); //10,20
//		
//		temp = x;
//		x = y;
//		y = temp;
//		
//		System.out.pritln(x + "," + y); //20,10

		//x = y; , y = x; // 변수는 = 해버리면 원래 데이터가 사라짐. 
		
		
		
// 		int[] arr1 = {2,7,3,5,1}; // 맨 앞에 있는 데이터를 기준으로 잡고 다음 배열과 비교
//        Integer[] arr2 = {2,7,3,5,1};
//		// 오름차순 
// 		for(int i= 0; i<arr1.length -1;i++) {
//			for(int j = i+1; j<arr1.length; j++ ) {
//				int temp; // 위치를 이동시켜서 비교해야하니 빈공간이 필요 
//				if(arr1[i] > arr1[j]) {
//					temp = arr1[i];
//					arr1[i] = arr1[j];
//					arr1[j] = temp;
//					
//				}
//			}
//		}
//		 //for (int i = 0; i < arr1.length; i++) {
//	     //       System.out.print(arr1[i] + " ");  1 2 3 5 7 
//		
//		System.out.println(Arrays.toString(arr1)); //[1, 2, 3, 5, 7]
 		
 		// 내림차순 // 으로 할때는 if( arr1[i] < arr1[j] 부등호만 변경해주면됨 
	
//		 for (int i = 0; i < arr1.length - 1; i++) {
//	            for (int j = i + 1; j < arr1.length; j++) {
//	                int temp;
//	                if (arr1[i] < arr1[j]) { // 부등호 변경
//	                    temp = arr1[i];
//	                    arr1[i] = arr1[j];
//	                    arr1[j] = temp;
//	                }
//	            }
//	        }
//
//	        // 정렬된 배열 출력
        
           // 오름차순 
// 		   Arrays.sort(arr1); // 오름차순 정렬끝 [1, 2, 3, 5, 7]
//	       System.out.println(Arrays.toString(arr1));
 		
        
          // 내림차순 -> int x integer로 출력 가능  // 출력 : [7, 5, 3, 2, 1] 
// 		   Arrays.sort(arr2, Collections.reverseOrder()); //import java.util.Collections; 필수
// 		    System.out.println(Arrays.toString(arr2));
 		  
	  // 2차원 배열 -> 행&열 구조// 앞이 행의 크기 뒤가 열의크기
//        int[][]arr1; //배열의 선언   
//        arr1 = new int [5][3];
//        
//		int [][] arr1 = new int [5][3]; // 선언과 생성 동시에
//		
//        arr1[0][0] = 1; // 배열의 초기화 
//        arr1[0][1] = 2;
//        arr1[0][2] = 3;
//        
//        arr1[1][0] = 4;
//        arr1[1][1] = 5;
//        arr1[1][2] = 6;
//        
//        
//        arr1[4][0] = 13;
//        arr1[4][1] = 14;
//        arr1[4][2] = 15;
		
		
		// 선언 생성 초기화가 동시에 이루어진 상태 // 열 : 숫자 // 행 : 대괄호 갯수
		
//		int[][] arr1 = { 
//				{1,2,3}, //대괄호 삽입시 한행이 만들어진것 
//				{4,5,6},
//				{7,8,9},
//				{10,11,12},
//				{13,14,15},
//		
//		};
////        
//        System.out.println(arr1[0][0]);
//        System.out.println(arr1[4][2]);
		
		
		int[][] arr1 = { 
				{1,2,3}, //대괄호 삽입시 한행이 만들어진것 
				{4,5,6},
				{7,8,9},
				{10,11,12},
				{13,14,15}
		
		};
		
		// length 이용 
		// arr.length 는 행의 크기 , arr1[0] = 0번째 행을 가르키는 열의 크기 

//		for(int i=0;i<arr1.length;i++) {
//			for(int j=0; j<arr1[i].length;j++) {
//				System.out.print(arr1[i][j] + " ");
//				
//			} System.out.println();
//		}
		
		//결과 
		//1 2 3 
		//4 5 6 
		//7 8 9 
		//10 11 12 
		//13 14 15 
		
//		
//		// 반복문 구조 
		
//		for(int i =0;i<5;i++) {
//			for(int j =0; j<3; j++) {
//				System.out.print(arr1[i][j] + " ");
//				
//			}
//			System.out.println(); 
//	}
		
		//결과 
		//1 2 3 
		//4 5 6 
		//7 8 9 
		//10 11 12 
		//13 14 15 
		

	}

}
