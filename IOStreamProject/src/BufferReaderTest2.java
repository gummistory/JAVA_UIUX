import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderTest2 {

	public static void main(String[] args) {
		// 다시 해보기 
		// FileWriter
		
		try {
			FileReader fr = new FileReader("src/BufferedReaderTest2.bak");
			BufferedReader br = new BufferedReader(fr);
			
			String line = "";
			
			for(int i = 1; (line = br.readLine()) != null; i++) {
				System.out.println(line);
			}
			br.close();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
