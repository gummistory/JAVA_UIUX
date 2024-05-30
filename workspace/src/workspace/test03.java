package workspace;

public class test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// switch-case & random 
		// random으로  점수 
		int score = 0;
		score = (int)(Math.random()*100)+1;
		
		switch(score /10 ) { //switch문은 범위가 없음 
		case 10 :
		case 9 :
			System.out.println("점수 : " + score + ", 학점 : A");
			 break;
		case 8 :
			System.out.println("점수 : " + score + ", 학점 : B");
			 break;
		case 7 :
			System.out.println("점수 : " + score + ", 학점 : C");
			 break;
		default  :
			System.out.println("점수 : " + score + ", 학점 : F");
		}
		
	}

}
