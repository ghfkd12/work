package ex03_try_catch;

import java.util.Scanner;

public class Aasd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 사람과 어울리는것이 좋다. 2. 혼자 있는것이 좋다.");
		System.out.println("선택 : ");
		int check = sc.nextInt();
		
		if(check == 1) {
			System.out.println("당신은 E입니다");
		} else if(check == 2) {
			System.out.println("당신은 I입니다.");
		} else if(check != 1 || check != 2) {
			System.out.println("잘못된 숫자입니다");
		} else {
			System.out.println("키보드 입력이 잘못되었습니다");
		}
	}
	
}
