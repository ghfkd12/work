package ex01_set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Bingo {
	public static void main(String[] args) {
		// HashSet을 이용한 5*5의 랜덤 빙고판 만들기
		// 숫자는 1~50까지
		
		HashSet<Integer> hs1 = new HashSet<>();
		
//		while(hs1.size() != 5) {
//			int ran = new Random().nextInt(50)+1;
//			hs1.add(ran);
//			for(int i = 0; i < 5; i++) {
//				for
//				System.out.println(hs1);
//				break;
//			}
////		}
//		
//		while(true) {
//			int ran = new Random().nextInt(50)+1;
//			hs1.add(ran);
//			switch(ran) {
//			case 1:
//				for(int i = 0; i < 5; i++) {
//					System.out.println(hs1);
//					break;
//				}
//			case 2:
//				break;
//			case 3:
//				break;
//			case 4:
//				break;
//			case 5:
//				break;
//			}
//		}
		
			
//			for(int i = 0; i< 5; i++) {
//				
//				for(int j = 0; j <5;) {
//					int ran = new Random().nextInt(50)+1;
//					
//					if(!hs1.contains(ran) ) {
//						hs1.add(ran);
//						 j++;
//					}
//
//				}
//
//
//			}
//			System.out.println(hs1);
		
		int[][] board = new int[5][5];
		// HashSet에 25개의 난수를 채울때까지 돌려라
		while(hs1.size() != 25) {
			hs1.add(new Random().nextInt(50)+1);
		}
		
		// Set은 index가 없기 때문에 하나씩 꺼낼수가 없다.
		// 그렇기 때문에 iterator를 통해서 꺼낸다.
		
		// shuffle(List) 리스트만 받는다
		List<Integer> list = new ArrayList<>(hs1);
		Collections.shuffle(list);
		// hs1으로 랜덤값을 넣었기 때문에 중복값은 어차피 안나온다.
		
		Iterator<Integer> iter = list.iterator();
		
		for(int i = 0; i <board.length; i++) {
			for(int j = 0; j <board[i].length; j++) {
				board[i][j] = iter.next();
				System.out.printf("%02d ",board[i][j]);
			}
			System.out.println();
		}
		
		
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
