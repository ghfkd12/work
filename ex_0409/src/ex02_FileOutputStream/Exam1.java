package ex02_FileOutputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

// 학생의 이름과 점수를 저장하는 프로그램
// 이름과 점수를 FileOutputStream을 이용하여 scores.txt파일에 저장

// 요구사항
// 1. 사용자로부터 이름과 점수를 입력받는다(Scanner)
// 2. 입력받은 데이터를 "이름 : 점수 \n" 형식으로 문자열로 만들어
// 파일에 쓴다 
// ex)"김철수 : 84점"
// 3. 이름에 exit를 입력하면 프로그램 종료
// 4. 파일은 scores.txt로 저장되며, 기존내용은 덮어씁니다
// 5. "이름 : 점수" 형식의 문자열의 각 문자의 char값을 +3을 해 암호화 한다.

public class Exam1 {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		FileInputStream fis = null;
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		String score;
		
		try {
			fos = new FileOutputStream("D:\\full_stack_PY\\java\\scores.txt");
			while(true) {
				System.out.println("학생 이름 : ");
				name = sc.nextLine();
				// 대문자 무시하고 값을 검증
				if(name.equalsIgnoreCase("exit")){
					System.out.println("프로그램 종료");
					break;
				}
				System.out.println("점수 : ");
				score = sc.nextLine();
				
				
				String line = name + " : " + score +"\n";
				String asd = "";
				for(int i = 0; i < line.length(); i++) {
//					System.out.println("char : " + (char)(line.charAt(i)+3));
					
					asd += (char)(line.charAt(i)+3);
//					System.out.println("asd : " + asd);
				}
				
				fos.write(asd.getBytes());
				System.out.println("저장 완료");
//				score = sc.nextInt();
//				System.out.println(name+" : "+score);
				
				
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		} finally{
			try {
				
				if(fos != null) {
					fos.close();
				}
			} catch (Exception e2) {

			}
			
		}
		// 복호화를 해서 콘솔에 출력하기
		
		
		try {
			File f = new File("D:\\full_stack_PY\\java\\scores.txt");
			fis = new FileInputStream(f);
			byte[] b_read = new byte[(int)f.length()];
			fis.read(b_read);
			String res = "";
			for(int i = 0; i < f.length(); i++) {
				
			}
			} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
