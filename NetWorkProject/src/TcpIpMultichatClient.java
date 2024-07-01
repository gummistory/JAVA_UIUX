import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TcpIpMultichatClient {

   public static void main(String[] args) throws UnknownHostException, IOException {
      // client
      String serverIp = "192.168.5.101";

      // 이름
      Scanner sc = new Scanner(System.in);
      System.out.print("이름을 입력하시오 >>  ");
      String name = sc.next();

      Socket socket = new Socket(serverIp, 7777);
      System.out.println("서버에 연결되었습니다.");

      // 메세지를 전송
      Thread sender = new Thread(new ClientSender(socket, name));
      // 메세지를 수신
      Thread receiver = new Thread(new ClientReceiver(socket, name));

      sender.start(); // thread 클래스의 스타트
      receiver.start();

   } // main 함수 끝

   // 내부 클래스
   static class ClientSender extends Thread {

      Socket socket;
      DataOutputStream out;
      String name;

      // 초기화
      public ClientSender(Socket socket, String name) {
         this.socket = socket;
         this.name = name;
         try {
            out = new DataOutputStream(socket.getOutputStream());

         } catch (Exception e) {

         }
      }

      // thread 클래스
      @Override
      public void run() {
         // 데이터 보내는 작업
         // 채팅 문자 보내기
         Scanner sc = new Scanner(System.in);
         try {
            if (out != null) {
               out.writeUTF(name);
            }
            while (out != null) {
               out.writeUTF("[" + name + "]" + sc.nextLine());
            }

         } catch (Exception e) {

         }

      }

   }

   static class ClientReceiver extends Thread {
      // thread 클래스

      Socket socket;
      DataInputStream in;
      String name;

      // 초기화
      public ClientReceiver(Socket socket, String name) {
         this.socket = socket;
         try {
            in = new DataInputStream(socket.getInputStream());

         } catch (Exception e) {

         }
      }

      @Override
      public void run() {
         while (in != null) {

            try {
               System.out.println(in.readUTF());
            } catch (IOException e) {
               e.printStackTrace();
            }
         }
      }// run 끝

   }// ClientReceiver 끝

}
