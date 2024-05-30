import java.util.Arrays;
public class FunctionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//static method 참조 방법 생성없이 가능 
		Function.staticMethod(); //클래스 메소드 호출,  인스턴스 메소드 호출, 클래스 메소드 호출
                                
		
		Function f = new Function();
		// call by value	
		//int x = 10;
		
		//data class만든거 생성
//		Data d = new Data(); // 주소값, 객체가 생성되고 나서 생긴 
//		d.x = 10;  // int x 에 10이 들어갔다는 이야기 *data class
//		
//		f.change1(d.x); // d.x = d를 넣은거와 같음 // 해당 방식은 value 방식 
//		System.out.println(d.x);
//		
//		
//		f.change2(d);
//		System.out.println(d.x);
		
//		int[] arr= {1,2,3,4,5};
//		System.out.println(Arrays.toString(arr)); 
//		
//		f.arrChange(arr);
//		
//		
//		System.out.println(Arrays.toString(arr));
		
		f.instanceMethod();
		f.staticMethod();
		
		

	}

}
