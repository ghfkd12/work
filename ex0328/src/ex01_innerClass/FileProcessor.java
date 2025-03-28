package ex01_innerClass;

import java.util.List; // 배열 확장

// 요구사항
// 어떤 메서드에서 텍스트 파일 처리
// 처리 도중에 줄 수를 세주는 기능이 필요하다
// 이 기능은 다른곳에서 사용되지 않는다.
// -> 지역내부 클래스로 캡슐화를 하자.

public class FileProcessor {
	public void processFile(List<String> lines) {
		class LineCounter{
			
	
			int countLines(){
				return lines.size();
			}
		}
		
		LineCounter counter = new LineCounter();
		int totalLines = counter.countLines();
		
		System.out.println("총 줄 수 : "+totalLines);
		
		for(String line : lines){ // 향상된 for 문
			System.out.println("▶"+ line);
		}
	}
}
