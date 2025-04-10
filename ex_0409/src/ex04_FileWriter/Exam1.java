package ex04_FileWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
		// 메모장 프로그램 만들기
		// 사용자가 키보드로 입력한 내용을 "memo.txt"에 저장하고
		// 입력이 종료되면 해당 파일의 내용을 다시 읽어서 화면에 출력하기
		// 사용자로부터 여러줄의 텍스트를 입력받는다.
		// 사용자가 exit를 입력하면 종료합니다.
		Scanner sc = new Scanner(System.in);
		FileWriter fw = null;
		FileReader fr = null;
		List<String> lines = new ArrayList<>();
		
		
		try {
			fw = new FileWriter("D:\\full_stack_PY\\java\\memo.txt");
			System.out.println("입력할 내용 : ");
			
			while(true) {
				System.out.print("> ");
				String line = sc.nextLine();
				if(line.equalsIgnoreCase("exit")) {
					System.out.println("종료");
					break;
				}
				
				// 메모장에 쓰기전에 ArrayList에 추가
				lines.add(line);
				
				fw.write(line+"\n");
			}
			System.out.println("저장완료");
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(fw != null) {
					fw.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	
		System.out.println("저장된 내용 출력");
		
		// 단어별 빈도수 계산
		// hello world
		// hello java
		// i love java
		
		Map<String, Integer> wordCount = new HashMap<>();
		
		for(String line : lines) { 
			String[] word = line.toLowerCase().split(" ");
			for(String words : word) {
				if(words.isEmpty()) continue;
					wordCount.put(words, wordCount.getOrDefault(words,0)+1 );
				
			}
		}
		
		// result.txt에 저장
		try {
			fw = new FileWriter("D:\\full_stack_PY\\java\\result.txt");
			for(Map.Entry<String,Integer> entry : wordCount.entrySet()) {
				fw.write(entry.getKey()+" : "+ entry.getValue()+"\n");
			}
			System.out.println("단어 빈도수 저장 완료");
			fw.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		try {
			fr = new FileReader("D:\\full_stack_PY\\java\\memo.txt");
			int read = 0;
			while((read = fr.read())!= -1) {
				System.out.print((char)read);
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if(fr != null) {
					fr.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
