import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class DataInputStreamTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileInputStream fis = null;
		DataInputStream dis = null;
		ArrayList<Integer> list = new ArrayList<>();
		

		try {
			 
			fis = new FileInputStream("score.data");
			dis = new DataInputStream(fis);
			
			while(true) {
				list.add(dis.readInt());
			}
			
		
		} catch (EOFException e) {
			System.out.println("파일 읽기 완료");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(list);
		
		int[] arr = list.stream().mapToInt(i -> i).toArray();
		
		int max = Arrays.stream(arr).max().getAsInt();
		int min = Arrays.stream(arr).min().getAsInt();
		int sum = Arrays.stream(arr).sum();
		double avg = Arrays.stream(arr).average().getAsDouble();

		// 최대값
		System.out.println("최대값 : " + max);
			
	    // 최소값
	    System.out.println("최소값 : " + min);

	    // 합계
	    System.out.println("합계 : " + sum);

	    // 평균
	    System.out.println("평균 : " + avg);
		
	}

}
