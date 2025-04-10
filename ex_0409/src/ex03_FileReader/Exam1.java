package ex03_FileReader;

import java.io.FileReader;

public class Exam1 {
	public static void main(String[] args) {
		// text.txt파일을 만들고 한글, 영어(대문자,소문자)섞어서 작성
		// text.txt파일의 내용을 읽어와서
		// 영어 대문자의 개수, 소문자의 개수를 판별하여 출력하시오
		// 대문자 : ??개
		// 소문자 : ??개
		
		FileReader fr = null;
		
		int upper = 0;
		int lower = 0;
		
		try {
			fr = new FileReader("D:\\full_stack_PY\\java\\text.txt");
			
			int code = 0;
//			byte[] buffer = new byte[fr.read()];
			
			
			while((code = fr.read()) != -1) {
				if(code >= 'A' && code <= 'Z') {
					upper++;
				}
				if(code >= 'a' && code <= 'z')
					lower++;
			}
			System.out.println("대문자 개수 : ");
			System.out.println("소문자 개수 : ");
			fr.close();
			
		} catch (Exception e) {

		}
	}
}
