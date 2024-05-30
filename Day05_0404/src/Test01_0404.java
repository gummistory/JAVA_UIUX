import java.util.Arrays;
import java.util.Collections;
public class Test01_0404 {

	public static void main(String[] args) {
		// 반복문 배열 예제
		
		//int [] arr1 = {1,2,3,4,5}; // 해당 배열 이용하여 출력 
		//int [] arr2 = new int [5]; //
		
		//for(int i=0; i<3;i++){
		//        arr2[i+2] = arr1[i]; 
		//}
		
		
		 // 원래 하던 방식의 arr2 배열 출력 방법
		
		 //System.out.print("arr2 : ");
	     //  for (int i = 0; i < arr2.length; i++) {
	     //      System.out.print(arr2[i] + " ");
	     //  }
//		
//	    //*Arrays.toString( ) // 결과 배열만 출력 + import java.util.Arrays; 필수
//	
//		System.out.println(Arrays.toString(arr1)); // 결과만 볼때 /[1, 2, 3, 4, 5]
//		System.out.println(Arrays.toString(arr2)); // 결과만 볼때 /[0, 0, 1, 2, 3]
//	     
		//*arraycopy(값을 가진 배열, 인덱스값, 값을 복사할 배열, 인덱스 값, 크기 
//	    System.arraycopy(arr1, 0, arr2, 2, 3); ]
//	    System.out.println(Arrays.toString(arr2)); //[0, 0, 1, 2, 3]
		
//		 System.arraycopy(arr1, 0, arr2, 0, arr1.length); 
//		 System.out.println(Arrays.toString(arr2)); //[1, 2, 3, 4, 5]
		
		
		//* copyOf()
		
//		arr2= Arrays.copyOf(arr1, arr1.length); //[1, 2, 3, 4, 5] arr.length자리에 숫자 3쓰게되면 [1, 2, 3]
//		System.out.println(Arrays.toString(arr2));
		
		
		//* copyOfRange()
		
//		arr2 = Arrays.copyOfRange(arr1, 2, 5); // arr1 -> arr1에서 가져옴 2->몇번부터 가져오냐,3-> 몇번째에 위치한 배열을 가져오는지
//	    System.out.println(Arrays.toString(arr2));
		
		
       
	}
		 
		
	
	
		 


}



