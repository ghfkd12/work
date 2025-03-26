package access;

import ex05_inheritance.DefaultA;

public class PublicB {
	public static void main(String[] args) {
		// Default 클래스가 default제한이라서
		// 다은 패키지에서 만들어 지지 않는다.
		DefaultA a =  new DefaultA();
		a.variableC = 10;
	}
}	
