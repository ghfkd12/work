package ex02_exception;

public class Ex01_NullPointerException {
	public static void main(String[] args) {
		String[] strArray = null;
		
		// 생성되지 않은 배열을 출력하려고할 때 예외발생
		System.out.println(strArray[0]);
	}
}
