package project;
import java.util.Scanner;


public class ScoreTest {
	
	// 메소드를 사용하려면 멤버 변수 사용 
	// 배열 선언 해야함 
	
	static ScoreData[] scoreData = new ScoreData[10];
	static Scanner sc = new Scanner(System.in);
	

	public static void main(String[] args) {
		//static끼리는 바로 출력 가능하다. 
		//showMenu(); 잘 출력되는지 바로 출력 가능 
		// while (true), if , switch 무한 반복문 사용
		
		int menu;
		
		while(true) {
			showMenu();
			System.out.println("메뉴 선택 : ");
			menu = sc.nextInt();
			// 1번을 누르면 성적 조회 나오게 etc 
			if(menu == 1) {
				showAllScores();
			}else if(menu == 2) {
				registerScore();
			}else if(menu == 3) {
				searchScoreByName();
			}else if(menu == 4) {
				deleteScoreByName();
			}else if(menu == 0) {
				System.out.println("프로그램 종료");
				break; //0번 입력하면 프로그램 끝 ~!
			}
			
		}
		
	}
		//score 출력 
		//static 내부 사용 
		
		static void showMenu() {
			//전체 선택할 메뉴 (성적을 입력할 것인가, 삭제할 것인가 )
			System.out.println("----------------------------");
			System.out.println("1. 전체 성적 조회");
			System.out.println("2. 성적 등록");
			System.out.println("3. 성적 검색");
			System.out.println("4. 성적 삭제");
			System.out.println("0. 종료");
			System.out.println("----------------------------");
		// 종료를 제외한 나머지는 메소드를 만들어서 실행 해야함. 
		

	}
		// 메소드 만들기 
		static void showAllScores() {
			System.out.println("전체 성적 조회");
			if(scoreData.length == 0) { // data 0
				System.out.println("저장된 성적데이터가 없습니다.");
				return;
			}
			
			for(int i=0;i<scoreData.length;i++) {
				if(scoreData[i] != null) {
					System.out.print(( i + 1) + "번 - ");
					scoreData[i].show(); //출력 
				}
			}
			
		}
		static void registerScore() {
			System.out.println("성적 등록");
			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("자바 : ");
			int java = sc.nextInt();
			System.out.print("국어 : ");
			int kor = sc.nextInt();
			System.out.print("영어 : ");
			int eng = sc.nextInt();
			System.out.print("수학 : ");
			int math = sc.nextInt();
			
			//score data 배열  
			//new ScoreData(name,java,kor,eng,math); //선언 
			for(int i=0;i<10;i++) {
				if(scoreData[i] == null) {
					scoreData[i] = new ScoreData(name,java,kor,eng,math);
					System.out.println("등록 완료");
					break;
				}
			}
			
		}
		static void searchScoreByName() {
			System.out.println("성적 검색");
			System.out.print("검색할 이름을 입력하세요.");
			String name = sc.next();
			boolean found = false;
			for(int i = 0; i<10; i++) {
				if(scoreData[i] != null && (scoreData[i].name).equals(name)) {
					System.out.println(name + "을(를) 찾았습니다.");
					scoreData[i].show();
					found = true;
					break;
				}
				
				}
			 if (!found) {
				 System.out.println("이름 검색 실패");
			
			}
		}
		static void deleteScoreByName() {
			System.out.println("성적 삭제");
			System.out.println("삭제할 성적데이터의 번호를 입력하세요 : ");
			int select = sc.nextInt();
			
			if(scoreData[select - 1] == null) {
				System.out.println("일치하는 성적데이터가 없습니다.");
				return; // deletScoreByName이 return으로 인하여 바로 적용됨
			}else {
				scoreData[select - 1] = null;
				System.out.println("성적데이터가 삭제 되었습니다.");
			}
		}

}











