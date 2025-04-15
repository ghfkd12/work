package ex02_bufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex02_BufferedReader {
	public static void main(String[] args) {
		// BufferedReader를 이용해서 키보드에서 값을 입력받는다.
		// 장점 : Scanner보다 속도가 빠르다.
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		// 키보드로부터 읽어옴
		try {
			System.out.println("문자열 입력 : ");
			String str = reader.readLine();
			
			// 정수 입력
			System.out.println("정수 입력 : ");
			int n = Integer.parseInt(reader.readLine());
			
			System.out.println("문자열 : "+str);
			System.out.println("정수 : "+n);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 원칙대로면 close()를통해 닫아줘야 하는데,
		// Scanner 할때처럼 System.in은 닫으면 별로 좋지않다.
		// why? : static이기 때문이다.
		// System.in을 받아서 사용하는 다른 객체들이 못쓰게 된다.
	}
}
