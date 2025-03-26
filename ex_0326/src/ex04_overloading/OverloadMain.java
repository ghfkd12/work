package ex04_overloading;

public class OverloadMain {
	public static void main(String[] args) {
		Overload ol = new Overload();
		
		// 같은이름이지만 인자에따라 다른 기능을 하는 메서드를 만들 수 있다.
		ol.result();
		ol.result(100);
		ol.result('a');
		ol.result("문자열",100 );
		ol.result(100,"문자열");
		
		
		
		
		
		
		
		
		
		
	}
}
