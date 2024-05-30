import java.util.Scanner;
public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 예제 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나 입력 : ");
		int num1 = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("연산자 하나 입력(+,-,x,/ ):");
		String op = sc.nextLine();
		System.out.println("정수 하나 입력 : ");
		int num2 = sc.nextInt();
		
        switch(op) {
        case "+":System.out.println(num1 + num2);
        break;
        case "-":System.out.println(num1 - num2);
        break;
        case "x":System.out.println(num1 * num2);
        break;
        case "/":System.out.println(num1 / num2);
        break;
        default:System.out.println("연산자가 잘못 선택됨");
    
        }

	}

}
