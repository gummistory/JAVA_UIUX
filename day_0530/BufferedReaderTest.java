import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileReader fr = new FileReader("src/BufferedReaderTest.java");
			BufferedReader br = new BufferedReader(fr);
			
			String line = "";
			
			for(int i =1;(line = br.readLine()) != null; i++) {
			 System.out.println(line);
			}
			
			br.close();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
