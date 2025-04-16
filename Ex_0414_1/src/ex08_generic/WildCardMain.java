package ex08_generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WildCardMain {
	public static void main(String[] args) {
		// 제네릭와일드카드
		// <?> : 어떤 타입이든 될 수 있다는 의미
		// 그냥 ? 만쓰면 그냥 <Object>쓰는것과
		// 다를게 없으므로 보통 제네릭 타입 한정 연산자와 같이 쓴다.
		// < ? extends 상위타입> : 상위타입의 하위개념은 다 들어올 수 있다.
		// ex) <? extends Number> ->Number, Integer, Double, Float
		// 읽기작업에 적합하다. (컬렉션에서 읽은 값이 최소 Number타입으로 보장된다)
		// < ? super 하위타입> : 하위타입의 상위개념은 다 들어올 수 있다.
		// ex) <? super Integer> : Integer, Number, Object
		// 쓰기작업에 적합하다. (최소 Integer타입으로 보장된다.)
		// Integer타입은 안전하게 추가가 가능하다. 
		// 위로 Number, Object로 올라가기 때문에 값의 추가가 안전하다.
		
		List<? extends Number> list = new ArrayList<>();
		
//		Number num = list.get(0);
		
		List<Integer> lists = Arrays.asList(1,2,3);
		
		print(lists);
		
		List<? extends Number> numList = new ArrayList<>();
		
		// ?에 정확한 타입이 뭐가 들어올지 모르기 때문에 값을 함부로 넣으면 안된다. 
//		numList.add(100);
		numList.add(null);
		
		List<? super Integer> iList = new ArrayList<>();
		
		// 최소 Integer는 보장하기 때문에 값을 안전하게 추가 가능
		iList.add(10);
		iList.add(20);
		
		// 읽기 작업 : 읽어온 값이 구체적인 타입을 보장받지 못하기 때문에
		// Object로 처리해야 한다.
		Object value = iList.get(0);
		System.out.println("읽어온 값 : " + value);
		
		// 만약 구체적인 타입(Integer)로 사용하려면, 형변환이 필요하다.
		Integer value2 = (Integer) iList.get(0);
		System.out.println("읽어온 값 : "+ value2);
		
		
		
	}
	
	public static void print(List<? extends Number> list) {
		// 반복문안에 Number,Double,Integer,Float 중 뭐가 올지 모르기에
		// 상위 타입을 적는다
		for(Object e : list) {
			System.out.println(e);
		}
	}
}
