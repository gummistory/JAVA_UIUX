import java.util.Scanner;
public class Test03 {

	public static void main(String[] args) {
		// 배열 예제 
		//1. 문제) 문자 10개를 저장할 수 있는 배열을 선언하고 
		//10개의 문자를 입력받아 입력받은 문자를 이어서 출력하는 프로그램 
		
//		String[] arr = {"a","b","c","d","e","f","g","h","i","j","k"};
//		for (String s : arr) {
//			System.out.print(s);
//		} // abcdefghijk
		
		//2.문제) 정수 10개를 입력받은 후 세번째, 다섯번쨰와 마지막으로 
		// 입력받은 정수를 차례로 출력하는 프로그램
		
//		Scanner sc = new Scanner(System.in); // 입력
//		int [] num = new int[10]; // 정수 10개를 입력 
//		
//		
//		for (int i = 0; i<10; i++) {
//			num[i] = sc.nextInt();
//		}
//		
//		System.out.println(num[2] + "\n" + num[4] + "\n" + num[9]); 
		
	 // 3. 최대 100개까지의 정수를 차례로 입력받다가 0이 입력되면 입력을 중단하고 짝수 번째에 입력된 정수를 모두 출력하는 프로그램 작성
		
		Scanner sc = new Scanner(System.in); //입력
		int [] max = new int[100]; // 최대 100 까지의 정수를 입력 
		
		// 정수 입력 받기
        for (int i = 0; i < max.length; i++) {
            max[i] = sc.nextInt();
            if (max[i] == 0) // 입력이 0이면 입력 중단
                break;
        }
        
        // 짝수 번째에 입력된 정수 출력
        for (int i = 1; i < max.length; i += 2) {
            if (max[i] == 0) // 0을 만나면 더 이상 출력할 필요 없음
                break;
            System.out.println(max[i]);
        }

	
	


	}

}
