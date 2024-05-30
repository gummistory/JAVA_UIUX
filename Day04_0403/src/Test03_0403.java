import java.util.Scanner;

public class Test03_0403 {

	public static void main(String[] args) {
		// 과목중에 가장 점수가 높은 과목의 이름과 점수를 출력 
		
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

	     //int i = 0;
	     //for(String sub : subject) {
	    //	 System.out.println(sub + "점수 : " + score[i++]);
	     //}
	     
	     
	     System.out.println("총점 : " + sum);
	     System.out.println("평균 : " + avg);
	     
	  // 과목중에 가장 점수가 높은 과목의 이름과 점수를 출력 
	     
//	     int max = score[0];
//	     String maxsub = null;
//	     for(int i = 1; i<score.length;i++) {
//	    	 if(max <score[i]) {
//	    		 maxsub = subject[i];
//	    		 max = score[i];    		
//	    	 }
//	     }
//	     System.out.println(maxsub + "과목의 점수가 가장 높습니다." + max + "점" );
	     
	     int low = score[0];
	     String lowsub = null;
	     for(int j = 1; j<score.length-1; j++ ) {
	    	 if(score[j]<low) {
	    		 low = score[j];
	    		 lowsub = subject[j];
	    	 }
	     }
	     System.out.println(lowsub + "제일 낮은 과목의 점수 : " + low + "점");
  
	   
	       
	     
//	     int highscore = 0;
//	     String highsubject = "";
//	     for (int j=0; j<score.length; j++) {
//	    	 if(score[j]>highscore) {
//	    		 highscore = score[j];
//	    		 highsubject = subject[j];
//	    	 }
//	     }
//	     
//       System.out.println("가장 높은 점수를 받은 과목: " + highsubject);
//       System.out.println("최고 점수: " + highscore);
	   
	      
	    		 
	    
	
	     
	    


	}

}
