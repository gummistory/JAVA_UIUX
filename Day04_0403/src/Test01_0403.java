
public class Test01_0403 {

	public static void main(String[] args) {
		// 배열 예제 
		//  int 크기가 10인 배열 생성
		// 반복문을 활용해서 1~10까지 정수로 초기화
		// 배열의 값의 총 합을 구하시오 
		
		
		//int [] arr; // 배열의 선언
		//arr = new int [10]; // 배열의 생성 
		
		int[] arr = new int [10];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (i + 1) ;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		
		}
		System.out.println(sum);
//		1
//		2
//		3
//		4
//		5
//		6
//		7
//		8
//		9
//		10
//		55

	
			
	}	

}
