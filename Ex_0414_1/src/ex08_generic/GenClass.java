package ex08_generic;

import java.util.ArrayList;
import java.util.List;

public class GenClass {
	public static void main(String[] args) {
		// 불공변성
		// 타입간 상속관계가 있어도, 제네릭으로 감싸진 타입은
		// 서로 별개의 타입으로 취급된다.
		// 이를 통해, 예상치 못한 타입 혼란과 런타임 오류를 미연에 방지할 수 있다.
		
		// 가정 : List<Integer>가 List<Number>의 하위타입이라고 가정
		List<Integer> intlist = new ArrayList<>();
		
		// 만약 허용된다면, 아래와같이 할당이 가능
//		List<Number> numberList = intList;
		
//		numberList.add(3.14);
		
//		Integer value = intList.ger(0); // 런타임 에러가 발생할 수 있다.
	}
	
}
