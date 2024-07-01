import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileViewer {

	public static void main(String[] args) {
		
		// FileInputStream , FileOutputStream
		
		try {
			
			FileInputStream fis = new FileInputStream("src/FileViewer.java");
			
			int data = 0;
			
			while((data = fis.read()) != -1) {
				char c = (char)data;
				System.out.print(c);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
