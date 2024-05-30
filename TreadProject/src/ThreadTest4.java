import javax.swing.JOptionPane;

public class ThreadTest4 {

	public static void main(String[] args) {
		//   1.  interrupt( )
		// interrupted 속성 (boolean 타입) : interrupt( ) 호출되어지면 변수의 값이 변경 (상태 변경) 
		// 기본값 false -> true 로 변경 
		// isInerrupted( )
		// interrupted 속성값을 반환한다. 
		
		
		//  2. interrupt ( )
			// InterruptedException 타입의 예외를 발생 시킨다. 
			// sleep( ) , wait( ), join( )  일시정지된 스레드를 실행 대기 상태로 만든다 
		
		
		ThreadEx4_1 th1 = new ThreadEx4_1(); //' 생성 
		th1.start(); // 호출 
		
		
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요");
		System.out.println("입력하신 값은 "+ input + "입니다.");
		
	   th1.interrupt(); // interrupted 속성 true로 변경 
	  System.out.println("isInterrupted( ) : "+ th1.isInterrupted());
		
		
	}

}
