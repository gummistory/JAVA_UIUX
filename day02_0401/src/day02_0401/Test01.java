package day02_0401;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//바구니 하나에 사과를 10개 담을 수 있다. 
		//사과는 123개가 있다. 그러나 사과의 갯수는 변경 될 수 있다. 
        // 바구니의 갯수는 몇개가 필요한가요 ? 
		
		int x = 123;
		int y = 10;
		int z = x / y ;
		
	    z += (x % y != 0) ? 1 : 0; 
		
		System.out.println("바구니 갯수는 : " + z);
		
		
		
		int numofApple = 123;
		int sizeofBucket = 10;
		
		int numofBucket;
		
		numofBucket = numofApple / sizeofBucket + (numofApple % sizeofBucket > 0 ? 1 : 0 );
		
		
		System.out.println("바구니 갯수 : " + numofBucket);
		
		
		
		
		// 출력하세요. ( 몫만 남기고 곱하기 )
		// 456 -> 400
		// 124 -> 100
		
		
		int num = 456;
        int roundedNum = (num / 100) * 100;
        System.out.println(roundedNum);
		
        
        int num2 = 124;
        int roundedNum2 = (num2/100) * 100;
        System.out.println(roundedNum2);
		
		
        int num3 = 456;
        System.out.println((num3/100)*100);
		
	
   
        
        	
	
		
		
		
		
		
		
	}

}
