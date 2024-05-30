import java.util.Scanner;
public class Test02_0403 {

	public static void main(String[] args) {
		// 성적 구하는 프로그램 만들기 예제 
		
		String[] subject = {"국어","영어","수학","과학","사회"};
		
		int[] score = new int[5]; //과목별 점수 //5과목 이라 int 5
		int sum = 0; // 합 
		double avg = 0.0; // 평균 소수점 double or float 사용 
		
		Scanner sc = new Scanner(System.in); // 5과목을 순차적으로 점수를 입력 받으려고 사용
		
		for(int i=0; i<score.length;i++) { // 5번 스코어에 입력 받아야하니 score.length
		    System.out.println("[" + subject[i] + "] 점수를 입력하세요."); // 국어부터 가져옴 index 0~4 국
		    score[i] = sc.nextInt(); // 5번 돌려줌	    
		}
		for( int num: score) {
			sum += num;			
		}
		
	     avg = sum / (double)score.length; //배열의 크기를 지정해줄 수 있음 score.length = 5과목 (배열의 크기)
	     
	     // 아래 string 이랑 같은 형식
	     //for(int i=0;i<5;subject.length;i++) {
	     //      System.out.println(subject[i] + "점수 : " + score[i]);
	   
	     // }
	     
	     int i = 0;
	     for(String sub : subject) {
	    	 System.out.println(sub + "점수 : " + score[i++]);
	     }
	     
	     
	     System.out.println("총점 : " + sum);
	     System.out.println("평균 : " + avg);

	}

}
