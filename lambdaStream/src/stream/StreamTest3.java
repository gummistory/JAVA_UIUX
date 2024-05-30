package stream;

import java.util.stream.IntStream;

public class StreamTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IntStream intStream = IntStream.of(1,2,3,4,5);
		intStream.forEach(System.out::println);
		
		System.out.println("========");
		
		IntStream.range(1,5).forEach(System.out::println); // 마지막은 포함안한다. 
		
		System.out.println("========");
		
		IntStream.rangeClosed(1,5).forEach(System.out::println); // 마지막 포함
		
		System.out.println("=======");
		
		IntStream.rangeClosed(1,5)
				.map(n-> n * n)
				.filter(n -> n % 2 ==0)
				.forEach(System.out::println);
		
		
		// 		sum(), average(), max(), min()
		System.out.println("=======");
		int sum = IntStream.rangeClosed(1,5).sum();
		System.out.println(sum);
		double avg = IntStream.rangeClosed(1,5).average().getAsDouble();
		System.out.println(avg);
		int max= IntStream.rangeClosed(1, 5).max().getAsInt();
		System.out.println(max);
		
		
		// anyMatch( )
		// 스트림의 요소 중 어느 하나라도 주어진 술어를 만족하면 'true'를 반환 
		// return type = boolean
		
		System.out.println("=======");
		boolean anyMatch = IntStream.rangeClosed(1, 5).anyMatch(n -> n==3);
		System.out.println(anyMatch);
		
		
		

	}

}
