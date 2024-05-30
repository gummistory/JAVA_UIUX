
import java.util.Calendar;
import java.util.Date;

public class DataTest {

	public static void main(String[] args) {
		// 날짜
		// Date, Calendar, 
		
//		Date today = new Date();
//		System.out.println(today);
//		
//		System.out.println(today.getYear() + 1900);
//		System.out.println(today.getMonth()+1); //  0~ 11
		
//		Calendar cal = Calendar.getInstance();
//		System.out.println(cal);
//		
//		System.out.println(cal.get(Calendar.YEAR)); //연 정보 
//		System.out.println(cal.get(Calendar.MONTH ));//달 정보
//		System.out.println(cal.get(Calendar.WEEK_OF_YEAR));
//		System.out.println(cal.get(Calendar.DATE));
//		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
//		
//		System.out.println(cal.get(Calendar.HOUR));
//		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
//		System.out.println(cal.get(Calendar.MINUTE));
//		System.out.println(cal.get(Calendar.SECOND));
//		
//		System.out.println(cal.getActualMaximum(Calendar.DATE));
		
//		Calendar cal = Calendar.getInstance();
//		cal.set(2005, 7, 31);
//		System.out.println(toString(cal));
//		
//		cal.add(Calendar.DATE,1);
//		System.out.println(toString(cal));
//		
//		cal.add(Calendar.MONTH,-6);
//		System.out.println(toString(cal));
//		
//		cal.add(Calendar.DATE, 31);
//		System.out.println(toString(cal));
//		
//		
//		cal.add(Calendar.DATE, 31);
//		System.out.println(toString(cal));
		
		final int[] TIME_UNIT = {3600, 60, 1};
	      final String[] TIME_UNIT_NAME = {"시간", "분", "초"};
	      
	      Calendar time1 = Calendar.getInstance();
	      
	      Calendar time2 = Calendar.getInstance();
		
	      time1.set(Calendar.HOUR_OF_DAY, 10);
	      time1.set(Calendar.MINUTE, 20);
	      time1.set(Calendar.SECOND, 30);
	      
	      
	      time2.set(Calendar.HOUR_OF_DAY, 20);
	      time2.set(Calendar.MINUTE, 30);
	      time2.set(Calendar.SECOND, 10);
	      
	      
	      long difference = Math.abs(time2.getTimeInMillis() - time1.getTimeInMillis()) / 1000;
	      System.out.println("time1과 time2의 차이는" + difference + "초 입니다. ");
	      
	      
	      for(int i = 0;i<TIME_UNIT.length;i++) {
	    	  tmp += difference / TIME_UNIT[i] + TIME_UNIT_NAME[i];
	    	  difference %= TIME_UNIT[i];
	      }
	      System.out.println("시분초의 차이 : " + tmp);
		
	} // main end
	
	public static String toString(Calendar cal) {
		return cal.get(Calendar.YEAR) + "년" + (cal.get(Calendar.MONTH)+1 ) + "월"
				+ cal.get(Calendar.DATE) + "일 " ;
		
	}

}
