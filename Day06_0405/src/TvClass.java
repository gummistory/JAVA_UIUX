
public class TvClass {

	

		   public static void main(String[] args) {
		      Tv t = new Tv(); // 객체생성(메모리 로딩)

		      t.color = "red"; // 멤버변수의 초기화
		      t.power = true;
		      t.channel = 10;

		      System.out.println(t.channel);

		      t.channelup(); // 메소드의 호출

		      System.out.println(t.channel);

		      //

		      Tv t2 = new Tv();
		      t2.color = "blue";
		      System.out.println(t2.color);

		      System.out.println(t.color);

		      t2 = t;

		      t2.color = "black";

		      System.out.println(t.color);
		      System.out.println(t2.color);

		      System.out.println(t);
		      System.out.println(t2);
		   }
		}