
public class StringTest {

	public static void main(String[] args) {
		// 문자열 비교 //,== 쓸수 없음! 무조건  equals!!!!
//		String str = "hello";
//		str += "world";
//		
//		String str2 = new String ("hello");
		
		
//		String str1 = "hello";
//		String str2 = "world";
//		
//		if(str1.equals(str2)) {
//			System.out.println("같다");
//		}else {
//			System.out.println("다르다");
//		}
//
//		///////////////////	/////
//		
//		char[] cArr = {'h', 'e','l','l','o'};
//		String str = new String(cArr);
//		System.out.println(str); //hello
//		
//		// 문자열은 index 번호 부여됨
//		
//		String str3 = "hello";
//		System.out.println(str3.charAt(4)); // ()안에 배열 순서 , 한글자만 출력 
//		
//		
//		
//		for(int i = 0; i < str3.length(); i++) {
//			System.out.println(str3.charAt(i)); 
//			//h
//			//e
//			//l
//			//l
//			//o
//
//		}
		
		
		// 위치값
//		String str4 = "world";
//		System.out.println(str4.indexOf('r'));
//		System.out.println(str4.indexOf("ld"));
//		
//		String str5 ="cat, dog, bear";
//		String[]arr = str5.split(",");
//		
//		String str6 = "java.lang.Object";
//		str6.substring(5,9);
//		
//		
//		int x = 100;
//		
//		String is = String.valueOf(x);  // boolean, int, long , float
//		System.out.println(is);
//		
//		
//		if ("hello".equals("hello")) {
//			System.out.println("같다 ");
//		}
//		
		
		//StringBuffer  / StringBuilder

//		StringBuffer sb = new StringBuffer("abc");
//		System.out.println(sb);
//		
//		sb.append("001");
//		System.out.println(sb);
//		
//		System.out.println(sb.length());
//		sb.delete(1, 3);
//		System.out.println(sb);
//		System.out.println(sb.length());
		
		
		StringBuffer sb1 = new StringBuffer("abc");		
		StringBuffer sb2 = new StringBuffer("abc");
		
		if (sb1.equals(sb2)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		
		String str1 = sb1.toString();
		String str2 = sb2.toString();
		
		
		if (str1.equals(str2)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
	}


}
