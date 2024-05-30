package com.list;

import java.util.Stack;

public class StackExplore {

	//웹 브라우저의 뒤로가기 및 앞으로가기 기능
	public static Stack back = new Stack();
	public static Stack forward = new Stack();
	
	public static void main(String[] args) {
		
		goURL("1.네이트"); 
		goURL("2. 네이버");
		goURL("3. 카카오");
		goURL("4. 구글");
		
		printStatus();
		goBack();
		System.out.println("이전가기 클릭");
		printStatus();
		
		goBack();
		System.out.println("이전가기 클릭");
		printStatus();
		
		
		goForward();
		System.out.println("다음가기 클릭");
		printStatus();
		
		goURL("www.koreait.com");
		System.out.println("새로운 사이트로 이동");
		printStatus();
		
		
	}
	public static void goURL(String url) {
		back.push(url);
		if(! forward.empty()) {
			forward.clear(); //포워드 스택에 있는 모든 정보 지우기 
			
		}
	}
	
	public static void printStatus() {
		System.out.println("back : "+ back);
		System.out.println("forward : " + forward);
		System.out.println("현재 실행 중인 사이트는 "+ back.peek() + " 입니다. ");  //peek : 읽어오기 
	}

   public static void goBack() {
	   if(!back.empty()) {
		   forward.push(back.pop()); //읽어온  데이터를 삭제 
	   }
   }	   
	 public static void goForward() {
		 if(!forward.empty()) {
			 back.push(forward.pop());
		 }
	 }
}
   

