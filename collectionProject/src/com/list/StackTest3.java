package com.list;

import java.util.Stack;

public class StackTest3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 스택 배열 
		// LIFO
		// pop push
		
		Stack st = new Stack();
		
		st.push("0");
		st.push("1");
		st.push("2");
		
		
		// 공간이 비어있지 않다면 pop을 이용해 꺼내옴 
		while(!st.empty()) {
			System.out.println(st.pop());
			//st.pop(); // pop 하고 삭제 
		}
		
		
	}

}
