import java.util.Arrays;
public class Test02_0404 {

	public static void main(String[] args) {
		// 배열 예제
		// 행의 크기가 2이고 열의 크기가 5인 이차원 배열을 생성
		// 1 ~ 10까지 반복문을 사용하여 초기화 한다. 
		// 홀수만 출력한다. 
		//2차 배열 System.out.println(Arrays.deepToString(arr1)) 
//		
//		int[][] arr1 = {  // 배열 생성 및 초기화 
//				{1,2,3,4,5},
//				{6,7,8,9,10}
//		};
	 int[][] arr1 = new int [2][5];
		
	 for(int i = 0; i < arr1.length; i++) {
	    for(int j = 0; j < arr1[i].length; j++) {
	       arr1[i][j] = i * 5 + j + 1;
	       if(arr1[i][j] %2 ==1) { ///2로 나누면 홀수 
	        System.out.println(arr1[i][j]);
	     }
	   }
	 
   }
	 //System.out.println(Arrays.deepToString(arr1)); // [[1, 2, 3, 4, 5], [6, 7, 8, 9, 10]]


		
		
	 
		
		
	}

}
