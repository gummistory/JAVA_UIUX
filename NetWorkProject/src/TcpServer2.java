import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TcpServer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ServerSocket serverSocket = null;
		Socket socket = null;
		try {
		 serverSocket = new ServerSocket(7777);
		System.out.println("서버가 준비 되었습니다.");
		
		socket = serverSocket.accept();
		
		
		// 데이터 전송
		Sender sender = new Sender(socket);
		
		// 데이터 수신
		Receiver receiver = new Receiver(socket);
		
		
		// 2개의 thread가 돌아가는 프로그램 
		
		sender.start();  // thread 실행 
		receiver.start();	// 데이터 받는 역활 ,stream이 Null 이 아닐때까지 
		
		}catch(IOException e){
			e.printStackTrace();
			
		}

	}

}

// 계속 데이터가 돌아야하니 쓰레드 이용
class Sender extends Thread {
	
	Socket socket;
	DataOutputStream out;
	String name;
	
	public Sender(Socket socket) {
		this.socket = socket; // stream 정보가 존재 
		
		try {
		out = new DataOutputStream(socket.getOutputStream());
		name = "["+socket.getInetAddress()+":"+socket.getPort()+"]"; //누가 접속을 하고 누가 보냈는지 확인을 할 수 있다 
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void run() { // 실제기능은 run 메소드에서 정의 
		Scanner sc = new Scanner(System.in);
		
		while(out != null) { //예외처리 안하면 사용 할 수 가 없음 
			try {
				System.out.println(">>");
				out.writeUTF(name +sc.nextLine());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
}
class Receiver extends Thread {
	
	
	Socket socket;
	DataInputStream in;
	
	
	public Receiver(Socket socket) {
		this.socket = socket; // stream 정보가 존재 
		try {
			in = new DataInputStream(socket.getInputStream());
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	@Override
	public void run() { // 받는 것 
		
		while(in != null) {
			try {
			System.out.println(in.readUTF());
			
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
