package ex04_FileWriter;

import java.io.FileWriter;

public class Ex01_FileWriter {
	public static void main(String[] args) {
		
		FileWriter fw = null;
		
		try {
			// 파일 정해주고 파일 없으면 생성도 해준다.
			fw = new FileWriter("D:\\full_stack_PY\\java\\fileWriter예제.txt");
			
			// 파일에 내용 작성
			fw.write("첫번째줄 작성합니다.\n");
			fw.write("두번째줄 작성합니다.\n");
			
			fw.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
