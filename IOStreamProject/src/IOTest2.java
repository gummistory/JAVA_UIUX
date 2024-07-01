import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class IOTest2 {

	public static void main(String[] args) {
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;
		
		byte[] temp = new byte[10];
		
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;
		
		input = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream();
		
		input.read(temp,0,temp.length);  // 0 ~ 9
		output.write(temp,5,5);   // 5,6,7,8,9
		
		outSrc = output.toByteArray();  // 스트림된 내용을 byte배열로 반환 해 준다.
		
		System.out.println("input source : " + Arrays.toString(inSrc));
		System.out.println("temp         : " + Arrays.toString(temp));
		System.out.println("output source : " + Arrays.toString(outSrc));
	}

}









