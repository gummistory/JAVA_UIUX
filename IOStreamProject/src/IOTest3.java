import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class IOTest3 {

	public static void main(String[] args) {
		
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;
		
		byte[] temp = new byte[4];
		
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;
		
		input = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream();
		
		System.out.println("input source : " + Arrays.toString(inSrc));
		
		try {
			while(input.available() > 0) {
				input.read(temp);  // 읽어온 값의 갯수( 4 -> 4 -> 2)
				output.write(temp);
				System.out.println("temp :" + Arrays.toString(temp));
				
				outSrc = output.toByteArray();
			}
			
			System.out.println("temp         : " + Arrays.toString(temp));
			System.out.println("output source : " + Arrays.toString(outSrc));
			
		}catch(IOException e) {
			
		}
	}

}









