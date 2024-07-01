import java.net.Socket;
import java.net.UnknownHostException;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public class TcpIpClient {

	public static void main(String[] args) {
		// 서버의 ip주소와 포트 번호를 알면 됨 
		
		String serverIp = "192.168.108.141";
		
		System.out.println("서버에 연결중입니다. 서버IP : " + serverIp );
		
		// 서버와 통신할 수 있는 소켓 생성 ( ip 주소 + 포트 번호 ) 
	
		try {
			Socket socket = new Socket(serverIp,7777);
			
			InputStream in = socket.getInputStream(); // 보조 스트림 
			DataInputStream dis = new DataInputStream(in);
			
			System.out.println("서버로부터 받은 메세지 : " + dis.readUTF());
			System.out.println("연결 종료");
			
			dis.close();
			socket.close();
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		//서버에 연결 요청 

		
	}

}
