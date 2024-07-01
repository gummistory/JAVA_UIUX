import java.io.File;

public class FileTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("/Users/lucykoo/Desktop/eclipse-workspace");
		
		if(!f.exists() || f.isDirectory()) {
			System.out.println("파일 정보가 존재하지 않습니다.");
			System.exit(0); //프로그램 강제종료 
			
			
		}
		
		File[]files = f.listFiles();
		
		
		for(int i =0; i<files.length; i++) {
			String fileName = files[i].getName();
			System.out.println(files[i].isDirectory()?"[" + fileName + "]" : fileName);
			
		}
		
	}

}
