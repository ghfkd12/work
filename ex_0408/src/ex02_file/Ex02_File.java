package ex02_file;

import java.io.File;
import java.util.Arrays;

public class Ex02_File {
	public static void main(String[] args) {
		String path = "D:\\full_stack_PY\\java";
		
		File f = new File(path);
		
		// isDirectory()
		// 경로의 최종목적지가 폴더면 true
		if(f.isDirectory()) {
			// list();
			// 디렉토리안에있는 하위 요소들의 이름을 반환
			String[] names = f.list();
			
			System.out.println(Arrays.toString(names));
		}
	}
}
