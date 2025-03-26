package ex07_final;

public class Book {
	
	String title = "홍길동전";
//	int price = 25000;
	
	//final은 변수에도 붙일 수 있다.
	final int PRICE = 25000; // 상수 : 다른값을 대입할 수 없다.
	// 상수는 대개 대문자로 작성한다.
	

	
	
	
	// final 메서드
	// 자식클래스에서 오버라이드 할 수 없다.
	public final void info_title() {
		System.out.println("책의 제목은 : "+title+"책의 가격은 :"+PRICE);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
