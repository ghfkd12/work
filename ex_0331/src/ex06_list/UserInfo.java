package ex06_list;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInfo {

	
	private String id;
	private int pw;
	
//	public void userId(String userId) {
//		this.id = userId;
//	}
//	
//	public void userPw(String userPw) {
//		this.pw= userPw;
//	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setPw(int i) {
		this.pw = i;
	}
	
	public String getId() {
		return id;
	}
	
	public int getPw() {
		return pw;
	}
	
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("아이디 생성 : ");
		System.out.println("패스워드 입력 : ");
		
		while(true) {
			String id = sc.next();
			String pw = sc.next();
			System.out.println(id);
			System.out.println(pw);
			
		}
		
	}
	
}
