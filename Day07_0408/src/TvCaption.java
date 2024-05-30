
public class TvCaption extends Tvs{ //자식 클래스 extends > 상속받는다 Tvs 를 
	 boolean caption;
	 
	 void displayCaption(String text) {
		 if(caption) {
			  System.out.println(text);
		 }
	 }

}
