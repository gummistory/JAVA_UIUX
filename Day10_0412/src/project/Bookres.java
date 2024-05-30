package project;

public class Bookres implements BookAv {	
		
		String title; //책 제목
		String name;  // 대여 이름 
		String phone;    // 연락처 
		String artist; // 작가 
		int period = 7; // 기간 
		boolean bookRes; // 예약 가능 여부
		
		
		public Bookres(String title, String artist, int period, boolean bookRes) {
			super();
			this.title = title;
			this.artist = artist;
			this.period = period;
			this.bookRes = bookRes;
		}
		
		void show() {
			System.out.println(" 책 제목 : " + title);
			System.out.println(" 작가 : " + artist);
			System.out.println(" 대여기간 : " + period);
	      if(bookRes == true) {
	        System.out.println("예약 가능합니다.");
	     } else
	        System.out.println("예약 불가능합니다.");

		}
		

		
		
	
		
		
		
		
		

	}


