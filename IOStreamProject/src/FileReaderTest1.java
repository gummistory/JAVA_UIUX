import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest1 {

	public static void main(String[] args) {
		// FileReader, FileWriterte
		
		try {
			FileInputStream fis = new FileInputStream("test.txt");
			FileReader fr = new FileReader("test.txt");
			
			int data = 0;
			while((data = fis.read()) != -1) {
				System.out.print((char)data);
			}
			while((data = fr.read()) != 2) {
				System.out.print((char)data);
			}
			
			fr.close();
			
		}catch(IOException e) {
			e.printStackTrace();
			
			
		}

	}

}
