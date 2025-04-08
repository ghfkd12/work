package ex02_file;

import java.io.File;

public class Ex03_File {
	public static void main(String[] args) {
		String path = "D:\\full_stack_PY\\java\\aaa\\bbb";
		
		File f1 = new File(path);
		
		// exists()
		// 목적지까지의 경로가 존재하면 true
		if(!f1.exists()) {
			System.out.println("폴더 생성");
			// mkdirs()
			// 복수의 폴더를 생성해준다.
			f1.mkdirs();
		}
		
		// File클래스의 역할
		// 폴더를 만들어 준다거나
		// 목적지까지의 검증(파일인지, 폴더인지, 존재하는지)
		// 폴더,폴더 일때 목록의 반환
		// 목적지의 크기도 반환해준다.
		
		// 내용을 읽거나 쓰는 기능은 없다.
		
	}
	
	
}
