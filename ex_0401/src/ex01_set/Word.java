package ex01_set;

import java.util.HashSet;
import java.util.Scanner;

public class Word {
	public static void main(String[] args) {
		// 사용자가 입력한 문장에서 단어가 중복되었는지 검사하기
		// 예시
		// I LOVE AND I LOVE CODING
		// 중복단어 있음
		
		Scanner sc = new Scanner(System.in);
		
//		HashSet<String> hs = new HashSet<>();
//		
//		System.out.println("단어 입력 : ");
//		String word = sc.next();
//
//		System.out.println(sc.next());
//		
//		if(hs.equals(word)) {
//			hs.add(word);
//			System.out.println("중복 단어 있음");
//		}
		
		System.out.println("문장을 입력 :");
		
		String input = sc.nextLine();
		
		String[] words = input.split(" ");
		
		HashSet<String> wordSet = new HashSet<String>();
		
		boolean hasDuplicata = false;
		
		// boolean add(E e)
		// 잘 들어갔으면 true, 중복되면 false 반환
		for(String word : words) {
			if(!wordSet.add(word)) {
				hasDuplicata = true;
				break;
				
			}
		}
		if(hasDuplicata) {
			System.out.println("중복 단어 있음");
		} else {
			System.out.println("중복 단어 없음");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
