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
		
		while(true) {

			System.out.println("id : ");
			String id = sc.next();
			System.out.println("pw : ");
			int pw = sc.nextInt();
					
			
			
		}
	}
}
