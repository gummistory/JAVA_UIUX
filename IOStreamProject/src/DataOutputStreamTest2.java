import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] score = {100,90,95,85,50,80,45,78};
		
		try {
			 
			FileOutputStream fos = new FileOutputStream("score.data");
			DataOutputStream dos = new DataOutputStream(fos);
			
			for(int i : score) {
				dos.writeInt(i);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
