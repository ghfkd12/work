package ex06_list;

import java.util.ArrayList;
import java.util.Scanner;

public class UserMain {
	public static void main(String[] args) {
		ArrayList<UserInfo> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("아이디 생성");
			UserInfo ui = new UserInfo();
			ui.setId(sc.next());
			
			System.out.println("비밀번호 입력 : ");
			ui.setPw(sc.nextInt());
		}
	}

}
