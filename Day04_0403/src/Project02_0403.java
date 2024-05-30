import java.util.Scanner;
public class Project02_0403 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//      Scanner sc = new Scanner(System.in);
//      while(true) {
//         
//         System.out.println("1. 짜장면 2. 김치찌개 3.돈까스 4.종료");
//         System.out.println("선택>>");
//         int sel = sc.nextInt();
//         
//         if(sel == 1) {
//            System.out.println("오늘의 메뉴는 짜장면");
//         }else if(sel == 2) {
//            System.out.println("오늘의 메뉴는 김치찌개");
//         }else if(sel == 3) {
//            System.out.println("오늘의 메뉴는 돈까스");
//         }else if(sel == 4) {
//            System.out.println("종료");
//            break;
//         }
//      } 
//      System.out.println("프로그램 종료");
      
//      for(int i = 1; i <= 5; i++) {
//         
//         if(i == 3) {
//            break;
//         }
//         
//         System.out.println("out for ing");
//      
//         for(int j = 1; j <= 5; j++) {
//            if(j == 2) {
//               break;
//         }
//         System.out.println("hello");
//         }

      // 난수
      // Math.random()
      // 0.0 <= r < 1
      // System.out.println(Math.random()); 
      // System.out.println(Math.random() * 10);
      
//      1 ~ 10 사이의 난수
//      Math.random() * 10 // 0.xx ~ 9.xx
//      (int)Math.random() * 10 // 0 ~ 9
//      (int)(Math.random() * 10) + 1 // 1 ~ 10
//      (int)(Math.random() * 난수의 갯수) + 난수의 최소값
//      난수의 갯수 => 난수의 최대값 - 난수의 최소값 + 1 -> 10 - 1 + 1 // 난수 구하는 공식 
      
//      for (int i = 1; i <= 10; i++) {
//         System.out.println((int) (Math.random() * 10) +1);
//      }
      
      
      // (int) Math.random() * 45 - 1 + 1) + 1 // 1 ~ 45
      
//      int lotto;
//      
//      for(int i = 1; i <= 6 ; i++) {
//         lotto = (int)(Math.random()* 45 - 1 + 1) + 1;
//         System.out.println(lotto);
//      }
      
      // 가위(1), 바위(2), 보(3)
      
//      int com;
//      int me;
//      Scanner sc = new Scanner(System.in);
//      
//      while(true) {
//         com = (int)(Math.random() + 3) + 1;
//         System.out.println("1.가위 2.바위 3.보");
//         System.out.println("입력 >>");
//         me = sc.nextInt();
               
//         if(가위) {
//            if(가위) {}                me  com  r
//            if(가위) {}                1 - 1   0
//            if(가위) {}                1 - 2  -1
//         }else if(바위) {                  1 - 3  -2
//            if(바위) {}
//            if(바위) {}                2 - 1   1
//            if(바위) {}                2 - 2   0 
//         }else if(보) {                2 - 3  -1
//            if(보) {}
//            if(보) {}                3 - 1   2
//            if(보) {}                3 - 2   1
//         }                         3 - 3   0

//         int result = me - com;
//         
//         if(result == -2 || result == 1) {
//            System.out.println("me win");
//            break;
//         }else if (result == -1 || result == 2) {
//            System.out.println("me lose");
//         }else {
//            System.out.println("비김");
//         }
      
         boolean flag = true;
         
         Scanner sc = new Scanner(System.in);
         
         while(flag) {
            System.out.println("입력>>");
            int sel = sc.nextInt();
            if (sel == 1) {
               System.out.println("1번");
            }else if(sel == 2) {
               System.out.println("2번");
            }else if(sel == 3) {
               System.out.println("3번 프로그램 종료");
               flag = false;
            }
		
         }

	}
}
