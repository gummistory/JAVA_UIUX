package exceptions;

import java.util.Scanner;

public class LoginTest {

	public static void main(String[] args) {

		String id = "java";
		String pw = "1234";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("아이디 입력 >> ");
		String userId = sc.next();
		
		System.out.println("비밀번호 입력 >>");
		String userPw = sc.next();
		
		try {
			if(!(userId.equals(id))) {
				throw new LoginidFail("아이디가 일치하지 않습니다.");
			}
			if(!(userPw.equals(pw))) {
				throw new LoginPwFail("비밀번호가 일치하지 않습니다.");
			}
			
			System.out.println("로그인 성공");
		}catch(LoginidFail e) {
			System.out.println(e.getMessage());
			System.out.println("아이디를 확인하세요.");
			//e.printStackTrace();
		}catch(LoginPwFail e) {
			System.out.println(e.getMessage());
			System.out.println("비밀번호를 확인하세요.");
		}
	}

}
