
public class TvsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TvCaption ctv = new TvCaption();
		ctv.displayCaption("코리아아이티");
		ctv.caption = true;
		ctv.displayCaption("코리아아이티");
          //코리아아이티
		
		ctv.channel = 10;
		System.out.println(ctv.channel); //10
		ctv.channelUp(); //11
		System.out.println(ctv.channel);
		
		TV3D tv3 = new TV3D();
		tv3.dispaly3d();
		tv3.tv3d = true; //활성화 된 것 
		
		
		tv3.channel = 20;
		System.out.println(tv3.channel); //20
		tv3.channelDown(); 
		System.out.println(tv3.channel); //19

	}

}
