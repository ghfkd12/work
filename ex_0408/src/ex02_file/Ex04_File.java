package ex02_file;

import java.io.File;

public class Ex04_File {
	public static void main(String[] args) {
		String path = "D:\\full_stack_PY\\java\\test.txt";
		
		File f = new File(path);
		
		if(f.exists()) {
			System.out.println("파일 이름 : "+f.getName());
			System.out.println("절대 경로 : "+f.getAbsolutePath());
		}
	}
	
	// 폴더생성은 가능하지만 폴더생성은 불가능하다.
}
