package stream;

import java.io.File;
import java.util.stream.Stream;

public class StreamTest2 {
	public static void main (String[ ] args) {
		File[ ] fileArr = {
				new File("Ex1.java"), new File("Ex1.bak"),
				new File ("Ex2.java"), new File("Ex1"), new File("Ex1.txt")
		};
		
		//File f1 = fileArr[0];
		
		//System.out.println(f1.getName());
		
		Stream<File> fileStream = Stream.of(fileArr);
		Stream<String> filenameStream = fileStream.map(File::getName);
		
		filenameStream.forEach(System.out::println);
		
		// map( ) , filter ( ), distinct( ), forEach( )
		
		fileStream = Stream.of(fileArr); 	// 스트림을 다시 실
		fileStream.map(File::getName) // Stream<File> -> Stream<String>
						.filter(s -> s.indexOf('.') != -1)	// 확장자가 없는 것은 제외 
						.map(s -> s.substring(s.indexOf('.')+1)) // 확장자만 추려서 다시한번 스트림화 해주세요 
						.map(String::toUpperCase)
						.distinct() // 중복 제거 
						.forEach(System.out::println);
						
						
						
	}
}
