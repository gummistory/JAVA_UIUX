package com.list;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		// Queue테스트 
		// FIFO 선입 선출 
		// offer 
		
		Queue q = new LinkedList();
		
		q.offer("0");
		q.offer("1");
		q.offer("2");
		
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
	}

}
