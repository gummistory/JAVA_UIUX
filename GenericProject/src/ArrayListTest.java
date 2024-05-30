import java.util.ArrayList;

public class ArrayListTest {

   public static void main(String[] args) {
      // TODO Auto-generated method stub

      ArrayList<String> list = new ArrayList<String>();

      list.add("1");
      // list.add(new Integer(1)); // 타입 불일치
      list.add("2");
      list.add("3");

      for (int i = 0; i < list.size(); i++) {
         String s = list.get(i);
         System.out.println(s);
      }

   }

}