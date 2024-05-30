package project;
import java.util.Scanner;

public class BookTest {
	
	
	static Bookres[] bookres = new Bookres[10];
	static Scanner sc = new Scanner(System.in);
	static Person[] person = new Person[10];
	
	
	

	public static void main(String[] args) {
		//static끼리는 바로 출력 가능하다. 
		
		//showMenu(); 잘 출력되는지 바로 출력 가능 
		// while (true), if , switch 무한 반복문 사용
		
	
		 while(true) {
	         showMenu();
	         int num = sc.nextInt();
	         if(num == 1) {
	            showAllBooks();
	         }
	         else if(num == 2) {
	            registerBooks();
	         }
	         else if(num == 3) {
	            searchBookByTitle();
	         }
	         else if(num == 4) {
	            reservationBooks();
	         }
	         else if(num == 5) {
	            inquirRes();
	         }
	         else if(num == 0) {
	            System.out.println("프로그램 종료");
	            break;
	         }
	         else {
	            System.out.println("숫자를 다시 입력하세요.");

			}
		}
	}

	   static void showMenu() {
		System.out.println("-----------------------");
		System.out.println("1. 전체 도서 조회");
        System.out.println("2. 도서 등록");
        System.out.println("3. 도서 검색");
        System.out.println("4. 도서 예약");
        System.out.println("5. 예약 조회");
        System.out.println("0. 종료");
        System.out.println("-----------------------");
		   
	   }
	
	   static void showAllBooks() {
		   System.out.println("1. 전체 도서 조회");
		      if (bookres.length == 0) {
		         System.out.println("검색된 도서가 없습니다.");
		         return;
		      }
		      for (int i = 0; i < bookres.length; i++) {
		         if (bookres[i] != null) {
		            System.out.println((i + 1) + "번 -");
		            bookres[i].show();
		         }
		      }
	      
	   }
	   
	   static void registerBooks() {
		   System.out.println("도서 등록");
		    System.out.println("책 제목 : ");
		    String title = sc.next();
		    System.out.println("작가 : ");
		    String artist = sc.next();
		    int period = 7; // 대여 기간을 7일로 지정
		   // System.out.println("대여 기간: " + period + "일"); // 대여 기간 출력
		   

		    // bookres 배열에서 비어있는 위치에 책을 등록
		    for (int i = 0; i < bookres.length; i++) {
		        if (bookres[i] == null) {
		            bookres[i] = new Bookres(title, artist, period, true);
		            System.out.println("등록 완료");
		            return; // 등록이 완료되면 메서드 종료
		        }
		    }

		   
		}
	   
	   static void searchBookByTitle() {
	      
		   System.out.println("도서 검색");
		      System.out.print("도서 제목 검색 : ");
		      String title = sc.next();
		      
		      boolean found = false;
		      
		      for(int i = 0;i<10;i++) {
		         if(bookres[i]!=null && (bookres[i].title).equals(title)) {
		            bookres[i].show();
		            found = true;
		         }
		      }
		      if(!found) {
		         System.out.println("도서를 찾지 못했습니다.");
		      }
		   
	   }
	   
	   static void reservationBooks() {
		   System.out.println("도서 예약");
		   System.out.println("책 제목을 입력하세요 : ");
		   String title = sc.next();
		   
		   for(int i = 0; i<10 ; i++) {
		         if(bookres[i]!=null && (bookres[i].title).equals(title)) {
		            if(bookres[i].bookRes == true) {
		               System.out.println("예약 가능합니다.");
		               
		               System.out.print("대여자 이름을 입력해주세요 : ");
		               String name = sc.next();
		               System.out.print("대여자 전화번호를 입력해주세요 : ");
		               String phone = sc.next();
		               
		               if(person[i] == null) {
		                   person[i] = new Person(name, phone,title);
		                   System.out.println("정보 입력 완료");
		                  
		                }
		                   System.out.println("예약이 완료되었습니다.");
		                   bookres[i].bookRes = false;
		                   break;
		                }
		                else if(bookres[i].bookRes == false) {
		                   System.out.println("예약이 불가능합니다.");
		                   break;
		                }

			   }
		         else {
		             System.out.println("책을 찾을 수 없습니다.");
		             break;

		         }
			   
		         }
		   }
	   
	   static void inquirRes() {
		      System.out.println("예약 조회");
		      System.out.print("이름을 입력하세요 : ");
		      String name = sc.next();
		      
		      boolean found = false;
		      
		      for(int i = 0; i < 10 ; i++) {
		         if(person[i] != null && (person[i].name).equals(name)) {
		            person[i].show();
		            found = true;
		         }
		         if(!found) {
		            System.out.println("예약된 정보를 찾을 수 없습니다.");
		            break;
		     
		         }
		      }
		   }
	   
	   
  
}
