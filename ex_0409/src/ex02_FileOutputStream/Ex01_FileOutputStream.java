package ex02_FileOutputStream;

import java.io.FileOutputStream;

public class Ex01_FileOutputStream {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		
		try {
			// 경로에 파일이 없으면 파일을 만들어준다.
			// write를 한 내용까지 작성해 준다.
			// 세이브파일을 만든다거나 저장하는 문서를 만드는 경우 FileOutputStream이 사용이 된다.
			// 확장자도 마음대로 지정할 수 있다.
			
			fos = new FileOutputStream("D:\\full_stack_PY\\java\\fileOut.txt",true); // 뒤에 true를 붙이면 실행한만큼 이어쓰기가 된다.
			
//			fos.write('f'); // 문자는 정수로 표현이 가능해서 써도 된다.
//			fos.write('i');
//			fos.write('l');
//			fos.write('e');
			
			// 바이트 배열 -> 문자열 new String(byte[]b)
			// 문자열 -> 바이트 배열 
			
			String msg = "fileOutput 예제입니다\n";
			String msg2 = "여러줄도 가능\n";
			// 삼중따옴표문법은 java 15부터 사용할 수 있다.
			// 텍스트블록 이라 하며, 여러줄에 걸친 문자열을 작성할 때 사용한다.
			// 줄 끝에 \를 붙이면 줄바꿈 없이 이어서 쓸 수 있다.
			// HTML, JSON등을 쓸 때 유리하다.
			String msg3 = """
						여러줄
						문자열
						리터럴
						 """;
			String msg4 = "asdasdasdas"; 
			
			fos.write(msg.getBytes());
			fos.write(msg2.getBytes());
			fos.write(msg3.getBytes());
			fos.write(msg4.getBytes());
			
			System.out.println("파일 생성 완료");
			
		} catch (Exception e) {

		} finally {
			try {
				if(fos != null) {
					fos.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
