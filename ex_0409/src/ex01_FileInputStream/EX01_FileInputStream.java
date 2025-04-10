package ex01_FileInputStream;

import java.io.IOException;
import java.util.Scanner;

public class EX01_FileInputStream {
	public static void main(String[] args) {
		byte[] keyboard = new byte[100];
		
		System.out.println("값 : ");
		
		// Scanner sc = new Scanner(System.in);
		// System = System 클래스
		// in = InputStream 객체를 의미한다.
		// 외부에서 뭔가를 읽어오겠다는 의미이다.
		// System.in : 표준 입력 스트림
		
		// 표준 입력 스트림
		// 자바에서 프로그램이 외부로부터 데이터를 입력받을 수 있게 해주는
		// 기본통로
		// 기본대상 : 키보드
		
		// 사용자가 키보드로 입력한 값을 keyboard 배열에 저장
		// 사용자가 엔터를 입력할 때 까지 입력을 받는다.
		// 엔터키 값까지 포함되어 저장
		try {
			System.in.read(keyboard);
			
			String s = new String(keyboard).trim();
			System.out.println(s);
			
//			Scanner sc = new Scanner(System.in);
			
			// Scanner(System.in)    vs    System.in.read()
			// 문자 단위로 입력			       바이트 단위 입력
			// 다양한 타입(String,int...)    Int(0~255)또는 byte[]
			// nextLine으로 여러줄 처리 가능   직접처리해야한다.
			
			
			// sc.close(); -> System.in을 닫는다는 의미
			// in이 static이고 메모리에 한번만 올라가기 때문에
			// 닫아버리면 프로그램 전체에서 더 이상 키보드 입력이
			// 불가능해진다.
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
