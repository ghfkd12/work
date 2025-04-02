package ex03_Map;

import java.util.HashMap;
import java.util.Scanner;

public class Ex02_Map {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("kim", 1111);
		map.put("lee", 2222);
		map.put("park", 3333);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("id : ");
		String id = sc.next();
		System.out.println("pw : ");
		int pw = sc.nextInt();
					
		if(!map.containsKey(id)) {
			System.out.println("아이디가 없습니다");
		} else {
			if(map.get(id) != pw ) {
				System.out.println("비밀번호 불일치");
			} else {
				System.out.println("로그인 성공");
			}
		}
		
		
		
		
		
	}
}
