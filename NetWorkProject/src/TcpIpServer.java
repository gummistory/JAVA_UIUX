import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TcpIpServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// network => java.net
		//1. 서버 소켓 생성
		// 예외처리가 필요 try catch 
		ServerSocket serverSocket = null; // 서버 소켓 초
		try {
		serverSocket = new ServerSocket(7777); // server socket 생성시는 포트 번호를 꼭 지정해야함.(0~65535)
		} catch (IOException e) {
			e.printStackTrace();
		} // sever socket 무한 반복 
		while(true) {
			System.out.println(getTime() + " 연결요청을 기다립니다.");
			
			try {
				Socket socket = serverSocket.accept();
				OutputStream out = socket.getOutputStream();
				DataOutputStream dos = new DataOutputStream(out); //main stream 연결 
				
				dos.writeUTF("[Notice] Test Message1 from Server.");
				System.out.println(getTime() + "데이터를 전송했습니다.");
				
				dos.close();
				socket.close(); // 소켓도 클로즈 필수  
				
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

		static String getTime() {
			SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]");
			return f.format(new Date());
		}

}
