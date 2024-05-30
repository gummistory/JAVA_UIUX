
public class FunctionTest04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 가변인자 
		Function4 f4 = new Function4();
		f4.varArgs(1,2,3,4,5);  // 1 2 3 4 5 
		
		
		
		int [] arr = {6,7,8,9,10};
		f4.varArgs(arr);  // 1 2 3 4 5 6 7 8 9 10
		
		

	}

}
 