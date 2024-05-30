package com.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class BingoTest {

	public static void main(String[] args) {
		// 1 ~ 50 난수 중 25개의 숫자를 중복없이 2차원 배열에 저

		Set set = new HashSet();
	      int[][] board = new int[5][5];

	      for (int i = 0; set.size() < 25; i++) {
	         set.add((int) (Math.random() * 50) + 1);
//	         int number = random.nextInt(50) + 1;
	      }
//	      System.out.println(set);

	      List list = new ArrayList(set);
	      Collections.shuffle(list);

	      Iterator it = list.iterator();

	      // 2차원 배열
	      for (int i = 0; i < board.length; i++) {
	         for (int j = 0; j < board[i].length; j++) {
	            board[i][j] = (Integer) it.next();
	            System.out.print((board[i][j] < 10 ? "  " : " ") + board[i][j]); // ?
	         }

	         System.out.println();
	      }
		
		
//		while(it.hasNext()) {
//			int num = (Integer)it.next();
//			System.out.println(num+",");
		}
	}


