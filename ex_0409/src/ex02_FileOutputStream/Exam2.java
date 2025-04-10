package ex02_FileOutputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

// 학생의 이름과 점수를 입력받아 scores.txt저장
// 이어쓰기를 한다.
// 마지막에는 파일 내용을 읽어 콘솔에 출력하는 기능 구현하기
public class Exam2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		FileOutputStream fos = null;
		
		FileInputStream fis = null;
		
		String name;
		String score;
		String res = "";
		try {
			while(true) {
				fos = new FileOutputStream("D:\\full_stack_PY\\java\\scores.txt",true);
				System.out.println("이름 : ");
				name = sc.nextLine();
				
				if(name.equalsIgnoreCase("exit")) {
					System.out.println("프로그램 종료");
					break;
				}
				
				System.out.println("점수 : ");
				score = sc.nextLine();
				
				String line = name + " : "+ score + "\n";
				res += name + " : "+ score + "\n";
				
				fos.write(line.getBytes());
				System.out.println("저장 완료");
				
			} 
//			System.out.println(res);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		// 파일내용 읽어오기
		try {
			File f = new File("D:\\full_stack_PY\\java\\scores.txt");
			fis = new FileInputStream(f);
			byte[] buffer = new byte[(int)f.length()];
			fis.read(buffer);
			String content = new String(buffer,"UTF-8");
			System.out.println(content);
		} catch (Exception e) {
			
		} finally {
			try {
				if(fis != null) {
					fis.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}
}
