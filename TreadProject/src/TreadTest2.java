import javax.swing.JOptionPane;

public class TreadTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 싱글 스레드 형식 
		
		Thread2_1 th1 = new Thread2_1();
		th1.start();
		
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요."); // java prompt
		System.out.println("입력하신 값은 "+ input + "입니다.");
		
		

	}

}
