package stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamTest {

	// Stream 
	//  배열, 컬렉션
	// 데이터를 추상화(표준화)하여 값을 처리하고 연산하는 것을 통일 한다. 
	// 중간 연산, 최종 연산 
	// 스트림화 시킨다. 
	
	// 배열
	Stream<String> stream1 = Stream.of("a","b","c"); // 가변 인자
	Stream<String> stream2 = Stream.of(new String[ ] {"a", "b", "c"});
	Stream<String> stream3 = Arrays.stream(new String[] {"a","b","c"});
	
	IntStream IntStream.of(int...is value);
	IntStream IntStream.of(int []);
	IntStream Arrays.stream(int []);


}
