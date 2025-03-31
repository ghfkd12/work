package ex06_list;

import java.util.Scanner;
import java.util.ArrayList;

public class Exam1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> list = new ArrayList<>();
		
//		System.out.println("아이디 생성 : ");
//		String x = sc.next();
	
		
//		for(int i = 0; i < list.add(sc.next()); i++) {
//			System.out.println("아이디 생성 : "+x);
//		}
		
		while(true) {
			System.out.print("아이디 생성 : ");
			list.add(sc.next());
			for(String id : list) {
				System.out.println(id+" ");
				for(String id2 : list) {
					if(id.equals(id2)) {
						

					}
				}
			} 
			System.out.println();
			
			if(list.size() == 5) {
				break;
			} 	
		}
		
		
	}
}
