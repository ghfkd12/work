package ex05_Generic;

public class GenEx<T> {
	
	// 타입이 들어가는곳은 전부 제네릭변수가 들어갈 수 있다.
	// 무조건이 아니고 쓰고싶은곳에 쓰면 된다.

	T value;
	
	public void setValue(T value) {
		this.value = value;
	}
	
	public T getValue() {
		return value;
	}

	
}
