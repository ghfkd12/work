package ex01_thread;

import java.util.Scanner;

// Scanner를 이용하여 키보드에서 숫자를 입력받고
// 스레드에서 입력받은 숫자부터 1씩 감소하다가 0이 되었을때
// 종료 메세지와 함께 프로그램 종료되도록 만들어보자
// Thread는 ThreadCount에다 작성하기
public class Exam1 {
	public static void main(String[] args) {
//		ThreadCount_T tc = new ThreadCount();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 : ");
		int count = sc.nextInt();
		
		 ThreadCount_T tc = new ThreadCount_T(count);
		
		tc.start();
	}
	
	
	
}
