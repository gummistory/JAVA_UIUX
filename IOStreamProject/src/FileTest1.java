import java.io.File;
import java.io.IOException;

public class FileTest1 {

	public static void main(String[] args) {
		// File
		// 파일 또는 디렉토리 정보를 다루는 기능 
		
		//File f = new File("/Users/lucykoo/Desktop/eclipse-workspace/IOStreamProject/src/FileTest1");
		//File f = new File("/Users/lucykoo/Desktop/eclipse-workspace/IOStreamProject/src", "FileTest1");
		File f = new File("/Users/lucykoo/Desktop/eclipse-workspace/IOStreamProject/src", "abc.txt");

			try {
				f.createNewFile();
			}catch(IOException e) {
				e.printStackTrace();
			}
		String fileName = f.getName();
		
		System.out.println(fileName);
		
		System.out.println(f.getPath());
		
		System.out.println(f.getAbsolutePath()); // 절대 경로 
		
		File newFile = new File("/Users/lucykoo/Desktop/eclipse-workspace/IOStreamProject/src", "rename.txt");
		
		f.renameTo(newFile); //복사의 개념 
		
		f.delete();
		System.out.println(newFile.getName());

	}

}
