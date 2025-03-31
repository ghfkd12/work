package ex01_StringBuilder;

public class Ex01_StringBuilder {
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("Hello");
		
//		원본에 영향을 주는가 안주는가를 잘 알아야함
		
		
		// append()
		// 기존 문자열의 뒤에 삽입
		str.append(" World");
		System.out.println(str);
		System.out.println("문자열의 길이 : "+str.length());
		
		
		// delete
		// 문자열 삭제
		// 원하는만큼 삭제 가능
		str.delete(0, 6); // 실질적으론 0~5까지 삭제
		System.out.println(str);
		System.out.println(str.length());
		
		// insert()
		// 원하는 위치에 문자열을 삽입
		str.insert(0,"Hello ");
		System.out.println(str);
		System.out.println(str.length());
		
		// reverse
		// 문자열을 뒤집어서 출력
		str.reverse();
		System.out.println(str);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
