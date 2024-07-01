import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpClient2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String serverIp = "192.168.105.80";
		//String serverIp = "192.168.108.141";
		
		System.out.println("서버에 연결중입니다. 서버IP : " + serverIp );
		
		try {
			Socket socket = new Socket(serverIp,7777);
			
			Sender sender = new Sender(socket);
			Receiver receiver = new Receiver(socket);
			
			sender.start();
			receiver.start();
			
			
		} catch (UnknownHostException e) {	
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
