package ex03_FileInputStream;

import java.io.File;
import java.io.FileInputStream;

public class Exam1 {
	public static void main(String[] args) {
		// file.txt를 만들고
		// 문장을 입력하고 저장을한다.
		// fileInputStream으로 읽어온 뒤, 회문인지 아닌지 검증하세요
		
		String path = "D:\\full_stack_PY\\java\\file.txt";
		
		File f = new File(path);
		
		byte[] b_read = new byte[(int)f.length()]; 
		
		FileInputStream fis = null;
		
		if(f.exists()) {
			try {
				fis = new FileInputStream(f);
				
				fis.read(b_read);
				
				String res = new String(b_read);
				
				StringBuilder stb = new StringBuilder(res);
				stb.reverse();
				
				System.out.println(stb);
				System.out.println(res);
			
				if(stb.equals(res)) {
					System.out.println("회문입니다.");
				} else {
					System.out.println("회문이 아닙니다.");
				}
			} catch (Exception e) {

			}
		}
		
		
		
	}
}
