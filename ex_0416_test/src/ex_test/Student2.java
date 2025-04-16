package ex_test;

import java.util.Scanner;

public class Student2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		int kor;
		int eng;
		int math;
		
		try {
			while(true) {
				System.out.println("이름 : ");
				name = sc.nextLine();
				
				System.out.println("국어 : ");
				kor = sc.nextInt();
				
				System.out.println("영어 : ");
				eng = sc.nextInt();
				
				System.out.println("수학 : ");
				math = sc.nextInt();
				
				
				int total = (kor+eng+math)/3;
				
				if(total >= 80) {
					System.out.println("이름 : "+name + "점수 : "+total);
					
				}
			}
		} catch (Exception e) {
			System.out.println("잘못된 입력입니다");
		} finally {
			sc.close();
		}

	}
}
