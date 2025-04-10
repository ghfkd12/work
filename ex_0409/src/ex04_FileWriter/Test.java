package ex04_FileWriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		 //메모장 프로그램 만들기
	      //사용자가 키보드로 입력한 내용을 "memo1.txt"에 저장하고
	      //입력이 종료되면 해당 파일의 내용을 다시 읽어서 화면에 출력하기
	      //사용자로부터 여러 줄의 텍스트를 입력받는다.
	      //사용자가 exit 입력하면 종료합니다.
	            
//	      메모 입력 (exit 입력 시 종료):
//	         > 오늘 날씨가 좋다.
//	         > 내일은 시험이다.
//	         > exit
	//
//	         저장 완료. 저장된 메모 내용:
//	         오늘 날씨가 좋다.
//	         내일은 시험이다.
	      
	//단어의 빈도수
	//오늘 : 1
	//날씨가 : 1
	//좋다 : 1
		
		Scanner sc = new Scanner(System.in);
		
		FileWriter fw = null;
		FileReader fr = null;
		String line;
		
		try {
			fw = new FileWriter("D:\\full_stack_PY\\java\\memo1.txt");
			System.out.println("입력 : ");

			while(true) {
				System.out.print("> ");
				line = sc.nextLine();
				if(line.equalsIgnoreCase("exit")) {
					System.out.println("종료");
					break;
				}
				fw.write(line+"\n");
			}
			System.out.println("저장완료");
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			if(fw != null ) {
				try {
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		try {
			fr = new FileReader("D:\\full_stack_PY\\java\\memo1.txt");
			 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
