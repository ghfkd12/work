package ex02_lamda;

// 함수형 인터페이스가 되기 위한 조건
// 무조건 추상 메서드가 1개여야 한다.
// 컴파일러에 함수형 인터페이스라는걸 알려야 한다.

@FunctionalInterface // 어노테이션을 선언한 순간 인터페이스에는 '무조건' 1개의 추상메서드가 있어야 한다. 
public interface MyCalculator {
	int plus(int num1, int num2);
}
